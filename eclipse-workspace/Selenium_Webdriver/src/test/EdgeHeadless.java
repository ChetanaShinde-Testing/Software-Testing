package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeHeadless {

	public static void main(String[] args) {

		
		EdgeOptions c1 = new EdgeOptions();
		c1.addArguments("--Headless");
		
		WebDriver dr= new EdgeDriver(c1);
		dr.get("https://www.facebook.com");
		
		System.out.println(dr.getTitle());
		System.out.println(dr.getCurrentUrl());
		}
	}


