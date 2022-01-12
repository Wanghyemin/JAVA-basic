package com.day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test8 {

	public boolean fileCopy(String str1, String str2) {

		File f = new File(str1);

		if (!f.exists()) {
			return false;

		}

		try {

			FileInputStream fis = new FileInputStream(f); // str1�ᵵ �ȴ�
			FileOutputStream fos = new FileOutputStream(str2);

			int data = 0;
			byte[] buffer = new byte[1024];

			while ((data = fis.read(buffer, 0, 1024)) != -1) { // �ѹ�ó���Ҷ� 1024�� �о ����
				fos.write(buffer, 0, data);
			}

			fis.close();
			fos.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return true;
	}

	public static void main(String[] args) {

		Test8 ob = new Test8();
		
		if(ob.fileCopy("d:\\doc\\test.txt", "d:\\doc\\out4.txt")) {
			
			System.out.println("���Ϻ��� ����!");
		}else {
			
			System.out.println("���Ϻ��� ����!");
		}
		
		
		
		
		
		
		
	}

}