package serialization;

import java.io.Serializable;

public class Kisi  implements Serializable
{
	private static final long serialVersionUID = 10000000;		//verion kontrol gibi düşünülebilir
	private String ad;
	private String soyad;
	private int yas;
	
	public Kisi(String ad, String soyad, int yas) {
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
	}
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}

	@Override
	public String toString() {
		return "Kisi ad = " + ad + " , soyad = " + soyad + " , yas = " + yas;
	}
	
	
}
