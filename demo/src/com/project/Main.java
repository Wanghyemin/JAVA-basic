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
				System.out.println("1.누적현황 2.일일현황 3.현재백신현황 4.종료");
				num = sc.nextInt();

			} while (num < 1);
			
			
			// 항목 선택 //	
			switch (num) {

			case 1: // 1. 누적현황
				co.covid();
				co.total();
				break;

			case 2: // 2. 일일현황
				co.covid();
				co.daily();
				break;

			case 3: // 3. 현재백신현황
				va.vaccine();
				break;

			default: // 4. 종료
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
			}
		}

	}

} ////////정리 완료////////////
