package com.day3;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		/*
		 * �� ���� �Է¹޾� ���� ������ ū�������� �� 1~100 ������ �� : 5050
		 */

		Scanner sc = new Scanner(System.in);

		int a, b, c, sum;

		sum = 0;

		System.out.println("�� ���� ���ڸ� �Է��ϼ���.");
		a = sc.nextInt();
		b = sc.nextInt();

/*		if (a > b) {
			a = a ^ b;
			b = a ^ b;
			a = a ^ b;
		}
*/
		
		if (a > b) {
			c = a;
			a = b;
			b = c;
		}

		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.printf("%d�� %d���� ������ ��: %d%n", a, b, sum);

		 
		// �ٸ� Ǯ��
		if (a > b) {
			for (int i = a; i <= b; i++) {
				sum += i;
			}
		} else {
			for (int i = b; i <= a; i++) {
				sum += i;
			}
		}

		System.out.printf("%d�� %d���� ������ ��: %d", a, b, sum);

	}

}