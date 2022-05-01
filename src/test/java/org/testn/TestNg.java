package org.testn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg extends BaseClass {
	
	
	
		
		@Parameters({"mobilenumber","pass"})
		@Test(priority=-1)
	private void test2(String mnum,String pas) throws InterruptedException {
		
		launchBrowser();
		launchUrl("https://www.flipkart.com/account/login");
		
	   
	PoJoClass p= new PoJoClass();
		
		fillTxtBox(p.getPassword(),mnum); 
		
		
		fillTxtBox(p.getMobilenum(),pas);
		
		String expected="7894563210";
	
		
		
		Assert.assertEquals(mnum, expected, "Wrong match");
		WebElement click = p.getClick();
		click(click);
		
		
		
	 	}
		@Parameters({"mobilenumber","pass"})
		@Test
		private void tc1(String mnum,String pas) {
			launchBrowser();
			launchUrl("https://www.flipkart.com/account/login");
			
		   
			PoJoClass p= new PoJoClass();
			
			fillTxtBox(p.getPassword(),mnum); 
			
			
			fillTxtBox(p.getMobilenum(),pas);
			
			String expected="7894563210";
			Assert.assertEquals(mnum, expected, "Wrong match");
			WebElement click = p.getClick();
			click(click);
		
			
		}
	
}
