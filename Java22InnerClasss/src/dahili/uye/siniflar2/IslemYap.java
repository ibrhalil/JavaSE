package dahili.uye.siniflar2;

public class IslemYap 
{
	public class DahiliUye 
	{
		private int x, y;

		public DahiliUye(int x, int y) 
		{
			this.x = x;
			this.y = y;
		}

		public void carp() 
		{
			System.out.println("Çarpýmlarý : " + (x * y));
		}
	}

	public static class DahiliUye2
	{
		public static void topla(int s1, int s2) 
		{
			System.out.println("Toplamlarý : " + (s1 + s2));
		}
	}
}

