package nov_19;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Login {
	WebDriver dr= new ChromeDriver();
	@Parameters({"UserName","Password"}) // Always addtestNG annotation package
  @Test
  public void Login1(String UserName, String Password) throws InterruptedException {
	  dr.findElement(By.name("name")).sendKeys(UserName);
	  Thread.sleep(2000);
	  dr.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys(Password);
	  Thread.sleep(2000);
	  dr.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  dr.get("https://automationexercise.com/login");
	  Thread.sleep(2000);
	  dr.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	 dr.close();
  }

}
