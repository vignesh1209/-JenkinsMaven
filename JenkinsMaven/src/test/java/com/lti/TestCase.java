package com.lti;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCase {

	@BeforeAll
	public static void dbConn()
	{
	Assertions.assertEquals("Up","Up");
	System.out.println(" before All");
	}

	@BeforeEach
	public void testSum()
	{
	Assertions.assertEquals("Up","Up");
	System.out.println(" before each ");
	}
	@Test
	public void testAdd()
	{
	Calculator c= new Calculator();
	int r= c.add(300, 200);
	Assertions.assertEquals(500,r);
	}
	@Test
	void testAssertEqual() {
	Assertions.assertEquals("ABC", "ABC");
	Assertions.assertEquals(20, 20, "optional assertion message");
	Assertions.assertEquals(2 + 2, 4);
	}

	@AfterEach
	public void testSumZero()
	{

	System.out.println(" After Each ");
	}


	@AfterAll
	public static void testDbClosed()
	{
	System.out.println("db connection closed ");
	System.out.println(" After All - db conn closed ");
	}
}
