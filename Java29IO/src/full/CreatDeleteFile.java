package full;

import java.io.File;

public class CreatDeleteFile {

	public static void main(String[] args) {
		File f = new File("notlar2.txt");

		try 
		{
			f.createNewFile();	//dosya oluþturur
			System.out.println(f.getName() + " dosyasý oluþturuldu.");
			System.out.println(f.getAbsolutePath() + " bulunduðu dosya yolu");
			
			Thread.sleep(3000);
			System.out.println("3 saniye bekleme");
			
			f.delete();	//dosya siler
			//System.out.println(f.exists());//dosya var mý ?
			if (f.exists()) {
				System.out.println(f.getName()+" dosyasý ' "+f.getAbsolutePath()+" ' dizininde bulunmaktadýr.");
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
