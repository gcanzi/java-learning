package poo.retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		rectangle retangulo = new rectangle();
		
		System.out.print("Coloque as medidas do retangulo: ");				
		retangulo.largura = sc.nextDouble();
		retangulo.altura = sc.nextDouble();
				
		System.out.printf("Area = %.2f%n", retangulo.area());
		System.out.printf("Perimetro = %.2f%n", retangulo.perimetro());
		System.out.printf("Diagonal = %.2f%n", retangulo.diagonal());

		sc.close();
	}
}
