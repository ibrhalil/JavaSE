package ilk;

public class Kare implements ISekil {

	private int kenar;

	public Kare(int kenar) {
		this.kenar = kenar;
	}

	@Override
	public int alanHesap() {
		// TODO Auto-generated method stub
		return this.kenar * this.kenar;
	}

	@Override
	public int cevreHesap() {
		// TODO Auto-generated method stub
		return 4 * this.kenar;
	}

}
