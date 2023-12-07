package data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class priorityDemo extends commonFile{

	
	@Parameters({"username","password"})
	@Test()
	public void verifyWithValidlogin(String username,String pwd) throws InterruptedException {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.tagName("button")).click();
	}
	
	
//
//	@Test(invocationCount = 4)
//	public void B() {
//		System.out.println("B method");		
//	}
//	@Test(priority = -2)
//	public void C() {
//		System.out.println("C method");
//	}
//	@Test(priority = 0)
//	public void D() {
//		System.out.println("D method");
//	}
//	@Test(priority = 0)
//	public void E() {
//		System.out.println("E method");
//	}
//	@Test //CABDE
//	public void A() {
//		System.out.println("A method");
//	}
}
