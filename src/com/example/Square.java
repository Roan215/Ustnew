package com.example;

import javax.swing.JOptionPane;

public class Square {
	public static void main(String[] args) {
		String number=JOptionPane.showInputDialog("enter a number");
		int n= Integer.parseInt(number);
		int message=n*n;
		JOptionPane.showMessageDialog(null, message);
	}
}
