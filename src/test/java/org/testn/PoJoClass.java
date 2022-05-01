package org.testn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PoJoClass extends BaseClass {
	public PoJoClass() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement mobilenum;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement password;

	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement click;

	public WebElement getClick() {
		return click;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getMobilenum() {
		return mobilenum;
	}
	

	
}
