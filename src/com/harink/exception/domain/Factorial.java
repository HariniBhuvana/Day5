package com.harink.exception.domain;

import com.harink.exception.domain.exception.FactorialException;
import com.harink.exception.domain.exception.InvalidInputException;

public class Factorial {

		public Factorial() {
			super();
			// TODO Auto-generated constructor stub
		}

		public static int getFactorial(int num) throws InvalidInputException, FactorialException {
			int result = 0;
			if (num < 2) {
				throw new InvalidInputException("Invalid input given");
			}

			result = factorialFunction(num);
			return result;
		}

		private static int factorialFunction(int num) throws FactorialException {
			int fact = 1;
			int prevResult;
			for (int i = 1; i <= num; i++) {
				prevResult = fact;
				fact = fact * i;
				if (fact < prevResult) {
					throw new FactorialException("Integer range exceeds");
				}
			}
			return fact;
		}

	}



