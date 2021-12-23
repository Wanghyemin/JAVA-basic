package com.day1;

public class Test2 {
	
	public static void main(String[] args) {
	//public static void main1(String[] args) // 런타임 오류 : 로직적인 문제
		
		// 변수 선언
		// int : 정수
		
		// '='는 대입 연산자 
		// a라는 값에 10을 넣어라
		int a = 10;
		int b = 5;

		int c, d;// '쓰레기 값'이 들어있음

		System.out.println(a);
		System.out.println(b);
		// System.out.println(c); // 컴파일 오류 : 문법적 오류, 오타

		c = a + b;
		System.out.println(c); // 15

		d = a - b;
		System.out.println(d); // 5

		System.out.println(a + "+" + b + "=" + c);
		System.out.println();
		System.out.println(a + "-" + b + "=" + b);

		// format(모양) : 너가 출력하고 싶은 모양을 만들어
		System.out.printf("%d+%d=%d%n", a, b, c);
		System.out.printf("%d - %d = %d\n", a, b, b);

	}	
		
}

	