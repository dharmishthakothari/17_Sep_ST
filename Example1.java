package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Open Browser 
		WebDriver driver=new ChromeDriver();
		
		
		//Enter URL 
		String URL= "http://www.google.com";
		driver.get(URL);
		
		
		System.out.println(driver.getTitle());
		
		//Object Indetification
		WebElement ele=driver.findElement(By.linkText("About"));
		ele.click();
		
		System.out.println("After Clicking on About "+driver.getTitle());

		driver.quit();
	}

}
