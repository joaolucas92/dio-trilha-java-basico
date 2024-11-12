package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Desafio18 {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);

		Predicate<Integer> iguais = n -> n.equals(numeros.get(0));
		Consumer<String> mensagem = System.out::println;
		
		boolean verificaIguais = numeros.stream()
										.allMatch(iguais);
		
		if (verificaIguais) {
			mensagem.accept("Todos números são iguais.");
		} else {
			mensagem.accept("Há números diferentes na lista.");
		}
	}
}
