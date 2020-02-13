package kare;

import java.awt.Graphics;

import javax.swing.JFrame;

public class Kare extends JFrame {

	public Kare() {
		setSize(600, 600);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);	
		g.drawRect(50, 50, 250, 150);

	}

	public static void main(String[] args) {

		new Kare();
	}

}
