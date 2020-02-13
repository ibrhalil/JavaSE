package object_serialization;

import java.io.Serializable;

public class Kisi implements Serializable
{
	private String ad;
	private int yas;
	public Kisi(String ad,int yas) {
		setAd(ad);
		setYas(yas);
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	@Override
	public String toString() {
		return "Kisi [ad= " + ad + " , yas= " + yas + "]";
	}
	
	
	
}