//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se
//os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.

package logica.EstruturaCondicional;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) { 
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite dois números:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a >= b) {
			if (a % b == 0) {
				System.out.println("São Multiplos!");
			}
			else {
				System.out.println("Não são Multiplos!");
			}
		}
		else {
			if (b % a == 0) {
				System.out.println("São Multiplos!");
			}
			else {
				System.out.println("Não são Multiplos!");
			}
		}
		
		sc.close();		
	}
}
