package com.Adactin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read_data {
public static void read_data() throws IOException {
	File f =new File("C:\\Users\\HP\\Adactin\\excel\\Book1.xlsx");
  FileInputStream fis=new FileInputStream(f);
  Workbook wb=new XSSFWorkbook(fis);
Sheet sheetAt = wb.getSheetAt(0);
Row row = sheetAt.getRow(1);
Cell cell= row.getCell(2); 
CellType celltype=cell.getCellType();
if(celltype.equals(celltype.STRING)) {
String s=cell.getStringCellValue();
System.out.println(s);
}
else if (celltype.equals(celltype.NUMERIC)) {
	double numericcellvalue=cell.getNumericCellValue();
	int data=(int)numericcellvalue;
	System.out.println(data);
	
}
}
public static void main(String[] args) throws IOException {
	read_data();
}
}

