package com.wipro.testing.training.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public abstract class AbstractPage {
	private static WebDriver browser; // driver for the browser (Firefox, Chrome or IE)

	public AbstractPage() {
		// check if driver already exists
		if (browser == null) {
			// TO USE FIREFOX DRIVER, UNCOMMENT THE LINE BELOW
			//browser = new FirefoxDriver();

			// TO USE CHROME DRIVER, UNCOMMENT THE LINES BELOW
			System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
			browser = new ChromeDriver();

			// TO USE IE DRIVER, UNCOMMENT THE LINES BELOW
			//System.setProperty("webdriver.ie.driver", "C:/Selenium/IEDriverServer.exe");
			//browser = new InternetExplorerDriver();

			browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	}

	public WebDriver getDriver() {
		return browser;
	}

}
