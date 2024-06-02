package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import common.BaseTest;

public class testUtils extends BaseTest{


    

    public void getScreenshots()  throws  IOException {
     

      
        
        Date currentdate = new Date();
//        System.out.println(currentdate);
        	String scrshotfilename = currentdate.toString().replace("", "-").replace(":","_");
        
        
        File screeenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screeenshotFile, new File("./screenshot/"+scrshotfilename+".png"));
       
        
    }
}

