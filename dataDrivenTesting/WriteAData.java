package com.dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteAData {
	
	private static void Writedata() throws IOException {
		System.out.println("====Test1====");
		File f = new File("D:\\DataDriven\\Student.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		//wb.createSheet("Values");
		wb.getSheet("Values").createRow(0).createCell(0).setCellValue("Hi");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		System.out.println("created ");
		
	}

     public static void main(String[] args) throws IOException {
    	 
    	 Writedata();
    	 
//		File file = new File("D:\\\\DataDriven\\\\Book.xlsx");
//		FileInputStream fs = new FileInputStream(file);
//		Workbook wb = new XSSFWorkbook(fs);
//		//wb.createSheet("Details");
////		wb.getSheet("Details").createRow(0).createCell(0).setCellValue("NAME");
////		FileOutputStream fos = new FileOutputStream(file);
////		wb.write(fos);
////		System.out.println("successfully created");
//		
//		wb.createSheet("Demo");
//		FileOutputStream fos = new FileOutputStream(file);
//		System.out.println("successfully created");
		
		
		
		
		
		
	}

}
