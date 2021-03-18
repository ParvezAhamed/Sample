package org.hotel;

import org.baseclass.BaseClass;
import org.loginpage.BookHotel;
import org.loginpage.LoginPage;
import org.loginpage.OrderNumber;
import org.loginpage.SearchHotel;
import org.loginpage.SelectHotel;

public class Hotel extends BaseClass {
	public static void main(String[] args) throws InterruptedException{
		BaseClass bs = new BaseClass();
		BaseClass.getDriver();
		BaseClass.launchUrl("http://adactinhotelapp.com/");
		LoginPage lp = new LoginPage();
		bs.enterText(lp.getTxtUserName(), "Thandapaniraji");
		bs.enterText(lp.getTxtPassword(), "prathi11");
		bs.buttonClick(lp.getBtnLogin());
		SearchHotel sh = new SearchHotel();
		bs.selectVisibleText(sh.getLn(), "Sydney");
		bs.selectVisibleText(sh.getHs(), "Hotel Creek");
		bs.selectVisibleText(sh.getRt(), "Deluxe");
		bs.selectVisibleText(sh.getRn(), "2 - Two");
		bs.selectVisibleText(sh.getAr(), "3 - Three");
		bs.selectVisibleText(sh.getCr(), "0 - None");
		bs.buttonClick(sh.getSt());
		SelectHotel hotel = new SelectHotel();
		bs.buttonClick(hotel.getRadioButton());
		bs.buttonClick(hotel.getClick());
		BookHotel bookHotel = new BookHotel();
		bs.enterText(bookHotel.getFirstName(), "Parvez");
		bs.enterText(bookHotel.getLastName(), "Ahamed");
		bs.enterText(bookHotel.getAdres(), "13h Bazaar street");
		bs.enterText(bookHotel.getCreditCard(), "1234567891234567");
		bs.enterText(bookHotel.getCardType(), "Master Card");
		bs.enterText(bookHotel.getExpireMonth(), "April");
		bs.enterText(bookHotel.getExpireYear(), "2022");
		bs.enterText(bookHotel.getCvvNum(), "123");
		bs.buttonClick(bookHotel.getBookClick());
		Thread.sleep(7000);
		OrderNumber number = new OrderNumber();
		bs.attributeText(number.getOrderNum(), "value");
	}
}
