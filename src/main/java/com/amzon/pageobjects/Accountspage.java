package com.amzon.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amzon.actiondriver.action;
import com.amzon.base.Baseclass;

public class Accountspage extends Baseclass {

	@FindBy(xpath="//*[@id=\"nav-orders\"]")
	WebElement Yourorders;
	
	public void verifyaccountpage() {
	Boolean accpisplay=	action.isDisplayed(driver, Yourorders);
	if(accpisplay) {
		System.out.println("orders are displayed");
	}else {
		System.out.println("orders are not displayed");

	}
	}
	
	
	public Accountspage() {
		PageFactory.initElements(driver, this);
	}
}
