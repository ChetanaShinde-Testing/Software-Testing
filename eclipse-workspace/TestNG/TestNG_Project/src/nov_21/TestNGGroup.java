package nov_21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGGroup {
		
  @Test(groups = "Smoke")
  public void Login() {
	  WebDriver dr= new ChromeDriver();
	  dr.get("https://www.saucedemo.com/");
	  dr.findElement(By.id("user-name")).sendKeys("standard_user");
	  dr.findElement(By.id("password")).sendKeys("secret_sauce");
	  dr.findElement(By.id("login-button")).click(); 
  }
  
  @Test(groups = "Smoke")
  public void Login1() {
	  WebDriver dr= new ChromeDriver();
	  dr.get("https://practicetestautomation.com/practice-test-login/");
	  dr.findElement(By.id("username")).sendKeys("student");
	  dr.findElement(By.id("password")).sendKeys("Password123");
	  dr.findElement(By.id("submit")).click();
  }
  
  @Test(groups = "Sanity")
  public void Login2() {
	  WebDriver dr= new ChromeDriver();
	  dr.get("https://www.myntra.com");
  }
  
  @Test(groups = "Sanity")
  public void Login3() {
	  WebDriver dr= new ChromeDriver();
	  dr.get("https://www.google.com");
  }
}
