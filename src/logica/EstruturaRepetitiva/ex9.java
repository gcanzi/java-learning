//Ler um número inteiro N e calcular todos os seus divisores.

package logica.EstruturaRepetitiva;

import java.util.Scanner;

public class ex9 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite um numero para descobrir seus divisores: ");
		int x = sc.nextInt();
		
		for (int i=1 ; i<=x ; i++){
			if (x % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
