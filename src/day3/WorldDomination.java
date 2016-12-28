package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String question=JOptionPane.showInputDialog("Do you know how to write code? yes=yee  no=nope");
		// 2. If they say "yes", tell them they will rule the world.
if (question.equals("yee")) {
	JOptionPane.showMessageDialog(null,"U R A GOD NOW!");
}
if (question.equals("nope")) {
	JOptionPane.showMessageDialog(null,"U R A NOOB!");
}
	
}
		// 3. Otherwise, wish them good luck washing dishes.

	}

