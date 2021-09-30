package com.sispag.calculatorprogram.calculator;

public class Calculator {
	
	public double sum(double... numbers) {
		double sum = 0;
		
		if(numbers.length > 0) {
			for(double number : numbers) {
				sum += number;
			}
		}
		return sum;
	}
	
	
	//Realiza a raiz quadrada
	public double squareRoot(double number) {
		if(number < 0) {
			throw new IllegalArgumentException("Não existe raiz quadrada real para números negativos"); 
		}
		
		return Math.sqrt(number);
	}
	
	
	//Veifica se o número é impar
	public boolean isOdd(int number) {
		if(number % 2 != 0) {
			return true;
		}
		
		return false;
	}

}
