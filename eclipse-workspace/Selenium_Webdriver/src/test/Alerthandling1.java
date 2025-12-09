package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver dr= new ChromeDriver();
		dr.get("https://demo.automationtesting.in/Alerts.html");
		dr.manage().window().maximize();
		Thread.sleep(3000);
		WebElement we= dr.findElement(By.xpath("//a[@href='#CancelTab']"));
		we.click();
		Thread.sleep(3000);
		WebElement we1= dr.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		we1.click();
		Thread.sleep(5000);
		Alert a1= dr.switchTo().alert();
		System.out.println(a1.getText());
		a1.accept();
		
	}

}
