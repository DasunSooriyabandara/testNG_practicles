package UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.CommonDataSetup;
import io.github.bonigarcia.wdm.WebDriverManager;


   
public class ReportGenerate extends CommonDataSetup {

//    WebDriver driver;
//    String browser = "chrome"; // External configuration
//
//    @BeforeMethod
//    public void setUp() {
//        // Setup WebDriver based on the specified browser
//        switch (browser.toLowerCase()) {
//            case "firefox":
//                WebDriverManager.firefoxdriver().setup();
//                driver = new FirefoxDriver();
//                break;
//            case "chrome":
//                WebDriverManager.chromedriver().setup();
//                driver = new ChromeDriver();
//                break;
//            case "edge":
//                WebDriverManager.edgedriver().setup();
//                driver = new EdgeDriver();
//                break;
//            default:
//                throw new IllegalArgumentException("Invalid browser type specified.");
//        }
//
//        // Maximize the window
//        driver.manage().window().maximize();
//    }

    @Test
    public void Reporter_Test_1() {
    	System.out.println("Test  One");
        
        
    }
    @Test
    public void Reporter_Test_2() {
    	Reporter.log("This is test2"); //---------------
    	System.out.println("Test Two");
    }
    
    @Test
    public void Reporter_Test_3() {
    	System.out.println("Test Three");
    }
    
    @Test
    public void Reporter_Test_4() {
    	Reporter.log("This is test4"); 
    	System.out.println("Test Four");
    }
    
    @Test
    public void Reporter_Test_5() {
    	System.out.println("Test Five");
    }
}

