package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	@BeforeMethod
	void openBrowser()
	{
		
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
	}
	
	@Test
	public void postive() {
	
		
		driver.findElement(By.name("userName")).sendKeys("a");
		driver.findElement(By.name("password")).sendKeys("a");
		driver.findElement(By.name("submit")).click();
	}
	@Test
	public void negativeTesting()
	{
		driver.findElement(By.name("userName")).sendKeys("abc");
		driver.findElement(By.name("password")).sendKeys("a");
		driver.findElement(By.name("submit")).click();
	}	
	
	@Test
	public void negativeTesting1()
	{
		driver.findElement(By.name("userName")).sendKeys("12312323213213213213312");
		driver.findElement(By.name("password")).sendKeys("a");
		driver.findElement(By.name("submit")).click();
	}	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
		
	
}
