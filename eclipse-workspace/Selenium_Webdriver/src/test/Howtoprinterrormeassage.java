package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Howtoprinterrormeassage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr= new ChromeDriver();
		dr.get("https://practicetestautomation.com/practice-test-login/");
		dr.manage().window().maximize();
		WebElement we= dr.findElement(By.id("submit"));
		we.click();
		WebElement we1= dr.findElement(By.id("error"));
		System.out.println(we1.getText());
	}

}
