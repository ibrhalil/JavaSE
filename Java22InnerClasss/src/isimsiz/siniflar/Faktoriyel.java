package isimsiz.siniflar;

public class Faktoriyel 
{
	interface Faktor {
		long hesap();
	}

	public static void main(String[] args) 
	{
		Faktoriyel f = new Faktoriyel();
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "! : " + f.fak(i));
		}
	}

	long fak(long sayi) 
	{
		return new Faktor() 
		{
			@Override
			public long hesap() 
			{
				long sonuc = 1;
				for (int i = 1; i <= sayi; i++) 
				{
					sonuc *= i;
				}
				return sonuc;
			}
		}.hesap();
	}
}
