// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		int a, b, soma;
		
		System.out.print("Digite dois numeros para serem somados: ");

		a = sc.nextInt();
		b = sc.nextInt();
		soma = a + b;
		
		System.out.println("Soma = " + soma);
		
		sc.close();
	}
}
