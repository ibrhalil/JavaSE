package dahili.uye.siniflar2;

import dahili.uye.siniflar2.IslemYap.DahiliUye2;

public class Main 
{

	public static void main(String[] args) {
		
		IslemYap.DahiliUye altClass = new IslemYap().new DahiliUye(8, 3);
		altClass.carp();
		
		DahiliUye2.topla(3, 5); 	//Static tan�mland��� i�in eri�mek i�in �st s�n�ftan eri�medik

	}

}
