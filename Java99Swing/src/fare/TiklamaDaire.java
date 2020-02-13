package fare;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;

public class TiklamaDaire extends JFrame implements MouseListener {
	public TiklamaDaire(int pencereX, int pencereY) {
		setSize(pencereX, pencereY);
		setVisible(true);
		addMouseListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private Graphics g;
	private int mouseX;
	private int mouseY;
	private int c ;

	public static void main(String[] args) {

		new TiklamaDaire(500, 400);

	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		this.g = g;
		g.setColor(Color.MAGENTA);
		g.drawOval(mouseX-(c/2), mouseY-(c/2), c, c);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseX = e.getX();
		mouseY = e.getY();
		c = (int) ((new Random()).nextInt(250))+50;
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
