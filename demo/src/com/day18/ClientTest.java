package com.day18;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientTest extends Frame implements ActionListener, Runnable {

	private static final long serialVersionUID = 1L;

	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	private Socket sc = null;
	private String host = "192.168.16.15"; //127.0.0.1 //localhost
	private int port = 7777;
	
	public ClientTest() {
		
		add(ta, BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);
		tf.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});

		setTitle("ä��Ŭ���̾�Ʈ");
		setSize(300, 400);
		setVisible(true);

	}

	public void connect() { // server socket ����� ����

		try {

			sc = new Socket(host,port); // Ŭ���̾�Ʈ�� ����
			
			Thread th = new Thread(this);
			th.start();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public static void main(String[] args) {
		new ClientTest().connect();

	}

	@Override // runnable implements
	public void run() {
		// �����͸� ���� ��
		String str;

		try {

			if (sc == null) {
				return;
			}

			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			while ((str = br.readLine()) != null) {
				ta.append("\r\n" + str);
			}

		} catch (Exception e) {
			ta.append("\r\n ���� ���� ����");
			sc = null;
		}

	}

	@Override // actionlistener implements
	public void actionPerformed(ActionEvent e) {
		// �����͸� ������

		String str = tf.getText();

		if (str.trim().equals("")) {// trim ���� ���� ���ֹ���

			return;
		}
		if (sc == null) {

			return;

		}

		try {

			/*
			 * OutputStream os = sc.getOutputStream(); PrintWriter pw = new PrintWriter(os);
			 */

			PrintWriter pw = new PrintWriter(sc.getOutputStream(), true); // true�� flush�� �ǹ�
			pw.println("Ŭ���̾�Ʈ]" + str); // Ŭ���̾�Ʈ�� ���� // ln�� �־�� �����Ͱ� ����!!

			ta.append("\r\n Ŭ���̾�Ʈ]:" + str);
			
			tf.setText("");
			tf.requestFocus();
			
			

		} catch (Exception e2) {
			ta.append("\r\n ������ ������ ������ϴ�.");
			sc = null;
		}

	}

}