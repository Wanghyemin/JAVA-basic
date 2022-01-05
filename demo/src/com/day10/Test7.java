package com.day10;

// final 
// �ν��Ͻ� ������ final�� ���̸� �� �ѹ��� �ʱ�ȭ�� ����
// �޼ҵ忡 final�� ���̸� Override�� �Ұ���(5% ���)
// Ŭ������ final�� ���̸� ����� �Ұ���(0.% ���)

class TestA {

	public static final double PI;

	static {
		PI = 3.14;
	}
	public double area;

	public final void write(String title) {

		System.out.println(title + ":" + area);
	}
}

public class Test7 extends TestA {

/*	@Override //final ���� ������ ���°� ���������� Overriding�� �Ұ����ϴ�.
	public void write(String title) {
		
	}*/ 
	
	public void circleArea(int r) {
		area = (double) r * r * PI;

	}

	public static void main(String[] args) {

		Test7 ob = new Test7();
		ob.circleArea(10);
		ob.write("��");
	}

}