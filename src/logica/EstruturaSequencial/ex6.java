//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

package logica.EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		Locale.setDefault(Locale.US);
		
		double a, b, c, tri, cir, tra, qua, ret;
		
		System.out.print("Digite o valor da base: ");
		a = sc.nextDouble();
		System.out.print("Digite o valor dos lados: ");
		b = sc.nextDouble();
		System.out.print("Digite o valor da altura: ");
		c = sc.nextDouble();
		
		tri = (a * c) /2;
		cir = Math.pow(c, 2) * Math.PI;
		tra = ((a + b) * c) /2;
		qua = Math.pow(b,2);
		ret = a * b;
		
		System.out.printf("Triangulo: %.3f%n", tri);
		System.out.printf("Circulo: %.3f%n", cir);
		System.out.printf("Trapézio: %.3f%n", tra);
		System.out.printf("Quadrado: %.3f%n", qua);
		System.out.printf("Retangulo: %.3f%n", ret);
		
		sc.close();
	}
}
