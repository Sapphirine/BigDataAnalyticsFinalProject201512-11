package com.predictionmarketing.convert;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TaxiDataConvert {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("data/2015_Green_Taxi_Trip_Data.csv"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("data/GreenTaxi-Distance-Tip.csv"));
		
		String line;
		while((line = br.readLine()) != null) {
			String[] values = line.split("\\t", -1);
			bw.write(values[6] + "," + values[2] + "," + values[10] + "\n");
		}
		
		br.close();
		bw.close();

	}

}