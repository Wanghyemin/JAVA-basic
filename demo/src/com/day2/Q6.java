package com.day2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		double d;
		String name;
		
		System.out.print("이름?");
		
		name = sc.next();
		
		System.out.print("3과목 점수?");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = a+b+c;
		
		if(a>=40 && b>=40 && c>=40 && d>=180){
			e = "합격";
		}else if (a>=40 && b>=40 && c>=40 && d<=180){
			e = "불합격";
		}else {
			e = "과락";
		}
	
		System.out.println("이름: " + name);
		System.out.println("총점: "+d+", 평균: " + d/3 + ", 판정: " + e );
	}
}
