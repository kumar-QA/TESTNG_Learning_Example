import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class login {
	WebDriver driver;

	@BeforeTest
	public void launchbrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
	}

	@Test()
	public void verifyWithValidlogin() throws InterruptedException {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		SoftAssert s=new SoftAssert();
		s.assertEquals("hi", "hello");
		driver.findElement(By.id("Password")).sendKeys("admin");
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);
//		String actualvalue=driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText();

		String actualvalue=driver.getTitle();
		String expectedvalue="Dashboa / nopCommerce administration";
		
////		Assert.assertEquals(actualvalue,expectedvalue);
//		Assert.assertTrue(driver.getTitle().equalsIgnoreCase(expectedvalue));
//		Assert.assertFalse(false);
//		
//		System.out.println("hi");
//		System.out.println("hidvdfv");
//		System.out.println("hidvfvbdfr");
		
		s.assertEquals(actualvalue, expectedvalue);
		System.out.println("1");
		
		System.out.println("2");
		System.out.println("3");
		System.out.println("hello");
		
		
		s.assertAll();
	}

	@Test
	
	public void verifyWithInValidlogin() {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@trdt.com");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("adminvbjb");
		driver.findElement(By.tagName("button")).click();
	}

	@Test()
	public void verifyWithValidusernameInvalidPwd() {

		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("adminvbjb");
		driver.findElement(By.tagName("button")).click();
	}

	@Test
	public void verifyWithInValidusernamevalidPwd() {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admindvrr@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		driver.findElement(By.tagName("button")).click();
	}

	@Test
	public void verifyWithEmptyLogin() {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.tagName("button")).click();
	}
	
@AfterTest
public void closebrowser() {
	driver.close();
}

}
