package nov_17;

import org.testng.annotations.Test;

public class Priority 

	{
	
		@Test(priority = 'a')
		public void Login() {
		System.out.println("Login Testcase");
	  
  }
	  @Test(priority = 1)
	  public void Registration() {
		  System.out.println("Registration Testcase");
		  
	  }
	  @Test(priority = -1)
	  public void Home() {
		  System.out.println("Home Testcase");
		  
	  }
	  @Test
	  public void Logout() {
		  System.out.println("Logout Testcase");
		  
	  }
}
