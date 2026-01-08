//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

package logica.EstruturaCondicional;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("O número digitado é Negativo!");
		} 
		else {
			System.out.println("O número digitado é Positivo!");
		}
		
		sc.close();
	}
	
}
