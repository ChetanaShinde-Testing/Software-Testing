package nov_19;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestCases1 {
	
	
 	@Test (priority = 0)
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
 	throw new SkipException ("Facing some issue"); //should always be 1st line and should not have code line after 
 	
 	//System.out.println("Home Testcase");
  
}
 	@Test (priority = 2)
 	public void Logout() {
 	System.out.println("Logout Testcase");


  
}
}
