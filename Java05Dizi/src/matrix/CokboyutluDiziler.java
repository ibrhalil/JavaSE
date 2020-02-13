package matrix;

public class CokboyutluDiziler {

	public static void main(String[] args) {
		int x=10;
		int y = 6;
		int[][] matrix = new int[x][y];
		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				matrix[i][j]=(int) (Math.random()*90)+10;
			}
		}
		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(matrix[i][j]+ "  ");
			}
			System.out.println("");
		}

	}

}
