package com.score1;

import java.util.Scanner;

public class Health {

	int inwon;
	Record1[] rec1;

	Scanner sc = new Scanner(System.in);

	public void set() {

		do {
			System.out.print("�ο���?");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 50);

		rec1 = new Record1[inwon];
	}

	public void input() {

		String[] title = { "Ű", "������" };

		for (int i = 0; i < inwon; i++) {

			rec1[i] = new Record1();

			System.out.print("�̸�?");
			rec1[i].name = sc.next();

			for (int j = 0; j < 2; j++) {

				System.out.println(title[j]);
				rec1[i].b[j] = sc.nextInt();

			}

		}

	}

	private void bmi() {
		
		int i;
		
		for (i = 0; i < inwon; i++) {
			
			rec1[i].bmi = 1;
			
			rec1[i].bmi = rec1[i].b[1] / (rec1[i].b[0] * rec1[i].b[0]/10000);
	}
	}
	
	public void print() {
		bmi();
		
		for(int i = 0; i<inwon;i++) {
			System.out.printf("%6s ", rec1[i].name);
		
			for(int j = 0;j<2;j++) {
				System.out.printf("%4d",rec1[i].b[j]);
			}
		System.out.printf("%4d\n", rec1[i].bmi);
		
		
		}
	}
	
	
}