package com.harink.exception.domain.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.harink.exception.domain.MyDate;
import com.harink.exception.domain.exception.InvalidDayException;
import com.harink.exception.domain.exception.InvalidMonthException;

class MyDateTest extends Exception {

	@Test

	void testMyDateWithInvalidDate() {
		Exception e = assertThrows(InvalidDayException.class, () -> new MyDate(41,4,2010));
		assertEquals("Date is invalid", e.getMessage());
	}
	
	@Test

	void testMyDateWithInvalidMonth() {
		Exception e = assertThrows(InvalidMonthException.class, () -> new MyDate(21,14,2010));
		assertEquals("Month is invalid", e.getMessage());
	}

	@Test

	void testMyDateWithValidDetails() throws InvalidDayException, InvalidMonthException {
		assertNotNull(new MyDate(21,03,1996));
	}

}
