package com.bonade.sdk.opencenter.test;

import org.junit.Test;

import com.bonade.sdk.opencenter.client.SdkClient;
import com.bonade.sdk.opencenter.dto.oss.ImgFileCompanyDto;
import com.bonade.sdk.opencenter.dto.oss.ImgFileUserDto;


/**
 * author yw
 * date 2020/8/18
 */
public class TestOssFile {
	private static SdkClient client = SdkClient.getSdkClient();
	//private static String host = "http://192.168.14.214/";
    static String host = "http://localhost:4190";
	private static String clientId = "00ptbnd7877146261592211220014159";
	private static String secret = "00ptbnd1736481859159221122001415";

	public TestOssFile() {

	}

   public static void main(String[] str) {

   }

	static {
		client.init(host, clientId, secret);
	}

	@Test
	public void uploadUserFile() {
        ImgFileUserDto imgFileUserDto = new ImgFileUserDto();
        imgFileUserDto.setFileName("5402219a031d93de18ef8985c5f2ced2.jpg");
        imgFileUserDto.setUrl("https://t7.baidu.com/it/u=378254553,3884800361&fm=79&app=86&size=h300&n=0&g=4n&f=jpeg?sec=1598407993&t=5402219a031d93de18ef8985c5f2ced2");
        imgFileUserDto.setType(2);
        imgFileUserDto.setUserId("000b2851b1024594ae435163e6f51fb3");
        String ossPath = client.getOssFileService().uploadUserFile(imgFileUserDto);
        System.out.println("ossPath:"+ossPath);
	}

	@Test
	public void uploadCompanyFile() {
        ImgFileCompanyDto imgFileCompanyDto = new ImgFileCompanyDto();
        imgFileCompanyDto.setFileName("066f9ff0c8ce53aeeb7549eadf9e35e3.jpg");
        imgFileCompanyDto.setUrl("https://t7.baidu.com/it/u=3616242789,1098670747&fm=79&app=86&size=h300&n=0&g=4n&f=jpeg?sec=1598407993&t=066f9ff0c8ce53aeeb7549eadf9e35e3");
        imgFileCompanyDto.setType("1");
        imgFileCompanyDto.setCompanyId("00b2f2c34a8d4dd69b14560acf98c2c2");
        String ossPath = client.getOssFileService().uploadCompanyFile(imgFileCompanyDto);
        System.out.println("ossPath:"+ossPath);
	}


}
