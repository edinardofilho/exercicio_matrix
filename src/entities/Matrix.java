package entities;

public class Matrix {
	private int m;
	private int n;
	private String answer = "";
	
	int[][] matrix = new int [this.m][this.n];
	
	public Matrix(int m, int n) {
		this.m = m;
		this.n = n;
	}
	
	public int getM() {
		return m;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}
	
	public int getN() {
		return n;
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void testMatrix(int x) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == x) {
					answer += "Position " + i + ","+ j + ":" + "\n";
					if ((j - 1) >= 0) {
						answer += "Left: " + matrix[i][j - 1] + "\n";
					}
					if ((i - 1) >= 0) {
						answer += "Up: " + matrix[i - 1][j] + "\n";
					}
					if ((j + 1) < matrix[i].length) {
						answer += "Right: " + matrix[i][j + 1] + "\n";
					}
					if ((i + 1) < matrix.length) {
						answer += "Down: " + matrix[i + 1][j] + "\n";
					}
				}
			}
		}
	}
	
	public String toString() {
		return answer;
	}
	
}
