package com.day12;

// 4. ����Ŭ���� (�͸���, ������, Anonymous Ŭ����)

public class Test4 {

	public Object getTitle() {

		return new Object() {

			@Override
			public String toString() {
				return "�͸��� Ŭ����";
			}

		};

	}

	public static void main(String[] args) {

		Test4 ob = new Test4();
		Object str =  ob.getTitle();
		System.out.println(str);
	
		
	}

}