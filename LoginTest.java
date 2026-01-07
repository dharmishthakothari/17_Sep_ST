package pkgTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.ExcelUtil;

public class LoginTest {

	@DataProvider(name = "loginData")
	public Object[][] fetchData() {
		Object[][] data;
		ExcelUtil obj = new ExcelUtil();
		data = obj.readExcel();
		return data;
	}

	WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
	}

	@Test(dataProvider = "loginData")
	public void f(String username, String pass) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("submit")).click();
	}
}
