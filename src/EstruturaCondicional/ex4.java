package EstruturaCondicional;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o horario que iniciou o jogo: ");
		int inicio = sc.nextInt();
		System.out.print("Digite o horario que encerrou o jogo: ");
		int fim = sc.nextInt();
		
		int duracao;
		
		if (inicio < fim) {
			duracao = fim - inicio;
		}
		else {
			duracao = (24 - inicio) + fim;
		}
		
		System.out.println("O jogo durou " + duracao + " hora(s).");
		
		sc.close();		
	}
}
