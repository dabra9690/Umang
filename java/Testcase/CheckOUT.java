package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckOUT extends Homescreen  {
	WebDriver driver;
	@Test
		public void main(String args[]) {
	System.out.println("test ");
	WebElement vv=driver.findElement(By.xpath("//*[@id='remove-sauce-labs-backpack']"));           //("//*[@id='remove-sauce-labs-backpack']");
	vv.click();
		}
	


//	@Test
	/*public void checkoutpagescreen() {
		System.out.println("test ");
		WebElement vv=driver.findElement(By.xpath("//*[@id='remove-sauce-labs-backpack']"));           //("//*[@id='remove-sauce-labs-backpack']");
		vv.click();*/
		//Checkoutpage ch = new Checkoutpage(driver);
		//ch.checkout();
	//ch.enterfirstname("viek");//
	//	ch.enterlastname("last");
	//ch.enterpincode(87);//
//ch.continewbtn();
	}
	
	
	
	
	
	
	
