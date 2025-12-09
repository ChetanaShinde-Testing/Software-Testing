package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver dr= new ChromeDriver();
		dr.get("https://demo.automationtesting.in/Alerts.html");
		dr.manage().window().maximize();
		WebElement we= dr.findElement(By.xpath("//button[@class='btn btn-danger']"));
		we.click();
		Alert al= dr.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
		
	}

}
