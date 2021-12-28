package com.day4;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// ��,��,��
		// 2021�� 12�� 27�� ������

		Scanner sc = new Scanner(System.in);

		int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int y, m, d, nalsu, week;

		do {
			System.out.print("�⵵?");
			y = sc.nextInt();
		} while (y < 1);

		do {
			System.out.print("��?");
			m = sc.nextInt();
		} while (m < 1 || m > 12);

		do {
			System.out.print("��?");
			d = sc.nextInt();
		} while (d < 1 || d > months[m - 1]);

		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			months[1] = 29;
		}
		nalsu = 365 * (y - 1) + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;

		for (int i = 0; i < m - 1; i++) {
			nalsu += months[i];
		}

		nalsu += d;

		week = nalsu % 7;

		System.out.printf("%d�� %d�� %d�� ", y, m, d);

		switch (week) {
		case 0:
			System.out.println("�Ͽ���");
			break;
		case 1:
			System.out.println("������");
			break;
		case 2:
			System.out.println("ȭ����");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("�����");
			break;
		case 5:
			System.out.println("�ݿ���");
			break;
		case 6:
			System.out.println("�����");
			break;
		}

	}

}