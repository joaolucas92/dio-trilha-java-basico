package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Desafio15 {
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, -1, -5, -11);

		Predicate<Integer> verificaNegativo = n -> n < 0;
		
		List<Integer> listaNegativo = numeros.stream()
											.filter(verificaNegativo)
											.collect(Collectors.toList());
		
		System.out.println(listaNegativo);
		
	}

}
