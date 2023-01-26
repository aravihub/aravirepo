package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class DataDrive {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
	String filepath="C:\\Users\\aravi\\eclipse-workspace\\Autoproj\\src\\main\\java\\resources\\excel.xlsx";
	FileInputStream inpst=new FileInputStream(filepath);
	XSSFWorkbook wbk=new XSSFWorkbook(inpst);
	XSSFSheet sht=wbk.getSheetAt(0);
	/*// iterator
	 Iterator iter=sht.iterator();
	while(iter.hasNext()) {
		XSSFRow row=(XSSFRow) iter.next();
		Iterator celliter=row.cellIterator();
		while(celliter.hasNext()) {
			XSSFCell cell=(XSSFCell)celliter.next();
			switch(cell.getCellType()) {
			case STRING:System.out.print(cell.getStringCellValue());break;
			case NUMERIC:System.out.print(cell.getNumericCellValue());break;
			case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
			}
			System.out.print(" | ");
			
		}*/
	int lastRow = sht.getLastRowNum();
	for(int i=0; i<=lastRow; i++){
	Row row = sht.getRow(i);
	org.apache.poi.ss.usermodel.Cell cell = row.createCell(2);

	cell.setCellValue("WriteintoExcel");
	org.apache.poi.ss.usermodel.Cell cell1 = row.createCell(3);

	cell1.setCellValue("next");


	}

	FileOutputStream fos = new FileOutputStream(filepath);
	wbk.write(fos);
	fos.close();
		System.out.println();

	}
	
	
	

	}

