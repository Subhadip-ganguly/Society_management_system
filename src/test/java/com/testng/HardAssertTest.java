package com.testng;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class HardAssertTest 
{
	@Test
	public void hardAssertTest1()
	{
		System.out.println("test1");
		assertEquals("A","B");
		System.out.println("test2");
	}
	
	@Test
	public void hardAssertTest2()
	{
		System.out.println("test3");
		assertNotEquals("x", "x");
		System.out.println("test4");
	}
	
	@Test
	public void hardAssertTest3()
	{
		int m=5;
		System.out.println("Null check");
		assertNull(m);
		//assertNotNull(m);
		System.out.println(m);
	}
	
	@Test
	public void haedAssertTest4()
	{
		System.out.println("test5");
		assertTrue(false);
		System.out.println("test6");
	}
}
