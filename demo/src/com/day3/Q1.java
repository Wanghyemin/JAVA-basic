package com.day3;

public class Q1 {

	public static void main(String[] args) {

		/*
		 * 1���� 100���� ���� Ȧ���� ��, ¦���� ��, ��ü�� �� ¦���� : 2550 Ȧ���� : 2500 �� : 5050
		 */

		int sum1, sum2, sum3;

		sum1 = 0;
		for (int i = 1; i <= 100; i += 2) {
			sum1 += i;
		}
		sum2 = 0;
		for (int i = 0; i <= 100; i += 2) {
			sum2 += i;
		}
		sum3 = 0;
		for (int i = 1; i <= 100; i++) {
			sum3 += i;
		}

		System.out.printf("Ȧ����: %d, ¦����: %d, ����: %d", sum1, sum2, sum3);
		
		
		// ������ ���
		
/*		int n=0, s1, s2, s3;

		s1=s2=s3=0;
		while(n<100) {
			n++;
			if(n%2==0)
			   s1+=n;
			else
			   s2+=n;
			
			s3+=n;
		}

		System.out.println("¦���� : "+s1);
		System.out.println("Ȧ���� : "+s2);
		System.out.println("�� : "+s3);
*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
