package org_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fbbase {
	public static WebDriver driver;

//1.launching
	public static void launch() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
	}

	// 2.URL passing
	public static void passing(String url) {
		driver.get(url);
	}

	// 3.send keys
	public static void filling(WebElement ele, String str) {
		ele.sendKeys(str);
	}

//4.click
	public static void clicking(WebElement ele1) {
		ele1.click();

	}
}
