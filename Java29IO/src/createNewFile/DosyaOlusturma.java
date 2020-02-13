package createNewFile;

import java.io.File;

public class DosyaOlusturma {

	public static void main(String[] args) {
		File f = new File("notlar1.txt");

		try 
		{
			f.createNewFile();	//dosya oluþturur
			System.out.println(f.getName() + " dosyasý oluþturuldu.");
			System.out.println(f.getAbsolutePath() + " bulunduðu dosya yolu");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
