package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1, num2;

		System.out.print("ù��° ��?");// 20
		num1 = Integer.parseInt(br.readLine());

		System.out.print("�ι�° ��?");// 5
		num2 = Integer.parseInt(br.readLine());

		System.out.printf("%d + %d = %d\t", num1, num2, (num1 + num2));
		System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
		System.out.printf("%d * %d = %d\t", num1, num2, (num1 * num2));
		System.out.printf("%d / %d = %d\n", num1, num2, (num1 / num2));
		System.out.printf("%d %% %d = %d\t", num1, num2, (num1 % num2));

		// True, False �� �� ���� : ==,<,>,<=,>=
		System.out.println("num1>num2: " + (num1 > num2));
		System.out.println("num1==num2: " + (num1 == num2));

		String str;

		// ���׿�����(����?true��:false��)
		str = num1 % 2 == 0 ? "¦��" : "Ȧ��";

		str = num1 > 0 ? "���" : (num1 < 0 ? "����" : "��");
		
		//A and(&&) B :  A�� True�̰� B�� True
		//A or(||) B : A�� True Ȥ�� B�� True, Ȥ�� �Ѵ� True
		str = (num1%4==0) && (num1%100!=0) || (num1%400==0)? "����":"���";

		System.out.println(num1 + ":" + str);

	}

}