package UI;

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
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


@Test(groups="user-Resgistration")    //----------------CAN GROUP THE CLASSES ALSO----------------------------
public class Annotations {

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
    
    
    @BeforeClass           //-------------------------BEFORE CLASS---------------------
    public void beforeClass()
    {
    	System.out.println("Run this Before class");
    	//need to enter real test cases
    }

    
    @AfterClass            //-------------------------AFTER CLASS---------------------
    public void afterClass()
    {
    	System.out.println("Run this After class");
    	//need to enter real test cases
    }
    
    
    @BeforeGroups(value="regression")             //-------------------------BEFPRE GROUP---------------------
    public void beforeGroup()                     //--------This runs before regression groups runs------------  
    {
    	System.out.println("Run this Method Before regression");
    	//need to enter real test cases
    }
    
    
    @AfterGroups(value="regression")             //-------------------------AFTER GROUP---------------------
    public void afterGroup()                     //--------This runs After regression groups runs------------  
    {
    	System.out.println("Run this Method After regression");
    	//need to enter real test cases
    }
    
    
    
    @Test(priority = 1, groups="regression") 
    public void Atest() {
    	System.out.println("Test  One");
        
        
    }
    @Test(priority = 2, groups="regression"  )
    public void Btest() {
    	System.out.println("Test Two");
    }
    
    @Test(groups= {"regression","smoke"})
    public void Ctest() {
    	System.out.println("Test Three");
    }
    
    @Test(groups="smoke")
    public void Dtest() {
    	System.out.println("Test Four");
    }
    
    @Test(groups="smoke")
    public void Etest() {
    	System.out.println("Test Five");
    }
}

