import org.testng.annotations.Test;

public class priorityDemo {


	@Test(invocationCount = 4)
	public void B() {
		System.out.println("B method");		
	}
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
