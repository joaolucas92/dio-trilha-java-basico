package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Desafio19 {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		BinaryOperator<Integer> soma = (n1, n2) -> n1 + n2;
		Predicate<Integer> divisivel3Ou5 = n -> n % 3 == 0 || n % 5 == 0;
		//Predicate<Integer> divisivel5 = n -> n % 5 == 0;
		Consumer<Integer> exibirSoma = n -> System.out.println("A soma dos divisiveis de 3 e 5 é: " + n);
		
		Optional<Integer> resultado =  numeros.stream()
										.filter(divisivel3Ou5)
										.reduce(soma);

		resultado.ifPresent(exibirSoma);
		
	}
}
