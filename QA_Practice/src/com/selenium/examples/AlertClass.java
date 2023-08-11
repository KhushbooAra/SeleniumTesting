package com.selenium.examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Program Files\\chromedriver.exe");
		// 2. Initialize Webdriver object through ChromeDriver class.
		WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.amazon.com/ link using get method.
		browserObject.get("http://www.training.qaonlinetraining.com/testPage.php");
		browserObject.manage().window().maximize();
		browserObject.findElement(By.id("alert")).click();
		
		Alert alertObj = browserObject.switchTo().alert();
		System.out.println(alertObj.getText());
		alertObj.accept();
		Thread.sleep(5000);
		browserObject.findElement(By.id("confirm")).click();
		Alert confirmObj = browserObject.switchTo().alert();
		Thread.sleep(5000);
		confirmObj.dismiss();
		Thread.sleep(5000);
		
		browserObject.findElement(By.id("prompt")).click();
		Alert promptObj = browserObject.switchTo().alert();
		Thread.sleep(5000);
		promptObj.sendKeys("training");
		Thread.sleep(5000);
		promptObj.accept();
		Thread.sleep(5000);
		browserObject.close();

	}

}
