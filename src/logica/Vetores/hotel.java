package logica.Vetores;

import java.util.Scanner;

public class hotel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		enthotel[] vect = new enthotel[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			sc.nextLine();
			System.out.println("Rent #" + i);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new enthotel(name, email);
			System.out.println();
		}
		
		for (int i=0; i<10; i++) {
			if (vect[i] != null)
				System.out.println(i + ": " + vect[i]);
		}		
		
		sc.close();
	}

}
