//Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e mostre o valor que
//esta pessoa deve pagar de Imposto de Renda

package logica.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ex8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite um sálario para calcular o imposto de renda: ");
		double salario = sc.nextDouble();
		
		double imposto = 0;
		
		if (salario < 0) {
			System.out.println("Valor inválido.");
		} else if (salario >= 0 && salario <= 2000) {
			System.out.println("Isento");
		} else if (salario <= 3000) {
			salario -= 2000;
			imposto = salario * 0.08;
		} else if (salario <= 4500) {
			salario -= 3000;
			imposto = salario * 0.18 + 80.0;
		} else {
			salario -= 4500;
			imposto = salario * 0.28 + 350.0;
		}
		
		System.out.printf("O total a pagar de imposto de renda é de R$ %.2f%n", imposto);
		
		sc.close();
	}
}
