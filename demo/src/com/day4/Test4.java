package com.day4;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		// 10명 이내의 이름과 점수를 입력받아
		// 점수가 높은 사람에서 낮은 사람 순으로 출력 (점수 내림차순)

		Scanner sc = new Scanner(System.in);

		String[] name;
		int[] score;

		int i, j, inwon, temp1;
		String temp2;

		do {
			System.out.print("몇 명의 데이터를 넣을거야?");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		// 배열 메모리 할당(객체 생성)
		name = new String[inwon];
		score = new int[inwon];

		for (i = 0; i < inwon; i++) {
			System.out.print("이름과 점수를 입력하세요");
			name[i] = sc.next();
			score[i] = sc.nextInt();
		}

		// 총점 정렬

		for (i = 0; i < score.length - 1; i++) {
			
			for (j = 1; j < score.length; j++) {
				
				if (score[i] < score[j]) {
				
					temp1 = score[i];
					score[i] = score[j];
					score[j] = temp1;

					temp2 = name[i];
					name[i] = name[j];
					name[j] = temp2;
					
				}

			}
		}

		// 출력

		for (i = 0; i < inwon; i++) {
			System.out.printf("%6s %4d\n", name[i], score[i]);
		}

	}

}
