package com.amzon.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amzon.actiondriver.action;
import com.amzon.base.Baseclass;

public class signinpage extends Baseclass {
	
	@FindBy(xpath="//*[@id=\"nav-flyout-ya-signin\"]/span")
	WebElement signinbutton;
	
	
	
	public void clickonsigninbutton() throws Exception {
		action.mouseHoverByJavascript(signinbutton);
		action.JSClick(driver, signinbutton);
	}
	public signinpage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
}
