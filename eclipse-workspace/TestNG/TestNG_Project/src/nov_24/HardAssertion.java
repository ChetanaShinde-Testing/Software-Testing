package nov_24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
  @Test
  public void Myntra() throws InterruptedException {
  
  WebDriver dr = new ChromeDriver();
  dr.get("https://www.myntra.com");
  dr.manage().window().maximize();
  String c = dr.getTitle();
  System.out.println("Title : "+c);
  String d = "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
  Assert.assertEquals(c, d);
  
  System.out.println("Assertion Completed....");
  Thread.sleep(2000);
  dr.close();
  
  
  
  
  }
}
