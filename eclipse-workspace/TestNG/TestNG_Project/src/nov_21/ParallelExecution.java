package nov_21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelExecution {
	
	
  @Test(priority = 1)
  public void OpenChrome() {
	  WebDriver dr = new ChromeDriver();
	  dr.get("https://mail.google.com");
  }
  
  @Test(priority = 2)
  public void OpenFirefox() {
	  WebDriver dr = new FirefoxDriver();
	  dr.get("https://www.flipkart.com/");
  }
  
  @Test(priority = 2)
  public void OpenEdge() {
	  WebDriver dr = new EdgeDriver();
	  dr.get("https://www.myntra.com");
}
}
