package ilk;

public class Kedi extends Hayvan {
	
	public Kedi(String ad, int yas) {
		super(ad,yas);
		System.out.println("Kedi Oluşturuldu.");
	}
	
	@Override
	public String sesCikar() {
		// TODO Auto-generated method stub
		return "miyavv";
	}

}
