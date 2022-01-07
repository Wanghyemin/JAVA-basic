package com.score3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score {

	private List<ScoreVO> lists = new ArrayList<>();

	Scanner sc = new Scanner(System.in);

	@Override
	public int input() {

		int result = 0;

		ScoreVO vo = new ScoreVO();

		System.out.print("�й�?"); // 111
		vo.setHak(sc.next());

		System.out.println("�̸�?");// suzi
		vo.setName(sc.next());

		System.out.print("����?");
		vo.setKor(sc.nextInt());

		System.out.print("����?");
		vo.setEng(sc.nextInt());

		System.out.print("����?");
		vo.setMat(sc.nextInt());

		lists.add(vo);

		return result;

	}

	@Override
	public void print() {

		Iterator<ScoreVO> it = lists.iterator();

		while (it.hasNext()) {

			ScoreVO vo = it.next();

			System.out.print(vo.toString());

		}

	}

	@Override
	public void searchHak() {
		System.out.println("�˻��� �й�?");
		String hak = sc.next();

		Iterator<ScoreVO> it = lists.iterator();

		while (it.hasNext()) {

			ScoreVO vo = it.next();

			if (vo.getHak().equals(hak)) {

				System.out.println(vo.toString());
				break; // ���� �й��� �����Ƿ� �ϳ��� ���� ã���� break�� ���� ����
			}

		}

	}

	@Override
	public void searchName() {

		System.out.print("�̸�?");
		String name = sc.next();

		Iterator<ScoreVO> it = lists.iterator();

		while (it.hasNext()) {

			ScoreVO vo = it.next();

			if (vo.getName().equals(name)) {

				System.out.println(vo.toString());

			}
		}

	}

	@Override
	public void descSortTot() {

		// ������ Ŭ����
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getTot() < vo2.getTot() ? 1 : -1; // �ε�ȣ > �� �ٲٸ� ��������
			}
		};

		Collections.sort(lists, comp);

		print();

	}

	@Override
	public void ascSortHak() {

		// ������ Ŭ����
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getHak().compareTo(vo2.getHak()); // �ε�ȣ > �� �ٲٸ� ��������
			}
		};

		Collections.sort(lists, comp);

		print();

	}

	@Override
	public void deleteHak() {
		
			System.out.println("������ �й�?");
			String hak = sc.next();

			Iterator<ScoreVO> it = lists.iterator();

			while (it.hasNext()) {

				ScoreVO vo = it.next();

				if (vo.getHak().equals(hak)) {

					lists.remove(vo);
					print();
					break; 
					
				}

			}
		
		
	}

}