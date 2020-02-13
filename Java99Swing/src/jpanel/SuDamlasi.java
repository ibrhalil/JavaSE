package jpanel;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class SuDamlasi extends JPanel implements ActionListener {
	int x, y, gen, yuk;
	private Graphics g;

	public SuDamlasi(int pX, int pY,int hiz) {
		JFrame pencere = new JFrame("Su Damlasý");
		pencere.add(this);
		pencere.setSize(pX, pY);
		gen = yuk = 15;
		pencere.setVisible(true);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Timer time = new Timer(hiz, this);
		time.start();
	}

	public static void main(String[] args) {

		new SuDamlasi(600, 400,50);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.g=g;
		g.drawOval(x, y, gen, yuk);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		gen += 3;
		yuk += 3;
		x = getWidth() / 2 - gen / 2;
		y = getHeight() / 2 - gen / 2;
		repaint();
	}
}
