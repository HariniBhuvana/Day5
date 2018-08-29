package com.harink.exception.domain.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.harink.exception.domain.Student;
import com.harink.exception.domain.exception.AgeNotWithinRangeException;
import com.harink.exception.domain.exception.NameNotValidException;

class StudentTest {
Student st;



	@Test
	void testStudentValidAge() throws Exception {
		
			assertNotNull(new Student(123,"harini",20,"java"));
	}
	@Test
	void testStudentInValidAge()  {
		
			assertThrows(AgeNotWithinRangeException.class, () -> new Student(123,"harini",5,"java"));
			}
	
	@Test
	void testStudentInValidName()  {
	assertThrows(NameNotValidException.class,()->new Student(123,"harin8",20,"java"));

}}
