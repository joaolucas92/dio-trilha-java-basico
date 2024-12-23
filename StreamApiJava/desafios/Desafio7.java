package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio7 {
	
	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Optional<Integer> numerosOrdenados = numeros.stream()
												.distinct()
												.sorted(Comparator.reverseOrder())
												.skip(1)
												.findFirst();
		
		System.out.println("Segundo maior número da lista: " + numerosOrdenados.orElse(null));

	}

}
