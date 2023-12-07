package data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class demo extends commonFile{
	
//	int e=100;
//	int f=200;
//	
//	
//	 public void Add(int a,int b) {
//	  	 System.out.println(a+b);
//	 }
//	
//	public void sub(int c,int d) {
//		System.out.println(c-d);
//	}
//	@Test()
//	public void logindata() {
//		
//	}
//
//	public static void main(String[] args) {
//		demo d=new demo();
//		d.Add(20, 30);
//		d.sub(100, 50);
//		System.out.println(d.e);
//		System.out.println(d.f);
//	}

	
	@Parameters({"username","password"})
	@Test()
	public void verifyWithValidlogin(String username,String pwd) throws InterruptedException {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.tagName("button")).click();
		
	}
	
}
