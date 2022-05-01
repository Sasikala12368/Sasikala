package org.newi;

import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basecl {
	static WebDriver driver;
	
	public static WebDriver browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	return driver;
		
		
	}

	public static void launchUrl(String url) {
		driver.get(url);
	
	}
	public static Wait<WebDriver> waiti() {
		return null;
		
	}
}
