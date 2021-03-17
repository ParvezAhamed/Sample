package org.mavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelTask {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Parvez\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		WebElement usr = driver.findElement(By.id("username"));
		usr.sendKeys("Thandapaniraji");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("prathi11");
		WebElement lgn = driver.findElement(By.id("login"));
		lgn.click();
		
		File f = new File("C:\\Users\\Parvez\\eclipse-workspace\\MavenProject\\WorkBook\\Sample.xlsx");
		FileInputStream s = new FileInputStream(f);
		Workbook b = new XSSFWorkbook(s);
		Sheet cs = b.createSheet("Hotel");
		Row cr = cs.createRow(0);
		Cell cc = cr.createCell(0);
		cc.setCellValue("Username");
		Cell cc1 = cr.createCell(1);
		cc1.setCellValue("Password");
		
		Row cr1 = cs.createRow(1);
		Cell cc2 = cr1.createCell(0);
		cc2.setCellValue("Thandapaniraji");
		Cell cc3 = cr1.createCell(1);
		cc3.setCellValue("prathi11");
		
		FileOutputStream s1 = new FileOutputStream(f);
		b.write(s1);
			
	}
}
