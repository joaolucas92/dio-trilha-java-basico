package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Desafio8 {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 13, 21);

		BinaryOperator<Integer> soma = (n1, n2) -> n1 + n2;

		Optional<Integer> somaDigitos = numeros.stream()
											.flatMapToInt(num -> String.valueOf(num).chars())
											.map(c -> c - '0')
											.boxed()
											.reduce(soma);

		somaDigitos.ifPresent(resultado -> System.out.println("A soma dos dígitos é: " + resultado));

	}
}
