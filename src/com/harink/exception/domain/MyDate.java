package com.harink.exception.domain;

import com.harink.exception.domain.exception.InvalidDayException;
import com.harink.exception.domain.exception.InvalidMonthException;


	
	public class MyDate {
	private int date;
	private int month;
	private int year;
	public MyDate(int date,int month,int year) throws InvalidDayException, InvalidMonthException {
		
		if(date<1   ||  ((month==2)  &&  (year%4==0) && (date>29)) || ((month==2)  &&  (year%4!=0) && (date>28))||(date>31))
			throw new InvalidDayException(("Date is invalid"));
		
		else if(month<1 || month>12)
			throw new InvalidMonthException("Month is invalid");
		this.date=date;
		this.month=month;
		this.year=year;
	}


}
