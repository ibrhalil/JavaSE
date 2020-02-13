package createNewFile;

import java.io.File;

public class DosyaOlusturma {

	public static void main(String[] args) {
		File f = new File("notlar1.txt");

		try 
		{
			f.createNewFile();	//dosya olu�turur
			System.out.println(f.getName() + " dosyas� olu�turuldu.");
			System.out.println(f.getAbsolutePath() + " bulundu�u dosya yolu");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
