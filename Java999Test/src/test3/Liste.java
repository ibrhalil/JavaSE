package test3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Liste {

	public static void main(String[] args) {
		List<Object> liste = new ArrayList<Object>();
		Collection<Object> liste2 = new ArrayList<>();
		liste2.add("test");
		liste2.add(new Liste());
		liste2.add(44);
		liste2.add(0.3);
		
		liste2.forEach(System.out::println);
		
	}

}
