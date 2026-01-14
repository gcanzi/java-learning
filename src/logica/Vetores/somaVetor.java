package logica.Vetores;

import java.util.Scanner;

public class somaVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos numeros voce vai digitar ? ");
		int n = sc.nextInt();
		int vet[] = new int[n];
			
		for (int i=0; i<vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		System.out.print("Valores = ");
		for (int i=0; i<vet.length; i++) {
			System.out.print(vet[i] + " ");			
		}
		System.out.println();
		
		double sum = 0;
		for (int i=0; i<vet.length; i++) {
			sum += vet[i]; 		
		}
		
		double average = sum / n;
		System.out.printf("Soma = %.2f%n", sum);
		System.out.printf("Media = %.2f%n", average);
		
		sc.close();
	}
}
