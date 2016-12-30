package day3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String Name=JOptionPane.showInputDialog("Welcome to greeter. What is your name?");
	JOptionPane.showMessageDialog(null,"Hello "+Name);
}
}
