package com.sjy.OA_Sys.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileOperationUtil {

	@Value("${spring.resources.staticLocations}")
	private String[] filePath;

	/**
	 * 下载
	 * 
	 * @param fileName     服务器存储的文件名
	 * @param trueName     用户上传的文件名
	 * @param fileNextPath 服务器存放的下级路径
	 * @param request
	 * @param response
	 * @return
	 */
	public String download(String fileName, String trueName, String fileNextPath, HttpServletRequest request,
			HttpServletResponse response) {
		if (fileName != null) {
			String path = filePath[0].substring("file:/".length());
			// 设置文件路径
			File file = new File(path + fileNextPath + fileName);
			System.out.println(path + fileNextPath + fileName);
			// 如果文件存在，则进行下载
			if (file.exists()) {
				FileInputStream fis = null;
				BufferedInputStream bis = null;
				OutputStream os = null;
				try {
					// 配置文件下载
					response.setHeader("content-type", "application/octet-stream");
					response.setContentType("application/octet-stream");
					// 下载文件能正常显示中文
					response.setHeader("Content-Disposition",
							"attachment;filename=" + URLEncoder.encode(trueName, "UTF-8"));
					// 实现文件下载
					byte[] buffer = new byte[1024];

					fis = new FileInputStream(file);
					bis = new BufferedInputStream(fis);
					os = response.getOutputStream();
					int i = bis.read(buffer);
					while (i != -1) {
						os.write(buffer, 0, i);
						os.flush();
						i = bis.read(buffer);
					}
					System.out.println("Download  successfully!");
					return null;

				} catch (Exception e) {
					System.out.println("Download  failed!");
					return null;

				} finally {
					if (bis != null) {
						try {
							bis.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					if (fis != null) {
						try {
							fis.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					if (os != null) {
						try {
							os.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
		return null;
	}

	/**
	 * 文件名加密
	 * 
	 * @param fileName
	 * @return
	 */
	public static String fileNameEncryption(String fileName) {
		fileName = fileName.substring(0, fileName.lastIndexOf("."))
				+ TimeUtil.formatDateTime(new Date(), "yyyyMMddHHmmss") + fileName.substring(fileName.lastIndexOf("."));
		return fileName;
	}

	/**
	 * 文件名解密
	 * 
	 * @param fileName
	 * @return
	 */
	public static String fileNameDecryption(String fileName) {
		String pendingName = fileName.substring(0, fileName.indexOf("."));
		String suffixName = fileName.substring(fileName.indexOf("."));

		pendingName = new StringBuffer(pendingName).reverse().toString();
		pendingName = pendingName.substring(14);
		pendingName = new StringBuffer(pendingName).reverse().toString();
		fileName = pendingName + suffixName;

		return fileName;
	}
}
