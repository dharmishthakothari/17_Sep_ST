package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_cssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("#nav-xshop > ul > li:nth-child(14) > div > a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[6]/div[2]/div/div/ul/li[10]/div/a")).click();
	}

}
