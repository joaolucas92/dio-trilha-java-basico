package desafios;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Desafio10 {

	public static void main(String[] args) {
		
		List<Integer> numeros = IntStream.rangeClosed(1, 50)
                .boxed()
                .collect(Collectors.toList());

		Predicate<Integer> impares = n -> n % 2 != 0;
		
		Predicate<Integer> multiplos3Ou5 = n -> n % 3 == 0 || n % 5 == 0;
		
		Consumer<Integer> mensagem = System.out::println;
		
		numeros.stream()
			.filter(impares.and(multiplos3Ou5))
			.forEach(mensagem);
	}
}
