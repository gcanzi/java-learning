//Escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		Locale.setDefault(Locale.US);
		
		System.out.print("Informe o código do produto: ");
		int cod = sc.nextInt();
		System.out.print("Informe a quantidade do produto: ");
		int qtd = sc.nextInt();
		
		double valor = 0;
		
		switch (cod) {
		case 1:
			valor = 4.00 * qtd;
			break;
		case 2:
			valor = 4.50 * qtd;
			break;
		case 3:
			valor = 5.00 * qtd;
			break;
		case 4:
			valor = 2.00 * qtd;
			break;
		case 5:
			valor = 1.50 * qtd;
			break;
		default:
			valor = 0;
			break;
		}
		
		if (valor == 0) {
			System.out.println("Código inválido!");
		} else {
			System.out.printf("Total a pagar R$ %.2f%n", valor);
		}
		
		sc.close();
	}
}
