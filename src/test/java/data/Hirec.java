package data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hirec extends commonFile {


	
	@Test()
	@Parameters({"username","password"})
	public void verifyWithValidlogin(String username,String pwd) throws InterruptedException {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.tagName("button")).click();
	}
	
//	@BeforeTest
//	public void m2() {
//		System.out.println("Before Test is triggred");
//	}
//	@BeforeClass
//	public void m3() {
//		System.out.println("Before class is triggred");
//	}
//	@BeforeMethod
//	public void m4() {
//		System.out.println("Before method is triggred");
//	}
//	@Test
//	public void m5() {
//		System.out.println("test1 is triggred");
//	}
//	@Test
//	public void m10() {
//		System.out.println("test2 is triggred");
//	}
//	
//	@AfterMethod
//	public void m6() {
//		System.out.println("After method is triggred");
//	}
//	@AfterClass
//	public void m7() {
//		System.out.println("After class is triggred");
//	}
//	@AfterTest
//	public void m8() {
//		System.out.println("After test is triggred");
//	}
//	
//	@AfterSuite
//	public void m9() {
//		System.out.println("After suite is triggred");
//	}
//	
//	@BeforeSuite
//	public void m1() {
//		System.out.println("Before suite is triggred");
//	}
}
