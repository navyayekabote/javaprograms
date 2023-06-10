package com.groceryapp.user.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.groceryapp.user.model.UserDTO;
//import com.opencsv.CSVParser;

public class CsvHelper {
	public static final String TYPE="text/csv";
	public static String[] headers = {"firstName","middleName","lastName","dateOfBirth","city","email","petName"};

	public List<UserDTO> getUserDTOList(String fileName){
	List<UserDTO> userDTOs = new ArrayList<>();
	try(FileReader reader = new FileReader(fileName);
	BufferedReader bufferedReader =new BufferedReader(reader);
	CSVParser parser = new CSVParser(bufferedReader, CSVFormat.DEFAULT.withFirstRecordAsHeader().withTrim());){

	List<CSVRecord> records = parser.getRecords();
	for (CSVRecord csvRecord:records) {
	String firstName = csvRecord.get("firstNname");
	String middleName = csvRecord.get("middleNname");
	String lastName = csvRecord.get("lastNname");
	String dateOfBirth = csvRecord.get("dateOfBirth");
	String city = csvRecord.get("city");
	String email = csvRecord.get("email");
	String petName = csvRecord.get("petNname");
	UserDTO userDTO =new UserDTO(firstName,middleName,lastName,dateOfBirth,city,email,petName);

	userDTOs.add(userDTO);
	}
	return userDTOs;
	}catch(Exception e){
	e.printStackTrace();
	throw new RuntimeException();
	}
	}

	public String getCSVFile(String fileName){
	return fileName;
	}
}
