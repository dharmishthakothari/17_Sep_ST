package com.basic;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7_a_tags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//a tags fetch 
		//links see
		List<WebElement> lstElements= driver.findElements(By.tagName("a"));
		
		//System.out.println(lstElements);
		Iterator<WebElement> i=lstElements.iterator();
		while(i.hasNext())
		{
			WebElement ele=i.next();
			System.out.println(ele.getText());
			if(ele.getText().equals("Prime"))
			{
				ele.click();
				break;
			}
		}
		
		driver.navigate().back();
		
		
		//System.out.println(lstElements.size());
		
	}

}
