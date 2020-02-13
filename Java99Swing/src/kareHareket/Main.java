package kareHareket;

import java.awt.Color;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		int x = 1800;
		int y = 500;
		JFrame pencere = new JFrame("Oyun");
		Ekran panel = new Ekran(x,y);
		
		pencere.add(panel);
		pencere.addKeyListener(panel);
		pencere.setSize(x,y);
		pencere.setBackground(Color.GREEN);
		pencere.setVisible(true);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
