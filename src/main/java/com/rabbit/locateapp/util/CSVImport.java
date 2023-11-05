package com.rabbit.locateapp.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class CSVImport {

	private static final String inputCSVFile = "/home/shnmkhk/Downloads/Restored-Pincode-Data.csv";
	private static final Set<String> uniqueStatesSet = new TreeSet<String>();

	public static void main(String[] args) throws IOException {
		try (final BufferedReader br = new BufferedReader(new FileReader(inputCSVFile))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				uniqueStatesSet.add(line.substring(line.lastIndexOf(',') + 1));
			}
			uniqueStatesSet.stream().forEach(System.out::println);
		}
	}
}
