package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteMulDataToExcel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\vee.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("sheet1");
		int count = sh.getLastRowNum();
		for(int i=0;i<=count;i++) {
			
		sh.getRow(i).createCell(0).setCellValue("hello");
		sh.getRow(i).createCell(1).setCellValue("hello");
		
	}
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\vee.xlsx");
		wb.write(fos);
		wb.close();

}
}
