package com.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TableHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		
		
		List<WebElement> lstTr= driver.findElements(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr"));
		System.out.println(lstTr.size());
		for(int i=2;i<=lstTr.size();i++)
		{
			WebElement eleBookname=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+i+"]/td[1]"));
			WebElement eleAuther=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+i+"]/td[2]"));
			WebElement eleSubject=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+i+"]/td[3]"));
			WebElement elePrice=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+i+"]/td[4]"));
			
			System.out.println("BookName "+eleBookname.getText());
			System.out.println("Author "+eleAuther.getText());
			System.out.println("Subject "+eleSubject.getText());
			System.out.println("Price "+elePrice.getText());
			
			
		}
		
		
		//*[@id="HTML1"]/div[1]/table/tbody/tr[2]/td[1]
		//*[@id="HTML1"]/div[1]/table/tbody/tr[2]/td[2]
		//*[@id="HTML1"]/div[1]/table/tbody/tr[2]/td[3]


		
		
		
	}

}
