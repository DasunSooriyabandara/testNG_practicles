package UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest {

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

    @Test(priority = 1, description = "Verify the title of eBay homepage")
    public void titleTest() {
        String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";

        // Open eBay website
        driver.get("https://www.ebay.com/");

        // Get the actual title
        String actualTitle = driver.getTitle();

        // Print titles for debugging
        System.out.println("Actual Title: " + actualTitle);
        System.out.println("Expected Title: " + expectedTitle);

        // Verify the title
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match!");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
