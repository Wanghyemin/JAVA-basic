package com.day4;

import java.util.Random;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

/*		1~3사이의 난수를 발생시켜 가위,바위,보 게임 프로그램 작성
		  1:가위, 2:바위, 3:보

		예)
		1:가위, 2:바위, 3:보 ?1
		컴퓨터 :보 사람 :가위
		당신이 이겼습니다

		1:가위, 2:바위, 3:보 ?1
		컴퓨터 :바위 사람 :가위
		컴퓨터가 이겼습니다*/
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		
		String[] rcp = {"가위", "바위","보"};	
		
		int com,human;
		
		com = rd.nextInt(3)+1;
		
		System.out.print("1(가위), 2(바위) 3(보) 중 하나를 입력하세요");
		human = sc.nextInt();
		

		
		
		
		if(com==human) {
			System.out.println("비겼습니다.");
		}else if()
		
		
		
		
		
		
		
		
		
	}

}
