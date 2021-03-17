package org.mavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DisplayAll {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Parvez\\eclipse-workspace\\MavenProject\\WorkBook\\Sample.xlsx");
		FileInputStream s = new FileInputStream(f);
		Workbook b = new XSSFWorkbook(s);
		Sheet st = b.getSheet("Sheet1");
		for (int i = 0; i < st.getPhysicalNumberOfRows(); i++) {
			
			Row r = st.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				String ss = c.getStringCellValue();
				System.out.println(ss);
			}
		}
		

	}
}
