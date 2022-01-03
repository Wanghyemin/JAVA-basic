package com.day9;

import java.util.Scanner;

class Result {

	protected String r;

	public void print() {
		System.out.println(r);
	}
}

class Calc extends Result {

	public Calc(String r) {
		
		this.str = str;
	}

	Scanner sc = new Scanner(System.in);
	
	private String str;



	public void input() {

		

		
		System.out.println("����[1+2]?");
		str = sc.next();

		str = str.replaceAll("\\s", "");
	}

	public void cal() {
		for (String op : new String[] { "+", "-", "*", "/" }) {
			int pos = str.indexOf(op);

			if (pos > -1) {
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();

				int result = 0;
				char oper = str.charAt(pos);

				switch (oper) {
				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;
				case '*':
					result = num1 * num2;
					break;
				case '/':
					result = num1 / num2;
					break;
				}
				r = String.format("%d %c %d = %d", num1, oper, num2, result);
			}

		}

	}

}

public class Test8 {

	public static void main(String[] args) {

		Calc c = new Calc();
		c.input();
		c.cal();
		c.print();
	}

}