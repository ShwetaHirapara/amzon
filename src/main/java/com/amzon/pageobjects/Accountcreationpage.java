package com.amzon.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amzon.actiondriver.action;
import com.amzon.base.Baseclass;

public class Accountcreationpage extends Baseclass{
	
	@FindBy(xpath="//*[@id=\"ap_register_form\"]/div/div/h1")
	WebElement createAccformtitle	;
	
	
	public Accountcreationpage() {
		PageFactory.initElements(driver, this);
	}
	public boolean ValidateAccCreatePage() {
		return action.isDisplayed(driver, createAccformtitle);
	}
	
	
		
	
	
	
	
	

}
