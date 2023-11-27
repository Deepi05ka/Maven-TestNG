package com.dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.base.Base_Task;

public class ReadDataFromExcelSheet extends Base_Task {
	
	private static void readAparticularData() throws  IOException, InvalidFormatException {
		
		File f = new File("D:\\DataDriven\\Book.xlsx");
		FileInputStream fileread = new FileInputStream(f);
		Workbook workbook = new XSSFWorkbook(f);
		Sheet sheet = workbook.getSheetAt(1);
		Row row = sheet.getRow(3);
		Cell cell =row.getCell(1);
		String cellvalue = cell.getStringCellValue();
		System.out.println("cellvalue "+cellvalue);
//		double numbericcell = cell.getNumericCellValue();
//		System.out.println("numbericcell "+numbericcell);
		
//		DataFormatter df = new DataFormatter();
//		String format =df.formatCellValue(cell);
//		System.out.println("format "+format);
		
		String s = workbook.getSheetAt(1).getRow(0).getCell(0).getStringCellValue();
		System.out.println("sheetrowcell "+s);
		
		int lastrow = sheet.getLastRowNum();
		System.out.println("last row no: "+ lastrow);
		short lastcellno =sheet.getRow(0).getLastCellNum();
	    System.out.println("last cell no "+ lastcellno);
	    
	    
	}

	
	
	public static void main(String[] args) throws  IOException, InvalidFormatException {
		
       readAparticularData();
	}

}
