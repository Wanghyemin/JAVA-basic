package com.project;

import java.io.InputStream;
import java.net.URL;
import java.text.NumberFormat;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Covid{
	NumberFormat numberFormat = NumberFormat.getInstance(); //3자리 수 마다 콤마찍기
	DocumentBuilder parser;
	int date;
	
	int a;
	int b;
	
	
	public void covid() {

		try {

			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
			parser = f.newDocumentBuilder();

			

			
			// 날짜설정
			Scanner sc = new Scanner(System.in);
			

			do {
				System.out.println("날짜를 입력하세요[20220101]");
				date = sc.nextInt();
				
			} while (date < 20200101 || date > 20220119);

			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	
	public void total() {
		
	try {
		
			// 당일자 URL형성
			String url = "http://openapi.data.go.kr/openapi/service/rest/Covid19"
					+ "/getCovid19InfStateJson?serviceKey=NCIUqcH3S7%2B53YimC1Rc"
					+ "H3h3AiFSpZrWZMfmjJGXFVZNGhf2BGW25igritgTfMcgMe4Gxd8qbS9nb%"
					+ "2F6%2BwBycXw%3D%3D&pageNo=1&numOfRows=10&" 
					+ "startCreateDt=" + date + "&endCreateDt=" + date;

			Document xmlDoc = null;
			xmlDoc = parser.parse(url);

			Element root = xmlDoc.getDocumentElement();

			Node body = root.getLastChild();

			Node items = body.getFirstChild();

			Node item = items.getFirstChild();

			NodeList itemList = item.getChildNodes();

			Node a1 = itemList.item(3);
			Node b1 = itemList.item(2);
			


			a = Integer.parseInt(a1.getChildNodes().item(0).getNodeValue());
			b = Integer.parseInt(b1.getChildNodes().item(0).getNodeValue());
			
			double as = a; //a값을 double값으로 변환
			double bs = b; 
			String str1 = numberFormat.format(as); //3자리 수마다 콤마 찍어주기
			String str2 = numberFormat.format(bs);
			
			
			System.out.println("누적확진자: " + str1 + "명,  누적사망자: " + str2 + "명");
		
	} catch (Exception e) {
		System.out.println(e.toString());
	}
	}
			
	public void daily() {	
			
		
		try {
			// 전일자 URL형성
		String url = "http://openapi.data.go.kr/openapi/service/rest/Covid19"
					+ "/getCovid19InfStateJson?serviceKey=NCIUqcH3S7%2B53YimC1Rc"
					+ "H3h3AiFSpZrWZMfmjJGXFVZNGhf2BGW25igritgTfMcgMe4Gxd8qbS9nb%"
					+ "2F6%2BwBycXw%3D%3D&pageNo=1&numOfRows=10&" + "startCreateDt=" 
					+ (date - 1) + "&endCreateDt="
					+ (date - 1);
	
		Document xmlDoc = null;
			xmlDoc = parser.parse(url);

			Element root = xmlDoc.getDocumentElement();

			Node body = root.getLastChild();

			Node items = body.getFirstChild();

			Node item = items.getFirstChild();

			NodeList itemList = item.getChildNodes();


			Node c1 = itemList.item(3);
			Node d1 = itemList.item(2);

			int c = 0;
			int d = 0;

			c = Integer.parseInt(c1.getChildNodes().item(0).getNodeValue());
			d = Integer.parseInt(d1.getChildNodes().item(0).getNodeValue());
			
			double hj = a-c; //확진자 값 double로 변환
			double sm = b-d;
	
			String str3 = numberFormat.format(hj); //확진자 값에 콤마 찍기
			String str4 = numberFormat.format(sm);
			
			System.out.println("일일확진자: " + str3 + "명,  일일사망자: " + str4 + "명");

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
