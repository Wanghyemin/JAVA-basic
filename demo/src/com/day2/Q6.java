package com.day2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		double d;
		String name;
		
		System.out.print("�̸�?");
		
		name = sc.next();
		
		System.out.print("3���� ����?");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = a+b+c;
		
		if(a>=40 && b>=40 && c>=40 && d>=180){
			e = "�հ�";
		}else if (a>=40 && b>=40 && c>=40 && d<=180){
			e = "���հ�";
		}else {
			e = "����";
		}
	
		System.out.println("�̸�: " + name);
		System.out.println("����: "+d+", ���: " + d/3 + ", ����: " + e );
	}
}