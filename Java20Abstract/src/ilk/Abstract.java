package ilk;

public class Abstract 
{

	public static void main(String[] args) 
	{
		SinifA s1 = new SinifA() {
			
			@Override
			public void metotAbstract() {
				System.out.println("soyut s�n�ftan override edildi");
				
			}
		};
		
		s1.metotAbstract();
		s1.metotNoAbstract();
		
		//SinifA s2 = new SinifA();			//hata verir class i�inde override edilmedi
		SinifB s2 = new SinifB();
		s2.metotAbstract();
		
	}

}
