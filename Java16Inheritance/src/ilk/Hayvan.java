package ilk;

public class Hayvan {
	String ad;
	int yas;

	public Hayvan() {
		this("tanımsız", 0);
	}

	public Hayvan(String ad, int yas) {
		this.ad = ad;
		this.yas = yas;
		System.out.println("Hayvan Oluşturuldu.");
	}
	
	public String sesCikar() {
		return "Hayvan Ses Çıkarır.";
	}



}
