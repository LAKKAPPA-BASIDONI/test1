package techscore;
import java.io.*;


import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataManipulation  {
	
	
	public HashMap<String, String> getExcelData(String filePeth,String sheetName, String referenceKey) throws IOException {
		try {
			HashMap<String, String> hashMap = new HashMap<String, String>();
			DataFormatter dataFormatter = new DataFormatter();
			FileInputStream file = new FileInputStream(filePeth);
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			Sheet sheet = workbook.getSheet(sheetName);
			
			int rownum =-1;
			for(int i=0;i<=sheet.getLastRowNum();i++) {
				if(referenceKey.equals(dataFormatter.formatCellValue(sheet.getRow(i).getCell(0)))) {
					rownum= i;
				}
			}
			if(rownum == -1) {
				throw new ArrayIndexOutOfBoundsException("Invalid reference Key");
			}
			
			for(int i=0;i< sheet.getRow(0).getLastCellNum();i++) {
				hashMap.put(dataFormatter.formatCellValue(sheet.getRow(0).getCell(i)),dataFormatter.formatCellValue(sheet.getRow(rownum).getCell(i)));
						
			}
			
			return hashMap;
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void writeData(String filePath, String sheetName,String referenceKey,String columnName,String cellValue) throws IOException {
		DataFormatter dataFormatter = new DataFormatter();
		FileInputStream inputFile = new FileInputStream(filePath);
		XSSFWorkbook workbook = new XSSFWorkbook(inputFile);
		Sheet sheet = workbook.getSheet(sheetName);
		try {
			
			int rownum =-1;
			int colnum =-1;
			//System.out.println(dataFormatter.formatCellValue(sheet.getRow(0).getCell(0)))
			
			for(int i=0;i<sheet.getRow(0).getLastCellNum();i++) {
				if(columnName.equals(dataFormatter.formatCellValue(sheet.getRow(0).getCell(i)))) {
					colnum= i;
				}
			}
			
			for(int i=0;i<=sheet.getLastRowNum();i++) {
				if(referenceKey.equals(dataFormatter.formatCellValue(sheet.getRow(i).getCell(0)))) {
					rownum= i;
				}
			}
			if(rownum == -1 || colnum == -1) {
				throw new ArrayIndexOutOfBoundsException("Invalid reference Key");
			}
			inputFile.close();
			FileOutputStream outputFile = new FileOutputStream(filePath);
			sheet.getRow(rownum).getCell(colnum).setCellValue(cellValue);
			workbook.write(outputFile);
			workbook.close();
			
			
			
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			workbook.close();
			
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		DataManipulation data = new DataManipulation();
		data.writeData("D:/Book1.xlsx","Sheet1","candidate1","firstName","Khanapeth");
//		HashMap<String, String> map = data.getExcelData("D:/Book2.xlsx","Sheet1","candidate2");
//		
//		System.out.println(map);
		//installation of androi
		
		
	}

}
