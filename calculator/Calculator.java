package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Qual o primeiro valor?");
		a = scan.nextInt();
		
		System.out.println("Qual o segundo valor?");
		b = scan.nextInt();
		
		double sum = sum(a,b);
		double subtract = subtract(a,b);
		double divide = divide(a,b);
		double multiply = multiply(a,b);
		
		System.out.println("Resultados _________");
		
		System.out.println("sum____________= " + sum);
		System.out.println("subtraction ___= " + subtract);
		System.out.println("division_______= " + divide);
		System.out.println("multiplication_= " + multiply);
		

	}
	
	public static double sum(double a, double b) {
		return a + b;
	}
	
	public static double subtract(double a, double b) {
		return a - b;
	}
	
	public static double divide(double a, double b) {
		return a / b;
	}
	
	public static double multiply(double a, double b) {
		return a * b;
	}

}
