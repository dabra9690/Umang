package Com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkoutpage {
	WebDriver driver;
	
	//By chekoutbtn=By.xpath("//button[@id='remove-sauce-labs-backpack']");
	
//By firstname=By.id("first-name");	By lastname=By.id("last-name");
	
//	By postcode=By.id("postal-code");
	
//	By contibtn=By.id("continue");


public void checkout() {

	By chekoutbtn=By.xpath("//button[@id='remove-sauce-labs-backpack']");
	driver.findElement(chekoutbtn).click();
}
//public void enterfirstname(String name) {
	//driver.findElement(firstname).sendKeys("vivek");
//}
//public void enterlastname(String name) {
	//driver.findElement(lastname).sendKeys("dabra");
//}
//public void enterpincode(int pin) {
	//driver.findElement(postcode).sendKeys("2345");
//}
//public void continewbtn()
{
	//driver.findElement(contibtn).click();
}
public Checkoutpage(WebDriver driver)
{
    

    this.driver=driver;}
}
