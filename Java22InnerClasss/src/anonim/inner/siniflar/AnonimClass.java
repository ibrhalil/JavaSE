package anonim.inner.siniflar;

public class AnonimClass {

	public static void main(String[] args) {

		IClass tt = new IClass() {

			@Override
			public int test3(int a) {
				return a * a;
			}

			@Override
			public int test2() {
				return 11;
			}

			@Override
			public void test1() {
				System.out.println("anonim class calısıyor");
			}
		};

		tt.test1();
		tt.test2();
		tt.test3(3);

		
		System.out.println("----------------------------------------------");
		
		AClass ff = new AClass() {

			@Override
			public int test5() {
				System.out.println("test5 tanımlandı");
				return 0;
			}
		};
		
		ff.test4();
		ff.test5();
		ff.test6(3);
		
	}

	interface IClass {
		public void test1();

		public int test2();

		int test3(int a);
	}

	
	abstract static class AClass {	//static olmak zorunda
		public void test4() {
			System.out.println("Abstract Class");
		}

		public abstract int test5();

		int test6(int a) {
			return 10*a*3;
		}
	}

}
