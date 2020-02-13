package yerel.siniflar;

public class ClassA 
{	
	int metot(int a,int b,int c)
	{
		class ClassB
		{
			int metot()
			{
				return a+b+c;
			}
		}
		ClassB d = new ClassB();
		return d.metot();
	}
	//metot dýþýnda class eriþilemez
}
