package com.practice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.GenericUtilities.ListnerImplementation.class)

public class TestNGPracticeTest {

	
	@Test
	public void createOrder01()
	{
		System.out.println("createorder1");
	
	Assert.fail();
	}

//	@Test
//	public void editOrder02() 
//		{
//		System.out.println("editorder1");
//		}
//	
//	@Test
//	public void deleteOrder03()
//	{
//		System.out.println("deleteorder1");
//	}
//	
//	@Test
//	public void removeOrder04()
//	{
//		System.out.println("removeorder1");
//	}

}