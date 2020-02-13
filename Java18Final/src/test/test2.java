package test;

public class test2 {

	public static void main(String[] args) {

		sinifC c1 = new sinifC(8);
		System.out.println(c1.goster());
		c1 = new sinifC(7);
	}

}

class sinifC
{
	private final int res;
	sinifC(int res) 
	{
		this.res=res;
	}
	
	public int goster()
	{
		return this.res;
	}
}
