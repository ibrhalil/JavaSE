package generic_sinif;

import java.util.List;

public class Listele<E> {

	E degisken;
	
	void listele(List<E> liste)
	{
		for (E item : liste) {
			System.out.println(item);
		}
	}
}
