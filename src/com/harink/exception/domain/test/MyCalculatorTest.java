package com.harink.exception.domain.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.harink.exception.domain.MyCalculator;


class MyCalculatorTest {

MyCalculator c1 ;
	
	@BeforeEach
	void setup()
	{
		c1 = new MyCalculator() ;
	}
	
	

	@Test
	void testPowerWithValidInput() throws Exception {
		
			assertEquals(243,c1.power(3, 5));
			assertEquals(16,c1.power(2, 4));
			assertEquals(32,c1.power(2, 5));
			
		}
	@Test
	void testPowerWithZeroInput()  {
		Exception e;
		e=assertThrows(Exception.class, () -> c1.power(0, 0));
		assertEquals("n and p should not be zero.",e.getMessage());
		//assertEquals("java.lang.Exceptins: n and p should not be zero.",e.toString());
	}
	@Test
	void testPowerWithNegativeInput()  {
		Exception e;
		e=assertThrows(Exception.class,()->c1.power(-5, -1));
		assertEquals("n or p should not be negative.",e.getMessage());
		e=assertThrows(Exception.class,()->c1.power(-5, 1));
		assertEquals("n or p should not be negative.",e.getMessage());
		e=assertThrows(Exception.class,()->c1.power(5, -1));
		assertEquals("n or p should not be negative.",e.getMessage());
	}
}
