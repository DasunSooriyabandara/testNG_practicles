package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


    
public class DataProviders_Real_Login_Test {

    WebDriver driver;
    String browser = "chrome"; // External configuration

    @BeforeMethod
    public void setUp() {
        // Setup WebDriver based on the specified browser
        switch (browser.toLowerCase()) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                throw new IllegalArgumentException("Invalid browser type specified.");
        }

        // Maximize the window
        driver.manage().window().maximize();        
        
    }
      
  //----------------------Test for method 2---------------------------------------
    
    @Test(dataProvider = "create") //-------can add dataProvider name insted of adding object name here
    public void testone(String username, String password)
    {
    	
    	driver.get("https://www.saucedemo.com/v1/");
    	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
    	
    	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
    	driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
    	
    }
    
    
    
  //----------------------Define data method 2---------------------------------------
    
    @DataProvider(name="create")
    public Object[][] dataSettwo()
    {
    	return new Object[][]
    			{{"standard_user","secret_sauce"},
    			{"locked_out_user","secret_sauce"},
    			{"problem_user","secret_sauce"},
    			{"performance_glitch_user","secret_sauce"}};
    	
    }
    @AfterMethod
    public void closebrowser()
    {
    	driver.close();
    }
    
}

