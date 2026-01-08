//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

package logica.EstruturaCondicional;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("O número digitado é par!");
		}
		else {
			System.out.println("O número digitado é impar!");
		}
		
		sc.close();
	}
}
