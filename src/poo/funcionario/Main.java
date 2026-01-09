package poo.funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		 	
		funcionario func = new funcionario();
		
		System.out.print("Nome: ");
		func.nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
		func.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		func.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcionario: " + func);
		System.out.println();
		System.out.print("Qual será o aumento salarial em %? ");
		double porcentagem = sc.nextDouble();
		func.ajusteSalario(porcentagem);
		System.out.println();
		System.out.println("Ajustado: " + func);
			
		sc.close();
	}
}
