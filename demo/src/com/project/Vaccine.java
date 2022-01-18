package com.project;

import java.text.NumberFormat;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Vaccine {
	
	// 3�ڸ� �� ���� �޸���� (111,111)
	NumberFormat numberFormat = NumberFormat.getInstance();

	
	// �����Ȳ ����API ������ �������� //
	public void vaccine() {

		try {
			
			// URL �Ľ� //
			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = f.newDocumentBuilder();

			String url = "https://nip.kdca.go.kr/irgd/cov19stats.do?list=all";
			Document xmlDoc = parser.parse(url);
			
			// XML ��� �б� //
			Element root = xmlDoc.getDocumentElement();
			Node body = root.getChildNodes().item(1);
			Node items = body.getChildNodes().item(3);
			Node item3 = items.getChildNodes().item(5);
			NodeList itemList = item3.getChildNodes();

			Node a1 = itemList.item(3); // 1����� �����Ϸ� �α�
			Node b1 = itemList.item(5); // 2����� �����Ϸ� �α�
			Node c1 = itemList.item(7); // 3����� �����Ϸ� �α�
			
			// ����(String)�� ��ȯ // 
			String first = a1.getChildNodes().item(0).getNodeValue();
			String second = b1.getChildNodes().item(0).getNodeValue();
			String third = c1.getChildNodes().item(0).getNodeValue();

			// �� �α� //
			double people = 51345000;
			
			// õ�� ���� �޸�����ֱ� //
			String str = numberFormat.format(people);
			String vc1 = numberFormat.format(Double.parseDouble(first));
			String vc2 = numberFormat.format(Double.parseDouble(second));
			String vc3 = numberFormat.format(Double.parseDouble(third));

			
			// �ڷ� ��� //
			System.out.printf("��ü �α� �� %s�� ��\n", str);
			
			System.out.print("1�����: " + vc1 + "�� ");
			System.out.printf("%.3g(%s)\n", Double.parseDouble(first) / 51345000 * 100, "%");
			
			System.out.print("2�����: " + vc2 + "�� ");
			System.out.printf("%.3g(%s)\n", Double.parseDouble(second) / 51345000 * 100, "%");
			
			System.out.print("3�����: " + vc3 + "�� ");
			System.out.printf("%.3g(%s)\n", Double.parseDouble(third) / 51345000 * 100, "%");

		} catch (Exception e) {
			
			System.out.println(e.toString());
		}

	}

}