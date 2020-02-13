package kareHareket;

import java.awt.Graphics;

public class Kare {
	private int x;
	private int y;
	private int w;
	private int h;

	public Kare(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	public void ciz(Graphics g) {
		g.drawRect(x, y, w, h);
	}
	

	public void hareketSol(int hiz) {
		if (x > 0) {
			x -= hiz;
		}
	}

	public void hareketSag(int hiz,int genislik) {
		if (x <genislik-w ) {
			x += hiz;
		}
	}

}
