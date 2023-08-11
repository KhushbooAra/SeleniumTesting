package com.selenium.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize WebDriver object through ChromeDriver class.
		WebDriver browserObject = new ChromeDriver();
		// 3. Open the web page https://www.facebook.com/
		browserObject.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement obj = browserObject.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		
		Actions ref = new Actions(browserObject);
		ref.contextClick(obj).build().perform();
		
	}

}
