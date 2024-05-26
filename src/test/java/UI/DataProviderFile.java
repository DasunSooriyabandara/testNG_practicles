package UI;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderFile {

	// ---------------------------------First	// Method-----------------------------------

//	@DataProvider
//	public Object[][] dataSet()    
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
//	
//	@DataProvider(name="create")
//    public Object[][] dataSettwo()
//    {
//    	return new Object[][]
//    			{{"username","password","test"},
//    			{"username1","password1","test"},
//    			{"username2","password2","test"},
//    			{"username3","password3","test"}};
//    	
//    }

	// ---------------------------------Second Method----Using if else Methods-----------------------------------
	// -------------Please comment one method before run the code---------------------------

	public Object[][] dataSettwo(Method m)
    {
    	
    Object [][] testdata = null;
    
    if(m.getName().equals("test"))
    	{
    		testdata = new Object[][]
    				
    	
    			{
    				{"username","password"},
    				{"username1","password1"},
    				{"username2","password2"},
    				{"username3","password3"}
    			};
    	}
    	
    
     else if(m.getName().equals("test1"))
     	{
    	 testdata = new Object[][]
 				
    		    	
    	    		{
    	    			{"username","password","third"},
    	    			{"username1","password1","third1"},
    	    			{"username2","password2","third2"},
    	    			{"username3","password3","third3"}
    	    		};
     	}
     	return testdata;
    	}
    
    }
