package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Importando ferramentas Locale e Scanner
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// Lendo quantidade de itens que será armazenados no array
		int n = sc.nextInt();
		// Criando vetor com a quantidade de itens n
		double[] vect = new double[n];
		// Adicionando um valor na enquanto percorre o array
		for(int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for (int i=0;i<n;i++) {
			sum += vect[i];
		}
		
		double avg = sum/n;
		
		System.out.printf("AVAREGE = %.2f", avg);
		
		sc.close();
	}

}
