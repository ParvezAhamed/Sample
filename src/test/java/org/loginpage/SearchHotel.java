package org.loginpage;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement ln;
	
	@FindBy(id="hotels")
	private WebElement hs;
	
	public WebElement getLn() {
		return ln;
	}

	public void setLn(WebElement ln) {
		this.ln = ln;
	}

	public WebElement getHs() {
		return hs;
	}

	public void setHs(WebElement hs) {
		this.hs = hs;
	}

	public WebElement getRt() {
		return rt;
	}

	public void setRt(WebElement rt) {
		this.rt = rt;
	}

	public WebElement getRn() {
		return rn;
	}

	public void setRn(WebElement rn) {
		this.rn = rn;
	}

	public WebElement getAr() {
		return ar;
	}

	public void setAr(WebElement ar) {
		this.ar = ar;
	}

	public WebElement getCr() {
		return cr;
	}

	public void setCr(WebElement cr) {
		this.cr = cr;
	}

	public WebElement getSt() {
		return st;
	}

	public void setSt(WebElement st) {
		this.st = st;
	}

	@FindBy(id="room_type")
	private WebElement rt;
	
	@FindBy(id="room_nos")
	private WebElement rn;
	
	@FindBy(id="adult_room")
	private WebElement ar;
	
	@FindBy(id="child_room")
	private WebElement cr;
	
	@FindBy(id="Submit")
	private WebElement st;
	
	
	
	
	
	
	
	
	
	
	
}
