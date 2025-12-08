package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr= new ChromeDriver();
		dr.get("https://practicetestautomation.com/practice-test-login/");
		dr.manage().window().maximize();
		WebElement we= dr.findElement(By.name("username"));
		we.sendKeys("abcd");
		we.clear();
		we.sendKeys("Admin");
		System.out.println(we.getTagName()); //input
		System.out.println(we.isDisplayed()); //true
		System.out.println(we.isEnabled()); //true
		System.out.println(we.isSelected()); //false
		System.out.println(we.getSize()); //(600, 48): Height & Width 
		System.out.println(we.getLocation()); //(652, 542) 
		System.out.println(we.getAttribute("value")); //wrirting value is mandatory (v small) (Output: Admin)
		System.out.println(we.getCssValue("font-size"));
		System.out.println(we.getText());
	}

}
