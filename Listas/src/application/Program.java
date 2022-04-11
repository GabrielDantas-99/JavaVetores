package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		// Declarando uma Lista de Strings
		List<String> list = new ArrayList<>();
		
		// Adicionando itens � lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("Gabriel");
		list.add("Emerson");
		list.add(2, "Marco");
		// Printando valores
		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		// Removendo atrav�s do valor
		list.remove("Anna");
		// Removendo atrav�s do index
		list.remove(0);
		// Removendo Strings que come�am com M atrav�s de predicado(fun��o Lambda)
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		// Encontrando posi��o de um elemento
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		// Encontrando posi��o de um elemento que n�o est� na lista
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("---------------------");
		// Filtrando pessoas que come�am com a letra A
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		// Encontrando o primeiro elemento que come�a com a letra J
		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}
}