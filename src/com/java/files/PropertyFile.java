package com.java.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	static String fileLoc = "/Users/user/Documents/Training/Vcentry Batch 11/SeleniumProject/file_store/Batch11Config.properties";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fl = new File(fileLoc);
		writeData(fl);
		readData(fl);
	}

	public static void readData(File fl) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(fl);
		prop.load(fis);
		System.out.println("User Name:" + prop.getProperty("UserName"));
		fis.close();
	}

	public static void writeData(File fl) throws IOException {
		Properties prop = new Properties();
		FileOutputStream fos = new FileOutputStream(fl);
		try {
			prop.setProperty("Name", "Munish Prabhu");
			prop.setProperty("UserName", "munish@vmetry.com");
			prop.setProperty("Password", "Vmetry@123");
			prop.setProperty(null, "Dummy");
			prop.store(fos, "Data written in Session Vmetry Batch 11");
			System.out.println("File Written Successfully");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getClass().getName());
		}
		finally {
			fos.close();
		}
	}
}
