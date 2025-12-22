package first;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirstTest {

	@BeforeTest
	public void bTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void aTest() {
		System.out.println("After Test");
	}

	@Test
	public void f() {
		System.out.println("This is First testNG class");
	}

	@Test
	public void f1() {
		System.out.println("Second test ");
	}

	@BeforeMethod
	public void bMethod() {
		System.out.println("Before method");
	}

	@AfterMethod
	public void aMethod() {
		System.out.println("After method");
	}

}
