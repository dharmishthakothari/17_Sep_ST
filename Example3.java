package com.basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		
		//Enter URL 
		String URL= "https://demo.guru99.com/test/newtours/index.php";
		driver.get(URL);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//user name text box 
		WebElement ele=driver.findElement(By.name("userName"));
		//send searching text
		ele.sendKeys("a");
		
		
		//password box
		WebElement ele_pass=driver.findElement(By.name("password"));
		ele_pass.sendKeys("a");
		//Submit button
		WebElement eleBtn=driver.findElement(By.name("submit"));
		eleBtn.click();
	}

}
