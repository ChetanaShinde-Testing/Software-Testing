package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlessbrowser1 {

	public static void main(String[] args) {

		
	ChromeOptions c1 = new ChromeOptions();
	c1.addArguments("--Headless");
	
	WebDriver dr= new ChromeDriver(c1);
	dr.get("https://www.facebook.com");
	
	System.out.println(dr.getTitle());
	System.out.println(dr.getCurrentUrl());
	}

}
