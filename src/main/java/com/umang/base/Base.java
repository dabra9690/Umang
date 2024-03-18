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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
    public static Properties prop;
    public static WebDriver driver;

    @BeforeTest
    public void loadconfig() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(
                    System.getProperty("user.dir") + "\\Configuration\\config.properties");
            prop.load(ip);

           // System.out.print("ip");
           // System.out.print(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void launchapp() {
        WebDriverManager.chromedriver().setup();
        String browserName = prop.getProperty("browser");
        
        //System.out.print("browserNAME");
       // System.out.print(browserName);

        if (browserName.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("IE")) {
            driver = new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        driver.get(prop.getProperty("url"));
    }
}