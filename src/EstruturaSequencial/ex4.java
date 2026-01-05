//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o
//salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		Locale.setDefault(Locale.US);
		
		int nFuncionario, horas;
		double salario, valorHora;
		
		System.out.print("Digite o número do funcionário: ");
		nFuncionario = sc.nextInt();
		System.out.print("Digite as horas trabalhadas: ");
		horas = sc.nextInt();
		System.out.print("Digite o valor por hora: ");
		valorHora = sc.nextDouble();
		
		salario = (double) horas * valorHora;
		
		System.out.println("Funcionário número: " + nFuncionario);
		System.out.printf("Salário: R$ %.2f%n", salario);
		
		sc.close();		
	}
}
