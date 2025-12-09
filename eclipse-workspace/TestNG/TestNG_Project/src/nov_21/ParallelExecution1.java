package nov_21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecution1 {
	
	
  @Test(groups = "Smoke")
  public void SwagLAbLogin() {
	  WebDriver dr= new ChromeDriver();
	  dr.get("https://www.saucedemo.com/");
	  dr.findElement(By.id("user-name")).sendKeys("standard_user");
	  dr.findElement(By.id("password")).sendKeys("secret_sauce");
	  dr.findElement(By.id("login-button")).click();
	  
  }
  
  @Test
  public void TestLogin() {
	  WebDriver dr= new ChromeDriver();
	  dr.get("https://practicetestautomation.com/practice-test-login/");
	  dr.findElement(By.id("username")).sendKeys("student");
	  dr.findElement(By.id("password")).sendKeys("Password123");
	  dr.findElement(By.id("submit")).click();

  }
}
