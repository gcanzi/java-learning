//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais.

package logica.EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		Locale.setDefault(Locale.US);
		
		double raio, area;
		
		System.out.print("Qual é o raio do circulo? ");
		raio = sc.nextDouble();
		
		area = Math.pow(raio, 2) * Math.PI;
		
		System.out.printf("A área do circulo é: %.4f%n", area);
		
		sc.close();
	}
}
