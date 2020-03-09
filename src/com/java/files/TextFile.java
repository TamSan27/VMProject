package com.java.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFile {
	static String fileLoc = "Users" + File.separator + "user" + File.separator + "Desktop" + File.separator
			+ "Batch11.txt";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fl = new File(fileLoc);
		writeData(fl);
		readData(fl);
	}

	public static void readData(File loc) throws IOException {
		FileReader fr = new FileReader(loc);
		BufferedReader br = new BufferedReader(fr);
		System.out.println("Operation Started...");
		String data;
		while ((data = br.readLine()) != null) {
			System.out.println(data);
		}
		br.close();
	}

	public static void writeData(File loc) throws IOException {
		FileWriter fw = new FileWriter(loc);
		BufferedWriter bw = new BufferedWriter(fw);
		Scanner inputReader = new Scanner(System.in);
		String data;
		System.out.println("Enter Input:");
		while (!((data = inputReader.nextLine()).equals("$"))) {
			bw.write(data);
			bw.newLine();
		}
		inputReader.close();
		bw.close();
		fw.close();
		System.out.println("File written success");
	}
}
