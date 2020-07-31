package application;

import java.util.Scanner;

import entities.Matrix;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] matrix = new int[m][n];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		Matrix objMatrix = new Matrix(m,n);
		
		objMatrix.setMatrix(matrix);
		
		int x = sc.nextInt();
		
		objMatrix.testMatrix(x);
		
		System.out.println(objMatrix);
		
		sc.close();
	}

}
