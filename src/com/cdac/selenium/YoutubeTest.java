package com.cdac.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Seng\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.youtube.com/watch?v=jMhIWSgyDxc";
		driver.get(baseUrl);
		try{
			Thread.sleep(10000);
		}catch(Exception e){
			e.printStackTrace();
		}
		driver.close();
	}
}