package dahili.uye.siniflar;

public class InnerClass 
{
	
	int x = 10;

	public class AltClass 
	{
		
		int y = 11;

		public class EnAltClass 
		{
			
			int z = x + y;
		}
	}

	class AltClass2 {
		int f = x+3;
		class EnAltClass {
			int h = f+x;
		}

		public class EnAltClass2 {
			int t = 7;
		}
	}
}
