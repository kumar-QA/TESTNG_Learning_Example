package data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class login extends commonFile {
	

//	@BeforeTest
//	public void launchbrowser() {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://admin-demo.nopcommerce.com/login");
//	}
	
	@Test()
	@Parameters({"username","password"})
	public void verifyWithValidlogin(String username,String pwd) throws InterruptedException {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.tagName("button")).click();
	}

//	@Test
//	
//	public void verifyWithInValidlogin() {
//		driver.findElement(By.id("Email")).clear();
//		driver.findElement(By.id("Email")).sendKeys("admin@trdt.com");
//		driver.findElement(By.id("Password")).clear();
//		driver.findElement(By.id("Password")).sendKeys("adminvbjb");
//		driver.findElement(By.tagName("button")).click();
//	}

//	@Test()
//	public void verifyWithValidusernameInvalidPwd() {
//
//		driver.findElement(By.id("Email")).clear();
//		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
//		driver.findElement(By.id("Password")).clear();
//		driver.findElement(By.id("Password")).sendKeys("adminvbjb");
//		driver.findElement(By.tagName("button")).click();
//	}
//
//	@Test
//	public void verifyWithInValidusernamevalidPwd() {
//		driver.findElement(By.id("Email")).clear();
//		driver.findElement(By.id("Email")).sendKeys("admindvrr@yourstore.com");
//		driver.findElement(By.id("Password")).clear();
//		driver.findElement(By.id("Password")).sendKeys("admin");
//		driver.findElement(By.tagName("button")).click();
//	}
//
//	@Test
//	public void verifyWithEmptyLogin() {
//		driver.findElement(By.id("Email")).clear();
//		driver.findElement(By.id("Password")).clear();
//		driver.findElement(By.tagName("button")).click();
//	}
//	
//@AfterTest
//public void closebrowser() {
//	driver.close();
//}

}
