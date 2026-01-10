package poo.dolar;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);		
		
		System.out.print("Qual é o valor do dolar? ");
		Dolar.precoDolar = sc.nextDouble();
		System.out.print("Quantos dolares que comprar? ");
		Dolar.qtdDolar = sc.nextDouble();
		
		Dolar.exibirResultado();
		
		sc.close();
	}
}

class Dolar {

	static double precoDolar;
	static double qtdDolar;
	
	public static double converter() {
		return precoDolar * qtdDolar * 1.06;
	}
	
	public static void exibirResultado() {
		System.out.printf("Valor pago em reais: %.2f", converter());
	}
}
