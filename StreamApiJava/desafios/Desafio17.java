package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Desafio17 {
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 19);

		Predicate<Integer> primos = n -> {
			if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
		};
		
		
		List<Integer> listaPrimos = numeros.stream()
										.filter(primos)
										.collect(Collectors.toList());
		
		System.out.println("Numeros primos na lista: " + listaPrimos);
		
	}

}
