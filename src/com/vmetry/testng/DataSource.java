package com.vmetry.testng;

import org.testng.annotations.DataProvider;

public class DataSource {
	@DataProvider(name = "Vmetry Batch 11")
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "Maria Anders";
		data[0][1] = true;

		data[1][0] = "Munish Prabhu";
		data[1][1] = true;

		data[2][0] = "Giovanni Rovelli";
		data[2][1] = false;
		return data;
	}
}
