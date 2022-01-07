package com.score4;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.score4.ScoreVO;

public class ScoreImpl implements Score {

	private Map<String, ScoreVO> hMap = new TreeMap<>();

	Scanner sc = new Scanner(System.in);

	String hak;

	@Override
	public void input() {

		System.out.print("학번?");
		hak = sc.next();

		if (searchHak(hak)) {

			System.out.println("학번이 존재합니다 재입력:(");
			return;
		}
		ScoreVO vo = new ScoreVO();
		System.out.println("이름?");
		vo.setName(sc.next());

		System.out.println("국어?");
		vo.setKor(sc.nextInt());

		System.out.println("영어?");
		vo.setEng(sc.nextInt());

		System.out.println("수학?");
		vo.setMat(sc.nextInt());

		hMap.put(hak, vo);

		System.out.println("추가 성공:)");

	}

	@Override
	public boolean searchHak(String hak) {

		if (hMap.containsKey(hak)) {
			return true;

		}

		return false;

	}

	@Override
	public void print() {

		Iterator<String> it = hMap.keySet().iterator();

		while (it.hasNext()) {

			String hak = it.next();
			ScoreVO vo = hMap.get(hak);

			System.out.println(hak + " " + vo.toString());

		}

	}

	@Override
	public void delete() {

		System.out.print("삭제할 학번?");
		hak = sc.next();

		if (hMap.containsKey(hak)) {
			hMap.remove(hak);
		}
		print();
		return;
	}

	@Override
	public void update() {
		System.out.print("수정할 정보의 학번?");
		hak = sc.next();

		if (searchHak(hak)) {

			ScoreVO vo = new ScoreVO();

			System.out.println("이름?");
			vo.setName(sc.next());

			System.out.println("국어?");
			vo.setKor(sc.nextInt());

			System.out.println("영어?");
			vo.setEng(sc.nextInt());

			System.out.println("수학?");
			vo.setMat(sc.nextInt());

			hMap.put(hak, vo);

		}

	}

	@Override
	public void findHak() {

		System.out.print("검색할 학번?");
		hak = sc.next();
		ScoreVO vo = new ScoreVO();
		if (searchHak(hak)) {
			System.out.println(hak + " " + vo.toString());
		}

	}

	@Override
	public void findName() {
		System.out.println("검색할 이름?");
		String name = sc.next();
		
		Iterator<String> it = hMap.keySet().iterator();
		
		while(it.hasNext()){
			String hak = it.next();
			ScoreVO vo = hMap.get(hak);
			if(vo.getName().equals(name)) {
				System.out.println(hak + " " + vo.toString());
			}
		}
		
	}


}
