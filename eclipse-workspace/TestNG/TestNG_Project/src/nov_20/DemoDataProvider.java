package nov_20;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DemoDataProvider {
  @Test(dataProvider = "dp")
  
  
	  
	  public void Login(String Username, String Password) throws InterruptedException {
		  WebDriver dr = new ChromeDriver();
		  dr.manage().window().maximize();
		  dr.get("http://testphp.vulnweb.com/login.php");
		  dr.findElement(By.name("uname")).sendKeys(Username);
		  Thread.sleep(2000);
		  dr.findElement(By.name("pass")).sendKeys(Password);
		  Thread.sleep(2000);
		  //dr.findElement(By.xpath("//input[@value='login']")).click();
		  dr.close();
	  
	  
	  	  
	    
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Chetana", "a" },
      new Object[] { "Pass", "b" },
    };
  }
}
