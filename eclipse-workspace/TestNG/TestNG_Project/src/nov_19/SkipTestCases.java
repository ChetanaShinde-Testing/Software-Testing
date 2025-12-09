package nov_19;

import org.testng.annotations.Test;

public class SkipTestCases {
	
	
     	@Test (priority = 0,enabled = false) //  enable = false, Used to skip Test Case
     	public void Profile() {
     	System.out.println("Profile Testcase");
  }
  
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
     	@Test (priority = 2)
     	public void Logout() {
     	System.out.println("Logout Testcase");
  
  
      
}
         
}
