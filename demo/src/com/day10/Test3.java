package com.day10;

import java.util.Calendar;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// ����� �Է¹޾� Calendar�� ����޷��� ���弼��

		Calendar now = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);

		System.out.println("������ �Է��ϼ���");

		int y = sc.nextInt();

		System.out.println("���� �Է��ϼ���");
		int m = sc.nextInt();

		now.set(y, m - 1, 1);

		int w = now.get(Calendar.DAY_OF_WEEK)-1;
		int lastday = now.getActualMaximum(Calendar.DATE);
		/* System.out.println(y + "-" + m + "-" + 1 + "-" + w); */

		System.out.println("\n  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("------------------------------");
		
		for (int i = 0; i < w; i++) {
			System.out.print("    ");
		}
		for (int j = 1; j <= lastday; j++) {
			System.out.printf("%4d", j);

			w++;
			if (w % 7 == 0) {
				System.out.println();
			}

		}

	}

}