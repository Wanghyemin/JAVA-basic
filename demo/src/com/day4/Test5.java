package com.day4;

import java.util.Random;

public class Test5 {

	public static void main(String[] args) {

		// 1~45������ �� �߿��� 6���� ����(Random)�� �߻����� ũ�� ������ ����

		Random rd = new Random();
		int[] num = new int[6];
		int i, j, n, temp;

		n = 0;

		// 1~45
		while (n < 6) {
			num[n] = rd.nextInt(45) + 1;

			// �ߺ� ����
			for (i = 0; i < n; i++) {
				
				if (num[i] == num[n]) {
					n--;
					break;
				}
			}
			n++;
		}

		// ����
		for (i = 0; i < num.length - 1; i++) {

			for (j = i + 1; j < num.length; j++) {
				
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
				
			}
			
		}

		// for (int i=0;i<num.length;i++)
		// �迭���� ����ϴ� ��� : num�� ���� n�� ��ŭ �ڵ����� ������
		// num�� String�̸� 'for (String a : num)'ó�� ���
		for (int a : num) {
			System.out.printf("%4d", a);

		}
	}

}