package ilk;

public class Main {

	public static void main(String[] args) {
		Kare k1 = new Kare(2);
		System.out.println("Kare alan "+ k1.alanHesap());
		System.out.println("Kare cevre "+k1.cevreHesap());
		
		Ucgen u1 = new Ucgen(10, 8,4);
		System.out.println("ucgen alan "+u1.alanHesap());
		System.out.println("ucgen cevre "+u1.cevreHesap());
		
	}

}
