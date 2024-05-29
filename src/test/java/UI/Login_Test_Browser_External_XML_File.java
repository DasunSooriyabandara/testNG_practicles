package UI;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Test_Browser_External_XML_File {

//	public static String browser = "firefox"; // External configuration
	public static WebDriver driver;

	
	@Parameters({"browser"})
	@Test
	public void LaunchApplication(String browser) {
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

		// Open Sauce Demo website
		driver.get("https://www.saucedemo.com/");

		// Find the username field and enter username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		// Find the password field and enter password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		// Find and click the login button by RelativeLocator
		WebElement loginBtn = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("password")));
		loginBtn.click();

		
		
		

		// Close the browser window
		// driver.quit();

	}

}
