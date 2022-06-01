package com.eample.AddtonApp;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
 
public class TestCalApp {

	
	@Test
	public void testCalcApp()
	{
		
	 int r=App.add(12, 12);
	 Assert.assertEquals(26, r);
	 
		
	}
	
	
	
}
