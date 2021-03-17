package org.junit;

import org.baseclass.BaseClass;

public class Sample extends BaseClass {
	
	BaseClass baseClass;
	@BeforeClass
	public static void launchBrowser() {
		getDriver();
		launchUrl("");
	}	
		@Before
		public void beforeMethod() {

	}
	

}
