package com.project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ThreadSrt ts = new ThreadSrt();
		ts.start();
		
		Scanner sc = new Scanner(System.in);

		Covid co = new Covid();
		Vaccine va = new Vaccine();

		int num;

		while (true) {

			do {
				System.out.println("1.������Ȳ 2.������Ȳ 3.��������Ȳ 4.����");
				num = sc.nextInt();

			} while (num < 1);
			
			
			// �׸� ���� //	
			switch (num) {

			case 1: // 1. ������Ȳ
				co.covid();
				co.total();
				break;

			case 2: // 2. ������Ȳ
				co.covid();
				co.daily();
				break;

			case 3: // 3. ��������Ȳ
				va.vaccine();
				break;

			default: // 4. ����
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				System.exit(0);
			}
		}

	}

} ////////���� �Ϸ�////////////