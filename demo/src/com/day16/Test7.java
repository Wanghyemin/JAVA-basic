package com.day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test7 {

	public static void main(String[] args) {

		// ���� ����
		// ���� ����? d:\\doc\\test.txt
		// ��� ����? d:\\doc\\out2.txt
		// ���� �Ϸ�

		try {

			FileInputStream fis = new FileInputStream("d:\\doc\\test.txt");
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out2.txt");

			int data;
			while ((data = fis.read()) != -1) {

				/*System.out.write(data);*/

				fos.write(data); // �����¾�
				fos.flush();

			}
			
			fis.close();
			fos.close();
			System.out.println("�Ϸ�Ǿ����ϴ�:)");
			
		} catch (Exception e) {
			
		}

	}

}