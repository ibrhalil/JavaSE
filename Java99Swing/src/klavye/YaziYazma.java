package klavye;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class YaziYazma extends JFrame implements KeyListener {

	String metin = "Halil ibrahim Aydýn";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new YaziYazma(400, 300);
		new YaziYazma(600, 300);
		new YaziYazma(400, 800);
	}

	public YaziYazma(int pX, int pY) {
		// TODO Auto-generated constructor stub
		setSize(pX, pY);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addKeyListener(this);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawString(metin, 100, 100);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==e.VK_BACK_SPACE && metin.length()>0)
		{
			metin=metin.substring(0, metin.length()-1);
		}
		else if(e.getKeyCode()==e.VK_ENTER)
		{
			metin+="ENTER";
		}
		else
		{
			metin+=e.getKeyChar();
		}
		repaint();

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
