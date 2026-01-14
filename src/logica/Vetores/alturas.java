package logica.Vetores;

import java.util.Scanner;

public class alturas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		String vNome[] = new String[n];
		int vIdade[] = new int[n];
		double vAltura[] = new double[n];
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");			
			vNome[i] = sc.nextLine();
			System.out.print("Idade: ");	
			vIdade[i] = sc.nextInt();
			System.out.print("Altura: ");	
			vAltura[i] = sc.nextDouble();
		}
		
		double mediaAltura = 0;
		for (int i=0; i<n; i++) {
			 mediaAltura += vAltura[i];
		}
		mediaAltura = mediaAltura / n;
		System.out.printf("Altura média: %.2f%n", mediaAltura);
		
		int menor = 0;
		for (int i=0; i<n; i++) {
			 if (vIdade[i] < 16) {
				 menor += 1;
			 }
		}
		double mediaMenor = menor / n * 100;
		System.out.println("Pessosas com menos de 16 anos: " + mediaMenor + "%");
		
		for (int i=0; i<n; i++) {
			 if (vIdade[i] < 16) {
				 System.out.println(vNome[i]);
			 }
		}
		
		
		sc.close();
	}
}
