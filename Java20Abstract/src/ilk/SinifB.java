package ilk;

public class SinifB extends SinifA{
	//public abstract void metotAbstract();		//s�n�f soyut olmad�g� i�in hata vermekte

	public void metotNoAbstract() {
		System.out.println("soyut s�n�f soyut olmayan metot �al��t�");
	}

	@Override
	public void metotAbstract() {
		System.out.println("soyut s�n�ftan miras al�nan ve override edilen metot �al��t�.");
		
	}
}
