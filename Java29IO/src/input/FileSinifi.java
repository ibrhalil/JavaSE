package input;

import java.io.File;

public class FileSinifi {

	private File dosya;
	private static int dosyaSayisi=0;
	
	public FileSinifi(final String DosyaYolu) {
		dosyaSayisi++;
		dosya = new File(DosyaYolu);
	}
	
	public static int getDosyaSayisi() {
		return dosyaSayisi;
	}
	
	public File getFile() {
		return dosya;
	}

	public void dosyaOlustur() throws Exception{
		if(!dosya.exists())				//	dosya varl�g�n� kontrol eder.
			dosya.createNewFile();		//	dosya olusturur.
	}
	
	public String dosyaAdi() {
		return dosya.getName();
	}
	
	public String dosyaYolu() {
		return dosya.getAbsolutePath();
	}
	
	public void dosyaSil() {
		if(dosya.exists())
		{
			dosya.delete();
			System.out.println("Dosya Silindi.");
		}
		else
		{
			System.out.println("Dosya Yok !");
		}		
	}
	
	public void dosyaYenidenAdlandir(String DosyaAdi)
	{
		String dosyaAd = dosyaAdi();
		File tmpDosya = new File(DosyaAdi);
		dosya.renameTo(tmpDosya);
		System.out.println(dosyaAd +" - dosya ad�n�z ' "+dosyaAdi()+" ' ad�yla de�i�tirildi.");
	}
	
	public void dosyaOkumaYazmaKontrol() {
		if (dosya.canRead()) {
			System.out.println(dosyaAdi() +"  okunabilir.");
		}
		else
		{
			System.out.println("dosya Okunamaz.");
		}
		
		if (dosya.canWrite()) {
			System.out.println(dosyaAdi() +"  yaz�labilir.");
		}
		else
		{
			System.out.println("dosya yaz�lamaz.");
		}
	}
	
	public void dosyaOzellikleriListele() {
		System.out.println("Dosya Ad�       : "+dosyaAdi());
		System.out.println("Dosya Yolu      : "+dosyaYolu());
		System.out.println("Dosya Boyutu    : "+dosya.getTotalSpace());
		System.out.println("Dosya Genisligi : "+dosya.length());
		
		System.out.println("");
		
		dosyaOkumaYazmaKontrol();
		
		System.out.println("_______________________________________");
	}
	
	
	
}
