package UI;

import org.testng.annotations.Test;

import common.BaseTest;

import org.testng.Assert;

public class ListenerDemoTest extends BaseTest{
	
	
	@Test
	public void launchApp()
	{
		driver.get("https://ebay.com");
		Assert.assertTrue(false);
	}

}
