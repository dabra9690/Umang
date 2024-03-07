package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	WebDriver driver;
	By mobileNo = By.xpath("//input[@id='mat-input-0']");

	
	By MPIN=By.xpath("//input[@id='mat-input-1']");
	By loginbtn=By.xpath("//button[@class='btn']");
	

	public void mobilenoFIELD()
	
	{

		driver.findElement(mobileNo).sendKeys("8279839183");
	}

	public void mpin() {

		driver.findElement(MPIN).sendKeys("969041");
	}
	
	
	public void loginbtn() {

		driver.findElement(loginbtn).click();
	}
	public Loginpage(WebDriver driver)
    {
		
        
 
        this.driver=driver;}

	
	}



