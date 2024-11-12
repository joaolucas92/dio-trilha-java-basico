package desafios;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Desafio9 {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		Set<Integer> conjUnico = new HashSet<>();
		
		Predicate<Integer> numComparados = conjUnico::add;
		
		Consumer<Boolean> mensagem = resultado -> {
			if (resultado) {
				System.out.println("Não há números repetidos na lista.");
			} else {
				System.out.println("Há números repetidos na lista.");
			}
		};

		boolean todosDistintos = numeros.stream()
									.allMatch(numComparados);
		mensagem.accept(todosDistintos);
		
	}
}
