package com.day4;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		/*
		 * 5���� ������ �Է¹޾� �Է¹��� ���� ����ϰ� �Է¹��� �� �� ���� ū ���� ���� ���� ���
		 */

		Scanner sc = new Scanner(System.in);

		int[] num = new int[5];
		int i, j, blank;

		System.out.print("�ټ� ���� ���ڸ� �Է��ϼ���.");

		for (i = 0; i < 5; i++) {

			num[i] = sc.nextInt();

		}

		for (i = 0; i < num.length - 1; i++) {

			for (j = i + 1; j < num.length; j++) {

				/*
				 * if (num[i] < num[j]) {
				 * 
				 * blank = num[i]; num[i] = num[j]; num[j] = blank; }
				 */

				if (num[i] < num[j]) {
					
					num[i] = num[i] ^ num[j];
					num[j] = num[i] ^ num[j];
					num[i] = num[i] ^ num[j];
				}

			}

		}

		System.out.printf("���� ū ��: %d, ���� ���� ��: %d", num[0], num[4]);

	}

}