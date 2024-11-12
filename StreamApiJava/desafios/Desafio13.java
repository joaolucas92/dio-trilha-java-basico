package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Desafio13 {
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Predicate<Integer> filtro = n -> n > 4 && n < 10;
		
		List<Integer> numerosFiltrados = numeros.stream()
											.filter(filtro)
											.collect(Collectors.toList());
		
		numerosFiltrados.forEach(System.out::println);
		
	}

}
