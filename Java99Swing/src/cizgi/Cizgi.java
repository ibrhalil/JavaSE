package cizgi;

import java.awt.Graphics;

import javax.swing.JFrame;

public class Cizgi extends JFrame{
	public Cizgi() {
		setSize(700,700);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new Cizgi();

	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawLine(50, 60, 200, 300);
	}

}
