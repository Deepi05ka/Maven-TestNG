package com.TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Basic2 {
 
	@Test(priority = 1)
	private static void readAparticularData() throws  IOException, InvalidFormatException {
		System.out.println("====Test 1====");
		File f = new File("D:\\DataDriven\\Data.xlsx");
		FileInputStream fileread = new FileInputStream(f);
		Workbook workbook = new XSSFWorkbook(f);
		Sheet sheet = workbook.getSheetAt(1);
		Row row = sheet.getRow(3);
		Cell cell =row.getCell(1);
		//String cellvalue = cell.getStringCellValue();
		DataFormatter df = new DataFormatter();
		String format =df.formatCellValue(cell);
		System.out.println("format "+format);
		//System.out.println("cellvalue :"+cellvalue);
	}
	
	@Test(priority = 2)
    private static void getAllData() throws Exception, IOException {
    	System.out.println("====Test 2====");
    	File f = new File("D:\\DataDriven\\Data.xlsx");
		FileInputStream read = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(f);
		Sheet sheet = wb.getSheet("Sheet2");
		
		int lastrow = sheet.getLastRowNum();
		System.out.println("last row no: "+ lastrow);
		short lastcellno =sheet.getRow(0).getLastCellNum();
	    System.out.println("last cell no "+ lastcellno);
	    
		for(int i=0;i<lastrow;i++) {
			for(int j=0;j<lastcellno;j++) {
				String all = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(all);
			}
			System.out.println();
		}
		
}
}
