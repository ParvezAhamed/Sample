package org.mavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleMaven {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Parvez\\eclipse-workspace\\MavenProject\\WorkBook\\Sample.xlsx");
		FileInputStream s = new FileInputStream(f);
		Workbook b = new XSSFWorkbook(s);
		Sheet st = b.getSheet("Sheet1");
		Row r = st.getRow(4);
		Cell c = r.getCell(4);
		String ss = c.getStringCellValue();
		System.out.println(ss);
		
		
	}
}
