package com.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPractice2 {

	@Test
	public void createOrder05()
	{
		System.out.println("createorder2");
		Assert.fail();
	
	}

	@Test(dependsOnMethods = "createOrder05")
	public void editOrder06() 
		{
		System.out.println("editorder2");
		}
	
	@Test
	public void deleteOrder07()
	{
		System.out.println("deleteorder2");
	}
	
	@Test
	public void removeOrder08()
	{
		System.out.println("removeorder2");
	}
}
