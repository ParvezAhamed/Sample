package org.loginpage;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderNumber extends BaseClass {
	
	public OrderNumber() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='order_no']")
	private WebElement orderNum;

	public WebElement getOrderNum() {
		return orderNum;
	}

}
