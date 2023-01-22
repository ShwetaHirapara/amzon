package com.amzon.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amzon.actiondriver.action;
import com.amzon.base.Baseclass;

public class Orderpage extends Baseclass {

	
	@FindBy(xpath="//tbody/tr[1]/td[2]/text()")
	WebElement unitprice;
	
	@FindBy(xpath="//*[@id=\"subtotals-marketplace-table\"]/tbody/tr[9]/td[2]/text()")
	WebElement totalprice;
	
	@FindBy(xpath="//input[@aria-labelledby='submitOrderButtonId-announce']")
	WebElement placeanorder;

public   Orderpage() {
	PageFactory.initElements(driver, this);
}
	public double getunitprice() {
		String unitprice1=unitprice.getText();
		String unit=unitprice1.replaceAll("[^a-zA-Z0-9]", unitprice1);
		double finalunitprice=Double.parseDouble(unit);
		return finalunitprice/100;
	}
	
	public ordersummary clickoncheckout() {
		action.click(driver, placeanorder);
		return new ordersummary();
	}
	
}