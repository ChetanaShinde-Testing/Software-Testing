package nov_26;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Keywords_driven_framework {
  @Test
  public void f() throws InterruptedException, IOException {
	  
	  WebDriver dr = new ChromeDriver();
	  dr.get("https://practicetestautomation.com/practice-test-login/");
	  dr.manage().window().maximize();
	  
	  Properties pr= new Properties();   //syntax for properties
	  //  pr.load("C:\\Users\\Chetana\\eclipse-workspace\\TestNG\\TestNG_Project\\src\\nov_26\\InputDats.properties");
	  
	  FileReader fr = new FileReader("C:\\Users\\Chetana\\eclipse-workspace\\TestNG\\TestNG_Project\\src\\nov_26\\InputDats.properties");
	  pr.load(fr);
	  
	  
	  dr.findElement(By.id("username")).sendKeys(pr.getProperty("Username"));
	  dr.findElement(By.id("password")).sendKeys(pr.getProperty("Password"));
	  System.out.println("Title: Log in sucessfully!!!!!");
	  
	  
	  dr.close();
	  Thread.sleep(2000);
  }
}
