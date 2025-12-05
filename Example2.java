package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Open Browser 
		//WebDriver driver=new ChromeDriver();
		
		WebDriver driver=new FirefoxDriver();
		
		
		//Enter URL 
		String URL= "http://www.google.com";
		driver.get(URL);
		
		driver.manage().window().maximize();
		
		System.out.println("Before clicking on About "+driver.getCurrentUrl());
		System.out.println("Title "+driver.getTitle());
		
		
		WebElement ele=driver.findElement(By.linkText("About"));
		ele.click();
		
		System.out.println("After clicking on About "+driver.getCurrentUrl());
		System.out.println("Title "+driver.getTitle());
	}

}
