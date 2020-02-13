package ZiplayanToplar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Ekran extends JPanel implements MouseListener, ActionListener {

	Graphics g;
	ArrayList<Top> toplar;
	Timer zaman;
	public Ekran() {
		setBackground(Color.lightGray);
		addMouseListener(this);
		toplar = new ArrayList<>();
		zaman = new Timer(30, this);
		zaman.start();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Top top : toplar) {
			top.ciz(g);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		Random r = new Random();
		int gen = r.nextInt(30) + 50;
		Top t = new Top(e.getX() - (gen / 2), e.getY() - (gen / 2), gen, gen);
		toplar.add(t);
		System.out.println(toplar.size() +" top bulunmakta");

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		zaman.start();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		zaman.stop();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (Top top : toplar) {
			top.hareket(getWidth(), getHeight());
		}
		repaint();

	}

}
