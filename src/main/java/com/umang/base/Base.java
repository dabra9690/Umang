package com.umang.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static Properties prop;
	public static WebDriver driver;

	public void loadconfig() throws IOException {
		
		Properties prop=new Properties();
		
		FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"configuration\\config.properties");
		
		try {
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	public static void launchapp() {
		WebDriverManager.chromedriver().setup();
		String browserName = prop.getProperty("browser");
		if (browserName.contains("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.contains("FireFox")) {
			driver=new FirefoxDriver();
		
		}else if (browserName.contains("IE")) {
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
		driver.get("url");
	}

	
	

	
		
	}}
