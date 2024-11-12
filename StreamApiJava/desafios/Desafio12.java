package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Desafio12 {
	
	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		BinaryOperator<Integer> multiplicador = (n1, n2) -> n1 * n2;
				
		Optional<Integer> resultado = numeros.stream()
							.reduce(multiplicador);
		
		System.out.println("O produto dos números da lista é: " + resultado.get());
	}

}
