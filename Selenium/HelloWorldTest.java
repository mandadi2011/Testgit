package com.org.LearningMaven.MyMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HelloWorldTest {
	WebDriver driver;
	int RR =120;
	@BeforeTest
	public void LaunchBrowser(){
		System.out.println("Login");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mandadi_80\\Documents\\chromedriver\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\mandadi_80\\Documents\\geckodriver\\geckodriver.exe");
		//driver = new FirefoxDriver();
		System.out.println("Login to application");
		driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		System.out.println("Launch the application in chrome");
		
	}
	
	@Test
	@Parameters({"username","password"})
	public void Login(String username,String password){
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
		System.out.println("Username:" + username);
		System.out.println("Password:"+ password);
	}
	@AfterTest
	public void CloseBrowser(){
		System.out.println("Close Browser");
		driver.close();
		System.out.println("Ravi");
	}

}
