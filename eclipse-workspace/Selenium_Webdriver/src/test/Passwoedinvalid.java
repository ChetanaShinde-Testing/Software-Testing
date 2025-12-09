package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Passwoedinvalid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr= new ChromeDriver();
		dr.get("https://practicetestautomation.com/practice-test-login/");
		dr.manage().window().maximize();
		WebElement we= dr.findElement(By.id("username"));
		we.sendKeys("student");
		WebElement we1= dr.findElement(By.id("password"));
		we1.sendKeys("1234");
		WebElement we2= dr.findElement(By.id("submit"));
		we2.click();
		WebElement we3= dr.findElement(By.id("error"));
		we3.click();
		System.out.println(we3.getText());
		
		WebElement we4= dr.findElement(By.id("username"));
		we4.sendKeys("123");
		WebElement we5= dr.findElement(By.id("password"));
		we5.sendKeys("Password123");
		WebElement we6= dr.findElement(By.id("submit"));
		we6.click();
		WebElement we7= dr.findElement(By.id("error"));
		we7.click();
		System.out.println(we7.getText());
	}
}