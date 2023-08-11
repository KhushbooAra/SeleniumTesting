package com.selenium.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize Webdriver object through ChromeDriver class.
		WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.amazon.com/ link using get method.
		browserObject.get("http://www.google.com");

		WebElement obj = browserObject.findElement(By.linkText("Gmail"));
		if (obj.isDisplayed()) {
			System.out.println("Link is displayed");
		} else {
			System.out.println("Not displayed");
		}
	}

}
