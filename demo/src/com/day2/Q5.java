package com.day2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a;
		double b;
		
		System.out.println("구매하실 물건의 개수를 적으시오.");
		a = sc.nextInt();
		
		if(a<10) {
			b = a*15800;
		}else if (a<20){
			b = a*15800*0.9;
		}else if (a<30){
			b = a*15800*0.85;
		}else {
			b = a*15800*0.8;
		}
		
		System.out.printf("구입수량: %d개, 판매총금액: %g원",a,b);
	
	}

}
