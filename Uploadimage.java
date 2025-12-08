package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadimage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr= new ChromeDriver();
		dr.get("https://demo.automationtesting.in/Register.html");
		
		WebElement we= dr.findElement(By.id("imagesrc"));
		we.sendKeys("C:\\Users\\Chetana\\Downloads\\Photo.jpeg"); // right path
		
		//	we.sendKeys(\"C:\Users\Chetana\Downloads\Photo.jpeg\"); // wrong path
		
		//dr.close();
	}

}
