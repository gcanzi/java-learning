package logica.Vetores;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o tamanho da matriz: ");
		int n = sc.nextInt();

		int mat[][] = new int[n][n];

		System.out.println("Insira os numeros da matriz: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Diagonal principal: ");

		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		int negativeNumbers = 0;
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (mat[i][j] < 0) {
					negativeNumbers++;
				}
			}
		}
		System.out.println("\nNumeros negativos = " + negativeNumbers);

		sc.close();
	}

}
