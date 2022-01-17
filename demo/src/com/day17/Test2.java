package com.day17;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Test2 extends Frame implements WindowListener {

	private static final long serialVersionUID = 1L;

	public Test2() {
		setTitle("�ڹ� ������");
		setSize(300, 300);

		addWindowListener(this); // ����ڰ� �� �ϴ��� �ͱ���̰� �ִ� ���, ������, cctv
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Test2();
	}

	@Override
	public void windowActivated(WindowEvent e) { // â�� �յڷ� �ű� : �ٸ� â�� �ڹ�â
	}

	@Override
	public void windowClosed(WindowEvent e) { // â ����
	}

	@Override
	public void windowClosing(WindowEvent e) { // ���� �� �������� ����� ��
		
		System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) { // â�� �յڷ� �ű� : �ٸ� â�� �ڹ�â
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowOpened(WindowEvent e) { // â�� ó�� ���� ��
	}

}