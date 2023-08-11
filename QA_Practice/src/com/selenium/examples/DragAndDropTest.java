package com.selenium.examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize Webdriver object through ChromeDriver class.
		WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.amazon.com/ link using get method.
		browserObject.get("http://jqueryui.com/droppable/");
		
		//implicit wait 
		browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		//explicit wait
		
		
		browserObject.switchTo().frame(0);
		WebElement refSource = browserObject.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
		
		WebElement refTarget = browserObject.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions obj = new Actions(browserObject);
		
		obj.dragAndDrop(refSource, refTarget).build().perform();
		
		browserObject.close();
		
		
	}

}
