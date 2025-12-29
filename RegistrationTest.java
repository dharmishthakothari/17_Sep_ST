package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegistrationTest {
	WebDriver driver;
	@Parameters({"browser"})
	@BeforeMethod
	public void openBrowser(String browser_name)	
	{
		if(browser_name.equals("chrome"))
		{
			driver=new ChromeDriver();
		}else
			driver=new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");

	}
	@Parameters({"name","pass"})
	@Test
	public void f(String name1, String pass1) {
		
		driver.findElement(By.name("userName")).sendKeys(name1);
		driver.findElement(By.name("password")).sendKeys(pass1);
		driver.findElement(By.name("submit")).click();  }
}
