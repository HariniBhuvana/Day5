package com.harink.exception.domain.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.harink.exception.domain.Factorial;
import com.harink.exception.domain.exception.FactorialException;
import com.harink.exception.domain.exception.InvalidInputException;


class FactorialTest {

	@Test
	void testGetFactorialWithValidInput() throws InvalidInputException, FactorialException {
		assertEquals(120, Factorial.getFactorial(5));
		assertEquals(720, Factorial.getFactorial(6));
	}
	
	@Test
	void testGetFactorialWithInvalidInput() {
		assertThrows(InvalidInputException.class, ()->Factorial.getFactorial(-5));
	}
	
	@Test
	void testGetFactorialMaxCross() {
		assertThrows(FactorialException.class, ()->Factorial.getFactorial(Integer.MAX_VALUE));
	}


}