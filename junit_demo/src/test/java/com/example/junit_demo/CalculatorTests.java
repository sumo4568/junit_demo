package com.example.junit_demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorTests {

	Calculator calculator = new Calculator();
	@Test
	void shouldReturnSumAfterAdditionTest() {
		int a = 5;
		int b = 10;
		int result = calculator.add(a, b);
		Assertions.assertEquals(15, result);
	}@Test

	void shouldReturnNumberAfterSubtractionTest() {
		int a = 5;
		int b = 3;
		int result = calculator.subtract(a, b);
		Assertions.assertEquals(2, result);
	}

	@Test

	void shouldReturnNumberAfterMultiplicationTest() {
		int a = 5;
		int b = 10;
		int result = calculator.multiply(a, b);
		Assertions.assertEquals(50, result);
	}

	@Test

	void shouldReturnResultAfterDivisionTest() {
		int a = 3;
		int b = 5;
		double result = calculator.divide(a, b);
		Assertions.assertEquals(.6, result);

	}

	@Test

	void shouldReturnResultAfterSqrtTest() {
		int a = 4;
		double result = calculator.squareRootOf(a);
		Assertions.assertEquals(2, result);

	}

	@Test

	void shouldReturnAreaTest() {
		int a = 7;
		double result = calculator.getArea(a);
		Assertions.assertEquals(153.94, result);
	}

	@Test

	void shouldReturnNanForNegativeInput() {
		int a = -2;
		double result = calculator.getArea(a);
		Assertions.assertEquals(Double.NaN, result);

	}

	@Test

	void shouldReturnCircumferenceTest() {
		int a = 2;
		double result = calculator.getCircumference(a);
		Assertions.assertEquals(12.57, result);
	}

	@Test

	void shouldReturnNanForNegativeValue() {
		int a = -2;
		double result = calculator.getCircumference(a);
		Assertions.assertEquals(Double.NaN, result);

	}

}
