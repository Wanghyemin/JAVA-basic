package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1, num2;

		System.out.print("첫번째 수?");// 20
		num1 = Integer.parseInt(br.readLine());

		System.out.print("두번째 수?");// 5
		num2 = Integer.parseInt(br.readLine());

		System.out.printf("%d + %d = %d\t", num1, num2, (num1 + num2));
		System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
		System.out.printf("%d * %d = %d\t", num1, num2, (num1 * num2));
		System.out.printf("%d / %d = %d\n", num1, num2, (num1 / num2));
		System.out.printf("%d %% %d = %d\t", num1, num2, (num1 % num2));

		// True, False 의 값 도출 : ==,<,>,<=,>=
		System.out.println("num1>num2: " + (num1 > num2));
		System.out.println("num1==num2: " + (num1 == num2));

		String str;

		// 삼항연산자(조건?true값:false값)
		str = num1 % 2 == 0 ? "짝수" : "홀수";

		str = num1 > 0 ? "양수" : (num1 < 0 ? "음수" : "영");
		
		//A and(&&) B :  A도 True이고 B도 True
		//A or(||) B : A만 True 혹은 B만 True, 혹은 둘다 True
		str = (num1%4==0) && (num1%100!=0) || (num1%400==0)? "윤년":"평년";

		System.out.println(num1 + ":" + str);

	}

}
