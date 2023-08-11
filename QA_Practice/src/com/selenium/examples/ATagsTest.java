package com.selenium.examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ATagsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize WebDriver object through ChromeDriver class.
		WebDriver browserObject = new ChromeDriver();
		// 3. Open the web page https://www.facebook.com/
		browserObject.get("http://demo.itlearn360.com/");

		List<WebElement> allTags = browserObject.findElements(By.tagName("a"));
		int count = 0;
		for (WebElement e : allTags) {

			System.out.println(e.getAttribute("href"));
			count++;
		}
		System.out.println("total links : "+count);
	}

}
