package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pageObjects.Loginpage;




public class T001_LOGIN extends Base {
	
WebDriver driver;
@BeforeClass
	
		
		public void Login() {
		
	Loginpage LOG=new Loginpage(driver);

}
}	
		

