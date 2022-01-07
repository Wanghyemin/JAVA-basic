package com.day11;

import java.util.Calendar;

interface Test {

	public int total();

	public void write();

}

class TestImpl implements Test {

	private String hak, name;
	private int kor, eng;

	public TestImpl() {// �⺻ ������

	}

	public TestImpl(String hak, String name, int kor, int eng) { // �����ε� ������ �ʱ�ȭ
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;

	}

	public void set(String hak, String name, int kor, int eng) { // �޼ҵ� �ʱ�ȭ

		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;

	}

	@Override
	public int total() {
		return kor + eng;
	}

	@Override
	public void write() {
		
		//total(); �̷��� �Ƚᵵ �޼ҵ带 �ٷ� �ҷ��� �� ����
		
		System.out.println(hak + "," + name + "," + total());
	}

	@Override
	public boolean equals(Object ob) { // UPCAST : ob1.equals(TestImpl ob2)

		boolean flag = false;

		if (ob instanceof TestImpl) { // instansceof ���� �ڷ����� Ȯ������ 

			TestImpl t = (TestImpl) ob; // DOWNCAST

			if (this.hak.equals(t.hak) && t.name.equals(this.name)) {
				flag = true;

			}

		}

		return flag;

	}

}

public class Test4 {

	public static void main(String[] args) {

		Test ob1 = new TestImpl("111", "�����", 80, 90);
		Test ob2 = new TestImpl("111", "�����", 100, 100);

		if (ob1.equals(ob2)) {
			System.out.println("ob1�� ob2�� �����ι�!");
		} else {
			System.out.println("ob1�� ob2�� �����ι� �ƴ�!");
		}

		ob1.write();
		ob2.write();
	}

}