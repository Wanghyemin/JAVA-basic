package com.day3;

public class Test3 {

	public static void main(String[] args) {

		int n, sum;

		// for �� 
		
		// 100������ ��
		sum = 0;
		for (n = 1; n <= 100; n++) {
			sum += n;
		}

		// Ȧ���� ��
		sum = 0;
		for (n = 1; n <= 100; n += 2) {
			sum += n;
		}
		
		// ¦���� ��
		sum = 0;
		for (n = 0; n <= 100; n += 2) {
			sum += n;
		}
		
		// 3�� ����� ��
		sum = 0;
		for (n = 0; n <= 100; n += 3) {
			sum += n;
		}

		System.out.println("���: " + sum);

	}
}