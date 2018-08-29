package com.harink.exception.domain.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.harink.exception.domain.TaxCalculator;
import com.harink.exception.domain.exception.CountryNotValidException;
import com.harink.exception.domain.exception.EmployeeNameInvalidException;
import com.harink.exception.domain.exception.NameNotValidException;
import com.harink.exception.domain.exception.TaxNotEligibleException;

class TaxCalculatorTest {
	TaxCalculator tax;
	@BeforeEach
	void setup()
	{
		tax = new TaxCalculator() ;
	}
	@Test
	void testCalculateTaxWithValidTax() throws Exception {
		assertEquals(3300,tax.calculateTax("Jack",true,55000));
	}
	@Test
	void testCalculateTaxWithInValidTax()   {
		assertThrows(TaxNotEligibleException.class,()->tax.calculateTax("Tim",true,1000));
}
	@Test
	void testCalculateTaxWithInValidName()   {
		assertThrows(EmployeeNameInvalidException.class,()->tax.calculateTax("",true,200000));
		
	}
	@Test
	void testCalculateTaxWithInvalidCountryName() {
		assertThrows(CountryNotValidException.class,()->tax.calculateTax("Ron",false,34000));
	}
}
	
