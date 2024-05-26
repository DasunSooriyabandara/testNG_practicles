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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


    
public class DataProvidersDemoTest {
//
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
//        
//    }
	
	
  //----------------------Test for method 1---------------------------------------
    @Test(dataProvider="dataSet",dataProviderClass=DataProviderFile.class)
    public void test(String username, String password)
    {
    	System.out.println(username+"===="+password);
    	
    }
    
    
    
  //----------------------Define data method 1---------------------------------------
    
    //###############################------Moved to External FIle--------#########################
//    @DataProvider
//    public Object[][] dataSet()    
//    {
//    	
//    	Object[][] dataset = new Object[4][2];    //---Like 4 columns and 2 rows------
//    	
//    	//First Row
//    	dataset[0][0] = "user1";
//    	dataset[0][1] = "password1";
//    	
//    	//Second Row
//    	dataset[1][0] = "user2";
//    	dataset[1][1] = "password2";
//    	
//    	//Third Row
//    	dataset[2][0] = "user3";
//    	dataset[2][1] = "password3";
//    			
//    	//Forth Row
//    	dataset[3][0] = "user4";
//    	dataset[3][1] = "password4";
//    	
//    	return dataset;
//    }
    
  //----------------------Test for method 2---------------------------------------
    
    @Test(dataProvider = "create",dataProviderClass=DataProviderFile.class) //-------can add dataProvider name insted of adding object name here
    public void testone(String username, String password, String test)
    {
    	
    	System.out.println(username+"===="+password+"==="+test);
    }
    
    
    
  //----------------------Define data method 2---------------------------------------
    
  //###############################------Moved to External FIle--------#########################
    
//    @DataProvider(name="create")
//    public Object[][] dataSettwo()
//    {
//    	return new Object[][]
//    			{{"username","password","test"},
//    			{"username1","password1","test"},
//    			{"username2","password2","test"},
//    			{"username3","password3","test"}};
//    	
//    }
    
}

