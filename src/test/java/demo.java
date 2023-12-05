import org.testng.annotations.Test;

public class demo {
	
	int e=100;
	int f=200;
	
	
	 public void Add(int a,int b) {
	  	 System.out.println(a+b);
	 }
	
	public void sub(int c,int d) {
		System.out.println(c-d);
	}
	@Test()
	public void logindata() {
		
	}

	public static void main(String[] args) {
		demo d=new demo();
		d.Add(20, 30);
		d.sub(100, 50);
		System.out.println(d.e);
		System.out.println(d.f);
	}

}
