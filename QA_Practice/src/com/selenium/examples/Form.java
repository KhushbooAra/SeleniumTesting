package com.selenium.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Program Files\\chromedriver.exe");
		// 2. Initialize Webdriver object through ChromeDriver class.
		WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.amazon.com/ link using get method.
		browserObject.get("http://www.training.qaonlinetraining.com/testPage.php");
		browserObject.findElement(By.name("name")).sendKeys("Khushboo");
		browserObject.findElement(By.name("email")).sendKeys("Khushboo@gmail.com");
		browserObject.findElement(By.name("website")).sendKeys("Khushboo.com");
		browserObject.findElement(By.name("comment")).sendKeys("no comment");
		
		browserObject.findElement(By.xpath("/html/body/form/input[4]")).click();
		Thread.sleep(4000);
		browserObject.findElement(By.xpath("//input[@value='male']")).click();
		
		browserObject.findElement(By.name("bike")).click();
		browserObject.findElement(By.xpath("/html/body/form/input[8]")).click();
		browserObject.findElement(By.xpath("//input[@value='boat']")).click();
		browserObject.findElement(By.name("horse")).click();
		
		Select objSelect = new Select(browserObject.findElement(By.name("country")));
		
		objSelect.selectByVisibleText("India");
		objSelect.selectByVisibleText("Ethiopia");
		
		browserObject.findElement(By.name("submit")).click();
		
		
	}

}
