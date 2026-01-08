package logica.EstruturaSequencial;
import java.util.Locale;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		String x;
		int y;
		double z;
		char w;
		
		System.out.println("Digite uma palavra: ");
		x = sc.next();
		//Para o tipo String/palavras
		
		System.out.println("Digite uma palavra ou letra: ");
		w = sc.next().charAt(0);
		//Independente do que for digitado, pega apenas a primeira letra
		
		System.out.println("Digite um numero: ");
		y = sc.nextInt();
		//Para numeros inteiros

		System.out.println("Digite outro numero: ");
		z = sc.nextDouble();
		//Para numeros com virgula
		
		//Para captar os dados até a proxima linha ou apertar enter, utiliza-se:
		//sc.nextLine();
		
		System.out.println("Você digitou: " + x + y + z + w);
		
		sc.close();
	}
}
