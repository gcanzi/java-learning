package logica.Vetores;

import java.util.Scanner;

public class Position {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int mat[][] = new int[n][n];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int number = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == number) {
					System.out.println("Posição " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Acima: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Direita: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Abaixo: " + mat[i+1][j]);
					}
				}
			}
		}
			
		sc.close();
	}

}
