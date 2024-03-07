package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.pageobjects.Loginpage;

public class T001_LOGIN extends base  {
	
	

	

	

	

	@Test
	public void loginviv()
	
	{
		Loginpage login=new Loginpage(driver);
		
		login.mobilenoFIELD();
		
		login.mpin();
		login.loginbtn();
		//String expectedUrl = "https://web.umang.gov.in/web_new/login";
		//String actualUrl = driver.getCurrentUrl();
		//Assert.assertEquals(actualUrl, expectedUrl, "Login unsuccessful");
		WebElement element = driver.findElement(By.xpath("//img[@class='arrow-down']"));
		element.click();
        Assert.assertTrue(element.isDisplayed(), "Element is not visible");
	}
	
	
	
	
	
	
	
	

}
