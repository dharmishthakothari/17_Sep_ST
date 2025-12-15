package com.basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("alertBtn")).click();
		Alert a1=driver.switchTo().alert();
		try {
		Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(a1.getText());
		
		a1.accept();
		
		
	}

}
