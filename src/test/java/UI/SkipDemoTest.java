package UI;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest{
	
	boolean datasetup =true;
	
	//-----------------------FIRST WAY TO SKIP TEST------------------------
	@Test(enabled=false)
	public void skipTest1()
	{
		System.out.println("Skipping this test as it is not complted yet");
		
	}
	
	
	//-----------------------SECOND WAY TO SKIP TEST------------------------
	@Test()
	public void skipTest2()
	{
		System.out.println("Skipping this test as it is not complted yet using SkipException ");
		throw new SkipException("Skipping this test");
	}
	
	//-----------------------THIRD  WAY TO SKIP TEST------------------------
	@Test
	public void skipTest3()
	{
		
		System.out.println("Skipping this test based on condition");
		if(datasetup =true)
		{
			System.out.println("Execute the test");
		}
		else 
		{
			System.out.println("Do not Execute the test");
			throw new SkipException("Skipping this test");
		}
	}
}

