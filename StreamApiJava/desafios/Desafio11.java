package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Desafio11 {
	
	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 13, 21);

		Function<Integer, Integer> quadrados = n -> n * n;
		
		BinaryOperator<Integer> soma = (n1, n2) -> n1 + n2;
				
		Optional<Integer> resultado = numeros.stream()
										.map(quadrados) 
										.reduce(soma);
		
		resultado.ifPresent(System.out::println);
	}

}
