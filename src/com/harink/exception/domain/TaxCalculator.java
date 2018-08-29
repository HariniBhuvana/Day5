package com.harink.exception.domain;

import com.harink.exception.domain.exception.CountryNotValidException;
import com.harink.exception.domain.exception.EmployeeNameInvalidException;
import com.harink.exception.domain.exception.TaxNotEligibleException;

public class TaxCalculator {
	
	private static double taxAmount;
	public static double calculateTax(String empName, boolean isIndian, double empSal)
			throws Exception {
		if (empName.equals("") || empName == null) {
			throw new EmployeeNameInvalidException("Employee Name Cannot be empty");
		}
		
		if (!isIndian) {
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
		}
		

		if (empSal >= 10_0_000) {
			taxAmount = empSal * (0.08);
		} else if (empSal >= 50000 && empSal < 100000) {
			taxAmount = empSal * (0.06);
		} else if (empSal >= 30000 && empSal < 50000) {
			taxAmount = empSal * (0.05);
		} else if (empSal >= 10000 && empSal < 30000) {
			taxAmount = empSal * (0.04);
		} else {
			throw new TaxNotEligibleException("The employee does not need to pay tax");
		}

		return taxAmount;

	}


	

}
