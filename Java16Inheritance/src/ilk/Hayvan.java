package ilk;

public class Hayvan {
	String ad;
	int yas;

	public Hayvan() {
		this("tan�ms�z", 0);
	}

	public Hayvan(String ad, int yas) {
		this.ad = ad;
		this.yas = yas;
		System.out.println("Hayvan Olu�turuldu.");
	}
	
	public String sesCikar() {
		return "Hayvan Ses ��kar�r.";
	}



}
