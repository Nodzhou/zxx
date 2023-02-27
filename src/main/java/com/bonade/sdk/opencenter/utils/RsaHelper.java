package com.bonade.sdk.opencenter.utils;

import com.bonade.sdk.opencenter.exception.ClientException;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**
 * 用于RSA非对称加密，服务端用私钥，客户端用公钥
 * @author jimmy
 *
 */
public class RsaHelper {

	/**
	 * 非对称加密
	 * @param data 数据
	 * @param key key
	 * @return byte 结果
	 */
	public static byte[] encryptByKey(byte[] data, Key key){
		try {
			Cipher cipher = Cipher.getInstance(key.getAlgorithm());
			cipher.init(Cipher.ENCRYPT_MODE, key);
			return cipher.doFinal(data);
		} catch (Exception e) {
			throw new ClientException(11012, "RSA加密失败");
		}
	}

	/**
	 * 
	 * @param data 数据
	 * @param key key
	 * @return byte 结果
	 */
	public static byte[] decryptByKey(byte[] data, Key key){
		try {
			Cipher cipher = Cipher.getInstance(key.getAlgorithm());
			cipher.init(Cipher.DECRYPT_MODE, key);
			return cipher.doFinal(data);
		} catch (Exception e) {
			throw new ClientException(11012, "RSA解密失败");
		}
	}

	/**
	 * 非对称加密，并且将加密结果base64编码
	 * @param value value
	 * @param key key
	 * @return String 结果
	 */
	public static String encryptWithBase64(String value, Key key) {
		return Base64.encodeBase64String(encryptByKey(value.getBytes(), key));
	}

	/**
	 * 对base64编码的数据进行非对称解密
	 * @param value value
	 * @param key key
	 * @return String String
	 */
	public static String decryptWithBase64(String value, Key key) {
		return new String(decryptByKey(Base64.decodeBase64(value.getBytes()), key));
	}


	 /**
     * 从字符串获取私钥
     * @param privateKeyStr privateKeyStr
     * @return PrivateKey PrivateKey
     */
    public static PrivateKey loadPrivateKey(String privateKeyStr){
        try {
            byte[] buffer=  Base64.decodeBase64(privateKeyStr);
            PKCS8EncodedKeySpec keySpec= new PKCS8EncodedKeySpec(buffer);
            KeyFactory keyFactory= KeyFactory.getInstance("RSA");
            PrivateKey privateKey =  keyFactory.generatePrivate(keySpec);
            return  privateKey;
        } catch (NoSuchAlgorithmException e) {
			throw new ClientException(11012, "无此算法");
        } catch (InvalidKeySpecException e) {
			throw new ClientException(11012, "私钥非法");
        }  catch (NullPointerException e) {
			throw new ClientException(11012, "私钥数据为空");
        }
    }

    /**
    * <b>Description: 从字符串获取公钥</b><br> 
    * @param publicKeyStr publicKeyStr
    * @return PublicKey PublicKey
    * <b>Author:</b>  Dell
    * <br><b>Date:</b> 2020年7月24日 下午4:38:32
    * <br><b>Version:</b> 1.0
    */
    public static PublicKey loadPublicKey(String publicKeyStr){
        try {
            byte[] buffer= Base64.decodeBase64(publicKeyStr);
            KeyFactory keyFactory= KeyFactory.getInstance("RSA");
            X509EncodedKeySpec keySpec= new X509EncodedKeySpec(buffer);
            PublicKey publicKey =  keyFactory.generatePublic(keySpec);
            return publicKey;
        } catch (NoSuchAlgorithmException e) {
			throw new ClientException(11012, "无此算法");
		} catch (InvalidKeySpecException e) {
			throw new ClientException(11012, "公钥非法");
		} catch (NullPointerException e) {
			throw new ClientException(11012, "公钥数据为空");
		}
    }

}
