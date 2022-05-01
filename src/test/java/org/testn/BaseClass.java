package org.testn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();		
		
	}
	
	public static void launchUrl(String url) {
		driver.manage().window().maximize();
		driver.get(url);

	}
	public static void fillTxtBox(WebElement ref,String val) {
		ref.sendKeys(val);
		
		}
	public static void click(WebElement ref) {
		ref.click();
		
		
	}

}
