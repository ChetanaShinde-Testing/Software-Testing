package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownlist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver dr= new ChromeDriver();
		dr.get("https://practice.expandtesting.com/dropdown#google_vignette");
		dr.manage().window().maximize();
		
		WebElement we= dr.findElement(By.id("country"));
		Select sc = new Select(we);
		sc.selectByIndex(2);
		Thread.sleep(3000);
		sc.selectByVisibleText("Peru");
		Thread.sleep(3000);
		System.out.println(we.getText());
		
		
		WebElement we1= dr.findElement(By.id("elementsPerPageSelect"));
		Select sc1 = new Select(we1);
		sc1.selectByIndex(3);
		Thread.sleep(3000);
		sc1.selectByVisibleText("100");
		Thread.sleep(3000);
		System.out.println(we1.getText());
		
		dr.close();
		
		
		
	}

}
