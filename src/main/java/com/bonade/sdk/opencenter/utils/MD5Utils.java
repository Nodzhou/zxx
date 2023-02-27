//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.bonade.sdk.opencenter.utils;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/**
 * @author zhaoshajin
 */
public class MD5Utils {
    private static final String[] STRS = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    public MD5Utils() {
    }

    public static String MD5(String value) {
        String md5 = "";

        try {
            if (value == null) {
                return null;
            }

            byte[] btInput = value.getBytes("UTF-8");
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            mdInst.update(btInput);
            byte[] md = mdInst.digest();
            StringBuffer buffer = new StringBuffer();

            for (int i = 0; i < md.length; ++i) {
                int num = md[i];
                if (num < 0) {
                    num += 256;
                }

                int index1 = num / 16;
                int index2 = num % 16;
                buffer.append(STRS[index1] + STRS[index2]);
            }

            md5 = buffer.toString();
        } catch (Exception var10) {
            var10.printStackTrace();
        }

        return md5;
    }

    public static String generateKey(Map<String, String> values) {
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] bytes = digest.digest(values.toString().getBytes("UTF-8"));
            return String.format("%032x", new BigInteger(1, bytes));
        } catch (NoSuchAlgorithmException var3) {
            throw new IllegalStateException("MD5 algorithm not available.  Fatal (should be in the JDK).", var3);
        } catch (UnsupportedEncodingException var4) {
            throw new IllegalStateException("UTF-8 encoding not available.  Fatal (should be in the JDK).", var4);
        }
    }
}
