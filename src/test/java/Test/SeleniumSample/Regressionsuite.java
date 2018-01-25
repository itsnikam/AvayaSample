package Test.SeleniumSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Regressionsuite {

    
	
	
	@Test
	public void testverifyTitle() {
		ssdwewqeeqwe
		System.setProperty("webdriver.chome.driver", "C:\\Users\\Nikam3\\eclipse-workspace\\SeleniumSample\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.google.com");
		Assert.assertEquals(dr.getTitle(), "Google");
		dr.quit();
		
		
	}
}
