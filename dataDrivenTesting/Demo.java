package com.dataDrivenTesting;

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

public class Demo {
	static DataFormatter df;
	public static void test() throws InvalidFormatException, IOException {
		File f = new File("D:\\DataDriven\\Book (2).xlsx");
		FileInputStream fs = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(f);
		Sheet sheet = wb.getSheetAt(1);
		Row row =sheet.getRow(2);
		Cell cell = row.getCell(1);
		String c = cell.getStringCellValue();
		
//		System.out.println(c);
//		double d =cell.getNumericCellValue();
//		System.out.println(d);
		
//		DataFormatter df = new DataFormatter();
//		String format = df.formatCellValue(cell);
//		System.out.println(format); 
		
		int rowno = sheet.getLastRowNum();
		short cellno = row.getLastCellNum();
		System.out.println(" rowno " + rowno);
		System.out.println("cell no "+cellno);
		int rowsize = sheet.getPhysicalNumberOfRows();
		int cellsize = row.getPhysicalNumberOfCells();
		System.out.println("rowSize "+ rowsize);
		System.out.println("cellsize "+ cellsize);
		
		for(int i=0; i<rowno ;i++) {
			
			Cell sc = sheet.getRow(2).getCell(i);
            //Cell sc = row.getCell(i);
			df = new DataFormatter();
			String format = df.formatCellValue(sc);
			System.out.println(format);
			System.out.println();
			
			}
		for(int i=1;i<=rowno;i++) {
			for(int j=0;j<cellno;j++) {
				String cellvalue = df.formatCellValue(sheet.getRow(i).getCell(j));
				System.out.println(cellvalue);
			}
			System.out.println();
		}
		
		
		
	}

	public static void main(String[] args) throws InvalidFormatException, IOException {
		test();

	}

}
