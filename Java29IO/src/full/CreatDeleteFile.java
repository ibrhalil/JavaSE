package full;

import java.io.File;

public class CreatDeleteFile {

	public static void main(String[] args) {
		File f = new File("notlar2.txt");

		try 
		{
			f.createNewFile();	//dosya olu�turur
			System.out.println(f.getName() + " dosyas� olu�turuldu.");
			System.out.println(f.getAbsolutePath() + " bulundu�u dosya yolu");
			
			Thread.sleep(3000);
			System.out.println("3 saniye bekleme");
			
			f.delete();	//dosya siler
			//System.out.println(f.exists());//dosya var m� ?
			if (f.exists()) {
				System.out.println(f.getName()+" dosyas� ' "+f.getAbsolutePath()+" ' dizininde bulunmaktad�r.");
			}
			else
			{
				System.out.println("dosya silindi.");
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
