package generic_metot;

public class Yazdir {
	
	public static <E> void yazdir(E[] dizi)
	{
		for (E item : dizi) {
			System.out.println(item);
		}
	}

}
