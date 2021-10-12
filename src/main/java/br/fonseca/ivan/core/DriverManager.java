package br.fonseca.ivan.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	
	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}
	
	public static void killDriver(){
		if(driver != null) {
			//driver.quit();
			driver = null;
		}
	}
}
