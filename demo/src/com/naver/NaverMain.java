package com.naver;

import java.util.Scanner;

public class NaverMain {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		Naver na = new NaverImpl();

		int ch;

		while (true) {

			do {

				System.out.println("1.ȸ������ 2.ȸ����ü��� 3.���̵�˻� 4.����");
				ch = sc.nextInt();
			} while (ch < 1);

			switch (ch) {

			case 1:
				na.input();
				break;
			case 2:
				na.print();
				break;
			case 3:
				na.searchID();
				break;
			default:
				System.exit(0);
			}
		}

	}

}