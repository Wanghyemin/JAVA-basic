package com.day16;

import java.io.IOException;

// Stream
// ������ ����½� ��� �����͸� ���¿� ������� �Ϸõ� �帧���� �����ϴ� ��

// in : 1����Ʈ�� ����

public class Test1 {

	public static void main(String[] args) throws IOException {

		int data;
		
		System.out.print("���� �Է�: ");
		
		while((data = System.in.read())!=-1) { // System.in.read: 1����Ʈ�� ���� �ϳ�
			char ch = (char)data;
			System.out.print(ch);
		
		
		}
	}

}