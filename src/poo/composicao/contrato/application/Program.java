package poo.composicao.contrato.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import poo.composicao.contrato.entities.Departamento;
import poo.composicao.contrato.entities.HoraContrato;
import poo.composicao.contrato.entities.Trabalhador;
import poo.composicao.contrato.entities.enums.NivelTrabalhador;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o nome do departamento: ");
		String departmentName = sc.nextLine();
		System.out.println("Entre com os dados do trabalhador");
		System.out.print("Nome: ");
		String workerName = sc.nextLine();
		System.out.print("Senioridade: ");
		String workerLevel = sc.nextLine();		
		System.out.print("Salario Base: ");
		double baseSalary = sc.nextDouble();
		
		Trabalhador worker = new Trabalhador(workerName, NivelTrabalhador.valueOf(workerLevel), baseSalary, new Departamento(departmentName));
		
		System.out.print("Quantos contratos esse colaborador terá? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Entre com os dados do contrato #" + i);
			System.out.print("Data (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duração (hora): ");
			int hours = sc.nextInt();
			HoraContrato contract = new HoraContrato(contractDate, valuePerHour, hours);
			worker.addContract(contract);
			}
		
		System.out.println();
		System.out.print("Entre com mês e ano para calcular o salario (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Departamento: " + worker.getDepartamento().getName());
		System.out.println("Renda para " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	}

}
