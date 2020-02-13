package cizgi;

import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

public class RasgeleCizgiler extends JFrame {
	public RasgeleCizgiler() {
		setSize(650, 480);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		Random r = new Random();
		for (int i = 0; i < 1000; i++) {
			g.drawLine(r.nextInt(650), r.nextInt(480), r.nextInt(650), r.nextInt(480));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RasgeleCizgiler();
	}

}
