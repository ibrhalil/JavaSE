package ilk;

public class Ucgen implements ISekil{

	private int kenar1;
	private int kenar2;
	private int kenar3;
	
	private int yukseklik;
	private boolean secim=true;
	
	public Ucgen(int kenar1,int kenar2,int kenar3) {

		this.kenar1=kenar1;
		this.kenar2=kenar2;
		this.kenar3=kenar3;
		secim=false;
	}
	
	public Ucgen(int taban,int yuksekli) {

		this.kenar1=taban;
		this.yukseklik=yuksekli;
		secim=true;
	}
	
	@Override
	public int alanHesap() {
		if(secim)
		{
			return (kenar1*yukseklik)/2;
		}
		else
		{
			int u = (kenar1+kenar2+kenar3)/2;
			
			return (int) Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
		}
	}

	@Override
	public int cevreHesap() {
			if(!secim)
			return kenar1+kenar2+kenar3;
			
			return 0;
	}
	

}
