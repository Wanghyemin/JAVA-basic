package com.day12;

import java.util.Iterator;
import java.util.Vector;

public class Test6 {

	private static final String[] city = { "����", "�λ�", "�뱸", "��õ", "����", "����", "���"

	};

	public static void main(String[] args) {

		Vector<String> v = new Vector<>();

		for (String s : city) {
			v.add(s);
		}

		// v.add(10); String���� �����س��Ƽ� Integer�� �� �� ����

		String str;
		str = v.firstElement(); // �޼ҵ� ù��° ��
		System.out.println(str);

		str = v.get(0); // �迭�� 0��° ��
		System.out.println(str);

		str = v.get(1);
		System.out.println(str);

		str = v.lastElement();
		System.out.println(str);

		// for
		for (int i = 0; i < v.size(); i++) {

			System.out.print(v.get(i) + " ");
		}

		System.out.println();

		// Ȯ�� for
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		// Iterator(�ݺ���) : �����Ͱ� ������ �������� Ȯ�� for������ Iterator ����
		// �� �� �����͸� �̾Ƴ��� �� ������ ������ �ʴ´�
		Iterator<String> it = v.iterator();
		while (it.hasNext()) { // hasNext : ������ �����Ͱ� �ִ��� Ȯ���ϴ� �޼ҵ�

			str = it.next(); // next : read�� �ǹ�
			System.out.print(str + " ");

		}

	}
}