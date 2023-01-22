package com.amzon.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amzon.actiondriver.action;
import com.amzon.base.Baseclass;

public class Loginpage extends Baseclass {

	@FindBy(xpath="//input[@id='continue']")
	WebElement continuebutton;
		
	@FindBy(id="ap_email")
	WebElement email;
	
	@FindBy(id="createAccountSubmit")
	WebElement createaccbutton;
	
		
	
	public passwordpage signin(String username) {
		action.type(email,username);
		return new passwordpage();
	}
	
	public passwordpage continuebutton() {
		action.click(driver, continuebutton);
		return new passwordpage();
	}
	
	
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
}
