package com.sispag.calculatorprogram.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	Calculator calculator = new Calculator();	
	
	@Test
	public void ShouldReturnZeroWhenNotValueWhereGiven() {		
		double sum = calculator.sum(0);
		
		assertEquals(0, sum);
	}
	
	@Test
	public void ShouldReturnTheSumOfGivenValues() {				
		double sum = calculator.sum(3,6);		
		
		assertEquals(9, sum);				
		
	}
	@Test
	public void ShouldTShouldThrowsAnExceptionTheGivenNumberWhereLassThenZero() {
	
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-1));
		
		assertEquals("Não existe raiz quadrada real para números negativos", exception.getMessage());
		
	}
	
	@Test
	public void ShouldReturnTheSquareRootOfGivenNumber() {
		double result = calculator.squareRoot(4);
		
		assertEquals(2, result);
	}
	
	@Test
	public void ShouldReturnTrueThenGivenNumberIsOdd() {
		boolean isOdd = calculator.isOdd(3);
		
		assertTrue(isOdd);
	}

	
	@Test
	public void ShouldReturnFalseThenGivenNumberIsEven() {
		boolean isOdd = calculator.isOdd(2);
		
		assertFalse(isOdd);
	}
}
