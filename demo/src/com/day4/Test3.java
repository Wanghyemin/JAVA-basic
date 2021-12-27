package com.day4;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//배열 메모리 할당(객체 생성)
		int num[] = new int[5];
		int i, j, temp;

		System.out.print("다섯개의 숫자를 입력하세요");

		for (i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
		}

		System.out.print("Source Data:");
		for (i = 0; i < num.length; i++) {
			System.out.printf("%4d", num[i]);
		}
		System.out.println();

		// Selection Sort : 이중 for 문 : !!! 무조건 암기 !!!

		for (i = 0; i < num.length - 1; i++) {

			for (j = i + 1; j < num.length; j++) {

				// System.out.println(i+":"+j);

				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}

			}

		}

		// 확장for문
		System.out.print("Sorted Data:");
		for (int k : num) {
			System.out.printf("%4d", k);
		}
		System.out.println();

	}

}
