package com.day6;

import java.util.Scanner;

class Hap {

	int su, sum; // instance 변수

	public void input() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수입력?");
		su = sc.nextInt();

	}

	public int cnt() {

		for (int i = 1; i <= su; i++) {
			sum += i;
		}
		return sum;
	}

	public void print(int i) {

		System.out.println("1부터 합계: " + i);

	}

}

public class Test2 {

	public static void main(String[] args) {

		Hap h = new Hap();
		
		h.input();
		int a = h.cnt();

		h.print(a);

	}

}
