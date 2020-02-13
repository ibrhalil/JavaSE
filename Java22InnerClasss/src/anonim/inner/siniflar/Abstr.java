package anonim.inner.siniflar;

public class Abstr {

	public static void main(String[] args) {
		
		Xac m = new Xac("Mehmet",1453){

			@Override
			void cagir() {
				System.out.println("Merhabalar "+getX());
			}
			
		};
		
		m.cagir();

	}
	static abstract class Xac
	{
		private String x;
		private int y;
		
		public Xac(String x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		public String getX() {
			return x;
		}

		public void setX(String x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
		abstract void cagir();
		
	}

}
