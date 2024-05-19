package UI;

import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertEquals;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest {
	
	@Test
	public void titleTest() {
	
		 String browser = "chrome"; // External configuration
		    WebDriver driver = null;
		    
		    if (browser.equals("firefox")) {
	            WebDriverManager.firefoxdriver().setup();
	            driver = new FirefoxDriver();
	        } else if (browser.equals("chrome")) {
	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();
	        } else if (browser.equals("edge")) {
	            WebDriverManager.edgedriver().setup();
	            driver = new EdgeDriver();
	        }
		    
		    String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		    
		    
	        // Open ebay website
	        driver.get("https://www.ebay.com/");

	        // Maximize the window
	        driver.manage().window().maximize();
	        
	        String actualTitle = driver.getTitle();		
	        
	        AssertJUnit.assertEquals(actualTitle, expectedTitle,"Title does not match!" );
	        driver.close();
		
		
	}
	
	}
	

