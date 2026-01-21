package poo.initial.media;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		aluno alu = new aluno();
		
		System.out.print("Digite seu nome: ");
		alu.nome = sc.nextLine();
		System.out.print("Digite suas 3 notas: ");
		alu.nota1 = sc.nextDouble();
		alu.nota2 = sc.nextDouble();
		alu.nota3 = sc.nextDouble();
		
		if (alu.mediaFinal() < 60) {
			System.out.println("Reprovado!");
			System.out.printf("Faltou %.2f pontos", alu.faltouNota());
		} else {
			System.out.println("Aprovado!");
		}
		
		sc.close();
	}
}
