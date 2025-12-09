package nov_24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
  @Test
  public void Facebook() throws InterruptedException {
	  
	  WebDriver dr= new ChromeDriver();
	  dr.get("https://www.facebook.com/");
	  dr.manage().window().maximize();
	  String a = dr.getTitle();
	  System.out.println("Title = " +a);
	  String b = "faceboooook";
	  
	  SoftAssert s1= new SoftAssert();   //
	  s1.assertEquals(a, b);
	  
	  
	  System.out.println("Soft assert executaed,,..,.");
	  
	  
	  Thread.sleep(2000);
	  dr.close();
	  s1.assertAll(); //does not execute next line
  }
}
