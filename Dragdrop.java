package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) throws Exception {

	WebDriver dr= new ChromeDriver();
	dr.get("https://demo.automationtesting.in/Static.html");
	dr.manage().window().maximize();
	
	WebElement we1= dr.findElement(By.id("angular")); //web-element for drag
	WebElement we2= dr.findElement(By.id("mongo"));   //web-element for drag
	WebElement we3= dr.findElement(By.id("node"));    //web-element for drag
	
	WebElement we4= dr.findElement(By.id("droparea"));  //web-element for drop
	
	Actions a= new Actions(dr);
	a.dragAndDrop(we1, we4).build().perform();
	Thread.sleep(3000);
	a.dragAndDrop(we2, we4).build().perform();
	Thread.sleep(3000);
	a.dragAndDrop(we3, we4).build().perform();
	Thread.sleep(3000);
	
	dr.close();
	

	
		
	
	}

}
