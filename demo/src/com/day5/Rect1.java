package com.day5;

import java.util.Scanner;

public class Rect1 {

	String name;
	int score1, score2, tot;

	public void input() {
		Scanner sc = new Scanner(System.in);

		System.out.println("�̸�?");
		name = sc.next();

		System.out.println("����?");
		score1 = sc.nextInt();

		System.out.println("����?");
		score2 = sc.nextInt();

	}

	public int tot() {

		return score1 + score2;

	}

	public void print(int a) {

		System.out.println("����: " + a);

	}

}