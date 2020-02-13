package isimsiz.siniflar;

interface accmp
{
	int topla();
}

public class Main 
{
	accmp metot(int s1,int s2)
	{
		return new accmp(){
			@Override
			public int topla() {
				return s1+s2;
			}
		};
	}
	
	public static void main(String[] args) {
		System.out.println((new Main()).metot(5, 9).topla());
	}
}
