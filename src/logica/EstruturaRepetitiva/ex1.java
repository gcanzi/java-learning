//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta informada,
//escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e
//o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 
package logica.EstruturaRepetitiva;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite uma senha para abrir o cofre: ");
		int pass = sc.nextInt();
		
		while (pass != 2002) {
			System.out.print("Senha errada, tente novamente: ");
			pass = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido!");
		
		sc.close();
	}
}
