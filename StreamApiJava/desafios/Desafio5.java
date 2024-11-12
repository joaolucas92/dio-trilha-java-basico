package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;

public class Desafio5 {
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Predicate<Integer> maiorQueCinco = n -> n > 5;
		
		OptionalDouble media = numeros.stream()
									.filter(maiorQueCinco)
									.mapToInt(Integer::intValue)
									.average();
		if (media.isPresent()) {
			System.out.println("A média dos números maiores que 5 é: " + media.getAsDouble());
		} else {
			System.out.println("Não foram encontrados números maiores que 5 na lista!");
		}
		
	}

}
