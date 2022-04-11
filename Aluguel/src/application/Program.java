package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BusyRooms;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		BusyRooms[] vect = new BusyRooms[10];
		
		System.out.print("How many rooms will be rented? ");
		int rooms = sc.nextInt();
		
		for (int i=0; i<rooms; i++) {
			System.out.printf("Rent #%d%n", i+1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new BusyRooms(name, email);
		}
		
		System.out.println("Busy rooms:");
		for (int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}

}
