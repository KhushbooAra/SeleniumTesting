package com.selenium.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize Webdriver object through ChromeDriver class.
		WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.amazon.com/ link using get method.
		browserObject.get("https://admin-demo.nopcommerce.com/login");
		
		WebElement email=	browserObject.findElement(By.name("Email"));
		email.clear();
	email.sendKeys("admin@yourstore.com");
	
	WebElement pass= browserObject.findElement(By.name("Password"));
	pass.clear();
	pass.sendKeys("admin");
		
	pass.click();
	
	browserObject.findElement(By.className("button-1")).click();
	}

}
