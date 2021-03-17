package org.loginpage;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseClass {
	
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	 
	
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement adres;
	
	@FindBy(id="cc_num")
	private WebElement creditCard;
	
	@FindBy(id="cc_type")
	private WebElement cardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement expireMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expireYear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvNum;
	
	@FindBy(id="book_now")
	private WebElement bookClick;

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public WebElement getAdres() {
		return adres;
	}

	public void setAdres(WebElement adres) {
		this.adres = adres;
	}

	public WebElement getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(WebElement creditCard) {
		this.creditCard = creditCard;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public void setCardType(WebElement cardType) {
		this.cardType = cardType;
	}

	public WebElement getExpireMonth() {
		return expireMonth;
	}

	public void setExpireMonth(WebElement expireMonth) {
		this.expireMonth = expireMonth;
	}

	public WebElement getExpireYear() {
		return expireYear;
	}

	public void setExpireYear(WebElement expireYear) {
		this.expireYear = expireYear;
	}

	public WebElement getCvvNum() {
		return cvvNum;
	}

	public void setCvvNum(WebElement cvvNum) {
		this.cvvNum = cvvNum;
	}

	public WebElement getBookClick() {
		return bookClick;
	}

	public void setBookClick(WebElement bookClick) {
		this.bookClick = bookClick;
	}
	
	
}
