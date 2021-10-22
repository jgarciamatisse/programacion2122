package _03ejercicios;

import java.util.Scanner;

public class _12Calculadora {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Primer numero: ");
		double num1 = tec.nextDouble();
		System.out.println("Segundo numero: ");
		double num2 = tec.nextDouble();
		System.out.println("Operacion: ");
		String op = tec.next();
		//char op2 = tec.next().charAt(0);
		//if(op2 == '+')
		if(op.equals("+")) {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			// o con format
			System.out.format("%.2f + %.2f = %.2f%n",num1,num2,num1+num2);
		} else if(op.equals("-")) {
			System.out.format("%6.2f - %6.2f = %6.2f%n",num1,num2,num1-num2);
		} else if(op.equals("*")) {
			System.out.format("%6.2f * %6.2f = %6.2f%n",num1,num2,num1*num2);
		} else if(op.equals("/")) {
			System.out.format("%6.2f / %6.2f = %6.2f%n",num1,num2,num1/num2);
		} else {
			System.out.println("Operación incorrecta");
		}
		
	}

}
