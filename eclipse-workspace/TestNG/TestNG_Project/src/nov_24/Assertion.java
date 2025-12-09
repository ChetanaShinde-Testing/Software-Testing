package nov_24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
  @Test
  public void GooglePageOpen() throws InterruptedException {
	  WebDriver dr = new ChromeDriver();
	  dr.manage().window().maximize();
	  dr.get("https://www.google.com");
	  String n = dr.getTitle();
	  System.out.println("Title : "+dr.getTitle());
	  
	  String m = "Google"; // m= Google(Positive test case), Gmail (Negative test case)
	  Assert.assertEquals(n, m); //Google compair with Google
	  
	  
	  Thread.sleep(2000);
	  dr.close();
  }
}
