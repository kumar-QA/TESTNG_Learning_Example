package data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class commonFile {
	WebDriver driver;

	@BeforeMethod
	public void launchbrowser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
	}
	@AfterMethod
	public void closebrowser() {
		driver.close();
	}

}
