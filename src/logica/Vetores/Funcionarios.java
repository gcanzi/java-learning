package logica.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Funcionarios {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario vect[] = new Funcionario[10];
		
		System.out.print("Quantos funcionarios serão registrados? ");
		int n = sc.nextInt();
			
		for (int i=0; i<n; i++) {
	
			System.out.println();
			System.out.println("Funcionário #" + (i+1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			for (int j = 0; j < i; j++) {
			    if (vect[j].getId() == id) {
			        System.out.print("Id já cadastrado! Tente novamente: ");
			        id = sc.nextInt();
			        j = -1;
			    }
			}
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			
			vect[i] = new Funcionario(id, nome, salario);
		}
		
		System.out.println();
		System.out.print("Coloque o id do funcionário que recebera aumento: ");
		int idAumento = sc.nextInt();
		
		int posicao = -1; 
        
        for (int i=0; i<n; i++) {
            if (vect[i].getId() == idAumento) {
                posicao = i;
                break;
            }
        }

        if (posicao == -1) {
            System.out.println("Id não encontrado!");
        }
        else {
            System.out.print("Insira a porcentagem do aumento: ");
            double porcentagem = sc.nextDouble();
            vect[posicao].ajusteSalario(porcentagem);
        }
		
        System.out.println();
        System.out.println("Lista dos Funcionários: ");
		for (int i=0; i<n; i++) {
			System.out.println(vect[i]);
		}
		
		sc.close();
	}
}
