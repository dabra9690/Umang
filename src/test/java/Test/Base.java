package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Base {
	WebDriver driver;
	@Test
	//@BeforeClass
	
	
			public void login() {
			
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://web.umang.gov.in/");
			
	
	}
	}

