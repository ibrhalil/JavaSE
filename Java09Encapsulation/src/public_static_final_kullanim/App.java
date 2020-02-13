package public_static_final_kullanim;

public class App {
	
	int i = 1;
	
	final int fi=2;
	
	static int si = 3;
	
	final static int fsi = 4;
	
	static final int sfi = 5;
	
	public static final int psfi = 6;
	
	public final int pfi = 7;
	
	public int pi = 8;
	
	
	
	

	public static void main(String[] args) {

		new App().i=9;
		//new App().fi=10;		Hata
		si=11;
		//fsi=12;				Hata
		//sfi=13;				Hata
		
	}

}
