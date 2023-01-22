package com.amzon.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amzon.actiondriver.action;
import com.amzon.base.Baseclass;

public class AddTocartpage extends Baseclass {

	@FindBy(xpath="//span[@id='dropdown_selected_size_name']//span")
	WebElement sizeselect;
	
	@FindBy(xpath="//*[@id=\"a-autoid-31-announce\"]/div/div[1]/img")
	WebElement productcolor;
	
	@FindBy(id="add-to-cart-button")
	WebElement addtocartButton;
	
	@FindBy(xpath="//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/span")
	WebElement addedtocartmessage;
	
	@FindBy(id="proceed-to-checkout-action")
	WebElement proceedtocheckout;
	
	public AddTocartpage() {
		PageFactory.initElements(driver,this);
	}
	
	public void enterquantity(String size) {
		action.selectByVisibleText( size, sizeselect);
	}
	public void selectcolorimage() {
		action.click(driver, productcolor);
	}
	public void addtocart() {
		action.click(driver, addtocartButton);
	}
	public boolean validateAddtocart() {
		return action.isDisplayed(driver, addedtocartmessage);
	}
	public void clickonCheckout() throws Exception {
		action.JSClick(driver, proceedtocheckout);
	}
	
	
	
	
}
