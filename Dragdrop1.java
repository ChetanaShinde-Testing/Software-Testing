package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop1 {

	public static void main(String[] args) throws Exception {

		
	WebDriver dr= new ChromeDriver();
	dr.get("https://demo.guru99.com/test/drag_drop.html");
	Thread.sleep(2000);
	dr.manage().window().maximize();
	
	WebElement we1= dr.findElement(By.xpath("//li[@data-id='5']"));       //web-element for drag
	WebElement we2= dr.findElement(By.xpath("//a[text()=\" 5000 \"]"));   //web-element for drag
	
	Thread.sleep(6000);
	
	WebElement we3= dr.findElement(By.xpath("//ol[@id='bank']"));  //web-element for drop
	WebElement we4= dr.findElement(By.xpath("//ol[@id='amt7']"));  //web-element for drop
	
	
	Actions a= new Actions(dr);
	a.dragAndDrop(we1, we3).build().perform();

	Thread.sleep(5000);
	
	a.dragAndDrop(we2, we4).build().perform();
	
	Thread.sleep(5000);
	
	dr.close();
	}

}
