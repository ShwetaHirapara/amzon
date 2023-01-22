package com.amzon.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amzon.actiondriver.action;
import com.amzon.base.Baseclass;

public class Homepage extends Baseclass {
	@FindBy(xpath="//*[@id=\"nav_prefetch_yourorders\"]/span")
	WebElement orderhistory;
	
	
	@FindBy(id="nav-orders")
	WebElement Returns;
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement loggedInname;
	
	@FindBy(id="nav-link-accountList")
	WebElement wishlist;
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateloggedInname() {
		return action.isDisplayed(driver, loggedInname);
	}
	public void validateorderhistory() {
		action.click(driver, Returns);
		action.mouseOverElement(orderhistory);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
