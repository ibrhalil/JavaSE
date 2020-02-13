package fare;

import java.awt.Event;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class CizgiCizme extends JFrame implements MouseListener {
	public CizgiCizme() {
		setExtendedState(MAXIMIZED_BOTH); // full ekran kaplama
		setVisible(true);
		x1 = x2 = y1 = y2 = 100;
		addMouseListener(this);
	}

	private static int x1, x2, y1, y2;
	private static boolean tiklama = false;
	public static void main(String[] args) {
		new CizgiCizme();
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawLine(x1, y1, x2, y2);
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		
	}

	@Override
	public void mousePressed(MouseEvent e) {

		if (tiklama) {
			x1 = e.getX();
			y1 = e.getY();
		} else {
			x2 = e.getX();
			y2 = e.getY();
		}
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (tiklama) {
			tiklama = false;
		} else {
			tiklama = true;
		}

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
