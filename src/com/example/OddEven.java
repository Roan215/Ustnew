package com.example;

import javax.swing.JOptionPane;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number=JOptionPane.showInputDialog("enter a number");
		int n= Integer.parseInt(number);
		String message=(n%2==0?"even":"odd");
		JOptionPane.showMessageDialog(null, message);
	}
}
