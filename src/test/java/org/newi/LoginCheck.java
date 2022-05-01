package org.newi;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginCheck extends Basecl{
	

	
	@BeforeMethod
	
	private void openBrowser() {
	
		browserLaunch();
		
		
	}
	
	@Test
	public void tripDetails() {
		
		launchUrl("https://www.makemytrip.com/");
	
	
	try

	{

		WebElement findElement = driver.findElement(By.xpath("//span[@class='langCardClose']"));
		findElement.click();
		driver.findElement(By.xpath("//p[text()='Login/Signup for Best Prices']")).click();
		 driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
		
		
		//driver.switchTo().frame("notification-frame-31764456");
	}
		
		catch(WebDriverException e)

{

System.out.println("Exception is: —" +e+"\n");




		{

		System.out.println("Exception is: —"+e+"\n");

		}	

}}
}