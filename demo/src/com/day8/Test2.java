package com.day8;

// ��� (�θ� �ڽĿ��� �ִ� ��)
// 1. �θ𲨴� ������
// 2. private�� ������ ���� ��� �Ұ��� 
// 3. protected�� ������ ���� ��� ���� (�ϳ��� package�ȿ��� ����)
// 4. ������ ������. 
// 5. �θ�� �ڽ��� ���� ��ü�� ������ ������ ������ ���� ����.  

class TestA {

	private String title;
	private int area;

	public void set(String title, int area) { //�޼ҵ�� �ʱ�ȭ

		this.title = title;
		this.area = area;

	}

	public void print() {
		System.out.println(title + ":" + area);
	}

}

class Rect extends TestA { // ���
	
	private int w,h;
	
	public Rect(int w,int h){ // �����ڷ� �ʱ�ȭ //
		this.w = w;
		this.h = h;
	}
	
	public void rectArea() {
		int a = w*h;
		set("�簢��",a);  // 1. �θ𲨴� ������
	}
	
	
}

public class Test2 {

	public static void main(String[] args) {

		Rect ob = new Rect(10, 20);
		
		ob.rectArea();
		ob.print(); // 1. �θ𲨴� ������
		
		
	}

}