package ilk;

public class SinifB extends SinifA{
	//public abstract void metotAbstract();		//sýnýf soyut olmadýgý için hata vermekte

	public void metotNoAbstract() {
		System.out.println("soyut sýnýf soyut olmayan metot çalýþtý");
	}

	@Override
	public void metotAbstract() {
		System.out.println("soyut sýnýftan miras alýnan ve override edilen metot çalýþtý.");
		
	}
}
