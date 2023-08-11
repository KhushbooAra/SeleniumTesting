package com.selenium.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize WebDriver object through ChromeDriver class.
		WebDriver browserObject = new ChromeDriver();
		// 3. Open the web page https://www.facebook.com/
		browserObject.get("https://www.amazon.com/");

		WebElement obj = browserObject.findElement(By.xpath("//span[contains(text(),'Hello, sign in')]"));

		Actions ref = new Actions(browserObject);
		ref.moveToElement(obj).build().perform();

	}

}
