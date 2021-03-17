package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Select s;
	
	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void launchUrl(String Url) {
		driver.get(Url);

	}

	public void enterText(WebElement element, String value) {
		element.sendKeys(value);

	}

	public void buttonClick(WebElement element) {
		element.click();

	}

	public String text(WebElement element) {
		String outputText = element.getText();
		System.out.println(outputText);
		return outputText;
	}

	public void attributeText(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		System.out.println(attribute);

	}

	public void selectVisibleText(WebElement element, String value) {
		s = new Select(element);
		s.selectByVisibleText(value);

	}

	public void selectValue(WebElement element, String value) {
		s = new Select(element);
		s.selectByValue(value);
	}

	public void selectIndex(WebElement element, int num) {
		s = new Select(element);
		s.selectByIndex(num);
	}
	
	public void deselectVisibleText(WebElement element, String value) {
		s = new Select(element);
		s.deselectByVisibleText(value);
	}

	public void deselectValue(WebElement element, String value) {
		s = new Select(element);
		s.deselectByValue(value);
	}
	
	public void deselectIndex(WebElement element, int num) {
		s = new Select(element);
		s.deselectByIndex(num);
	}

	public void unSelect(WebElement element) {
		s = new Select(element);
		s.deselectAll();
	}

	public void multipleSelect(WebElement element) {
		s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}

	public void firstSelect(WebElement element) {
		s = new Select(element);
		s.getFirstSelectedOption();

	}

	public void allSelect(WebElement element) {
		s = new Select(element);
		s.getAllSelectedOptions();

	}
	
	public void getOptions(WebElement element) {
		s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);
			
		}
	}
	
	public void screenShot(String data) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File(System.getProperty("user.dir")+"\\target\\"+data+".png");
		FileUtils.copyFile(srcFile, destFile);
			
	}
	
	public String getSheet(String pathname, String name, int rowNum, int cellNum) throws IOException {
		File file = new File(pathname);
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheet(name);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		int cellType = cell.getCellType();
		String string = "";
		if (cellType == 1) {
			string=cell.getStringCellValue();
			
		}
		else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
			string = dateFormat.format(dateCellValue);
		}else {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long) numericCellValue;
			string = String.valueOf(l);
		}
		return string;
	}
	
	
	
	

}
