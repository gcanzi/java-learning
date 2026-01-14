package poo.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Funcionarios {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos funcionarios serão registrados? ");
		int n = sc.nextInt();
		System.out.println();

		List<Funcionario> list = new ArrayList<>();

		for (int i=0; i<n; i++) {

			System.out.println("Funcionario #" + (i + 1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			while (hasId(list, id)) {
				System.out.println("Id já existe! Tente novamente: ");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Salario: ");
			double salary = sc.nextDouble();
			System.out.println();

			Funcionario func = new Funcionario(id, name, salary);

			list.add(func);
		}

		System.out.print("Qual é o id do funcionario que terá o aumento? ");
		int idSalary = sc.nextInt();
		
		Integer pos = position(list, idSalary);
		
		if (pos == null) {
			System.out.println("Esse id não existe!");
		}
		else {
			System.out.print("Qual porcentagem: ");
			double percentage = sc.nextDouble();
			list.get(pos).increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("Lista de Funcionarios:");
		for (Funcionario f : list) {
			System.out.println(f);
		}

		sc.close();
	}
	
	public static Integer position(List<Funcionario> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
	}
}
