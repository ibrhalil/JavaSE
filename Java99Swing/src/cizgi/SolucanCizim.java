package cizgi;

import java.awt.Graphics;
import java.time.Duration;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SolucanCizim extends JFrame {
	private  int aralik;
	public SolucanCizim(int pX, int pY, int aralik) {
		this.aralik=aralik;
		setSize(pX, pY);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		int pX=getSize().width;
		int pY=getSize().height;
		int ortaX = pX / 2;
		int ortaY = pY / 2;
		int x1 = ortaX;
		int y1 = ortaY;
		int x2 = x1, y2 = y1;
		int katSay;
		if(aralik>0)
		{
			katSay=aralik*-1;
		}
		else
		{
			katSay=aralik;
		}
		
		boolean d = true;
		while (true) {
			if (d) {
				katSay *= -1;
				d = false;
				x2 += katSay;
			} else {
				d = true;
				y2 += katSay;
				if(katSay>0)
				{
					katSay+=aralik;
				}
				else
				{
					katSay-=aralik;
				}
				
			}

			g.drawLine(x1, y1, x2, y2);
			x1 = x2;
			y1 = y2;
			if (katSay >= (pX > pY ? pY : pX)) {
				break;
			}
		}

	}

	public static void main(String[] args) {
		/*int pencereX = Integer.parseInt(JOptionPane.showInputDialog("Pencere Geniþlik : "));
		int pencereY = Integer.parseInt(JOptionPane.showInputDialog("Pencere Yükseklik : "));
		int aralik = Integer.parseInt(JOptionPane.showInputDialog("Cizgi Aralýðý : "));
		new SolucanCizim(pencereX,pencereY,aralik);*/
		new SolucanCizim(400, 300, 3);
		new SolucanCizim(400, 300, 5);
		new SolucanCizim(400, 300, 8);
		new SolucanCizim(400, 300, 13);
	}

}
