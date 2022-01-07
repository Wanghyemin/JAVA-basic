package com.day12;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector; // ArrayList�� �� ���� ����

public class Test7 {

	private static final String[] city = { "����", "�λ�", "�뱸", "��õ", "����", "����", "���"

	};

	public static void main(String[] args) {

		// Generic
		Vector<String> v = new Vector<>();

		String str;

		System.out.println("������ �ʱ� �뷮: " + v.capacity()); // 10

		for (String s : city) {
			v.add(s);
		}
		Iterator<String> it = v.iterator();
		while (it.hasNext()) {

			str = it.next();
			System.out.print(str + " ");

		}
		System.out.println();

		System.out.println("�������� ����: " + v.size()); // 7

		// ����
		v.set(0, "Seoul");
		v.set(1, "Pusan");

		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		// ����
		v.insertElementAt("���ѹα�", 0);
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		System.out.println("������ �뷮: " + v.capacity());
		System.out.println("�������� ����: " + v.size());

		// �˻�
		int index = v.indexOf("�뱸"); // �뱸�� �ִ� ���� index�� ������ �Ͷ�
		if (index != -1) {
			System.out.println("�˻� ����: " + index);
		} else {
			System.out.println("�˻� ����");
		}

		// ��������
		Collections.sort(v);

		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		// ��������
		Collections.sort(v, Collections.reverseOrder());
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		// ����
		/* v.remove(7); */ // ����
		v.remove("Pusan");

		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		// �뷮 ����

		for (int i = 1; i <= 20; i++) {
			v.add(Integer.toString(i));
		}
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		System.out.println("������ �뷮: " + v.capacity()); // 40
		System.out.println("�������� ����: " + v.size()); // 27

		// ���� ����
		for (int i = 1; i <= 10; i++) {
			v.remove(5);
		}
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("������ �뷮: " + v.capacity()); // 40 : �ڵ����� �پ���� �ʴ´�!
		System.out.println("�������� ����: " + v.size()); // 17

		// �̻�� ���� ����
		v.trimToSize();
		System.out.println("������ �뷮: " + v.capacity()); //17
		System.out.println("�������� ����: " + v.size()); //17

		// ��� ������ ����
		v.clear();
		System.out.println("������ �뷮: " + v.capacity());
		System.out.println("�������� ����: " + v.size());

		// �̻�� ���� ����
		v.trimToSize();
		System.out.println("������ �뷮: " + v.capacity()); //0
		System.out.println("�������� ����: " + v.size()); //0

	}

}