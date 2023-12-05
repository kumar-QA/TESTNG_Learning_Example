import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Attribuets {
//
	@DataProvider
	@Test(description = "it acts as data provider")
	public String[][] dataForLogin() {
		String obj[][]= {{"kumar","pw123"},{"prasanna","kumar123"},{"rajesh","raj123"}};
		return obj;
	}

	@Test(dataProvider = "dataForLogin")
	public void login(String username,String pwd) {
	System.out.println(username);
	System.out.println(pwd);
	Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = "login",alwaysRun = true)
	public void  ProductPage(){
		
	}
		
	
	@Test(timeOut = 1000,description = "")
	public void delay() throws InterruptedException {
		Thread.sleep(500);
		System.out.println("hiiiii");
	}
	
}
