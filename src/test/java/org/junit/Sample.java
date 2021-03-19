package org.junit;

import java.io.IOException;
import java.util.Date;

import org.baseclass.BaseClass;
import org.loginpage.LoginPage;

public class Sample extends BaseClass {
	
	static BaseClass baseClass;
	LoginPage lp;
	@BeforeClass
	public static void launchBrowser() {
		baseClass=new BaseClass(); 
		getDriver();
		launchUrl("http://adactinhotelapp.com/");
	}	
		@Before
		public void beforeMethod() throws IOException {
			Date date = new Date();
			System.out.println(date);
			baseClass.screenShot("Before Login");

	}
		@Test
		public void tc() throws IOException {
			lp = new LoginPage();
			baseClass.enterText(lp.getTxtUserName(), "Thandapaniraji");
			baseClass.enterText(lp.getTxtPassword(), "prathi11");
//			baseClass.enterText(lp.getTxtUserName(), baseClass.getSheet
//					("C:\\Users\\Parvez\\OneDrive\\Documents\\Clone\\Sample\\WorkBook\\Sample.xlsx", "Hotel", 1, 0));
//			baseClass.enterText(lp.getTxtPassword(), baseClass.getSheet
//					("C:\\Users\\Parvez\\OneDrive\\Documents\\Clone\\Sample\\WorkBook\\Sample.xlsx", "Hotel", 1, 1));
			baseClass.buttonClick(lp.getBtnLogin());
		}
		
		@After
		public void after() throws IOException {
			Date date = new Date();
			System.out.println(date);
			baseClass.screenShot("After Login");

		}
		
		@AfterClass
		public static void afterClass() {
			driver.quit();
		}

}
