package com.GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	/**
	 * 
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return
	 * @throws Throwable
	 * @author Dell
	 */
	public String readDataFromExcel(String sheetName,int row,int cell) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IpathConstants.ExcelPath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row r = sh.getRow(row);
		Cell c = r.getCell(cell);
		String value = c.getStringCellValue();
		return value;
	}
	/**
	 * 
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @param data
	 * @throws Throwable
	 * @author Dell
	 */
	public void writeDataIntoExcel(String sheetName,int row,int cell,String data) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IpathConstants.ExcelPath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		sh.getRow(row).getCell(cell).setCellValue(data);
		FileOutputStream fos=new FileOutputStream(IpathConstants.ExcelPath);
		wb.write(fos);

	}
	/**
	 * 
	 * @param sheetName
	 * @return
	 * @throws Throwable
	 * @author Dell
	 */
	public HashMap<String, String> readMultipleDataFromExcel(String sheetName) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IpathConstants.ExcelPath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int count =sh.getLastRowNum();
		HashMap<String, String> map=new HashMap<String, String>();
		for(int i=0;i<count;i++)
		{
			String key=sh.getRow(i).getCell(0).getStringCellValue();
			String value=sh.getRow(i).getCell(1).getStringCellValue();
			map.put(key, value);
		}
		return map;
	}
	/**
	 * 
	 * @param SheetName
	 * @return
	 * @throws Throwable
	 * @author Dell
	 */
		public int getLastRowNo(String SheetName) throws Throwable
		{
			FileInputStream fis=new FileInputStream(IpathConstants.ExcelPath);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(SheetName);
			int count =sh.getLastRowNum();
			return count;
		}
		
		
		
		public Object[][] readMulSetOfData(String SheetName) throws Throwable
		{
		FileInputStream fis = new FileInputStream(IpathConstants.ExcelPath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		int lastrow = sh.getLastRowNum()+1;
		int lastcell = sh.getRow(0).getLastCellNum();
		Object[][] obj = new Object[lastrow][lastcell];
		for(int i=0;i<lastrow;i++) {
			for(int j=0;j<lastcell;j++) {
				 obj[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
				
			}
		}
		return obj;	
		}
		
}
