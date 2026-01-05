//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

package EstruturaSequencial;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, x, y, dif;
		
		System.out.print("Digite o valor de A: ");
		a = sc.nextInt();
		
		System.out.print("Digite o valor de B: ");
		b = sc.nextInt();
		
		System.out.print("Digite o valor de C: ");
		c = sc.nextInt();
		
		System.out.print("Digite o valor de D: ");
		d = sc.nextInt();
		
		x = a * b;
		y = c * d;
				
		dif = x - y;
		
		System.out.println("A diferença é de: " + dif);
		 
		sc.close();
	}
}
