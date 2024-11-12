package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Desafio14 {
	
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
		
		Consumer<Integer> mensagem = (System.out::println);
		
		Optional<Integer> maiorPrimo = numeros.stream()
										.filter(primos)
										.max(Integer::compare);
		
		maiorPrimo.ifPresent(mensagem);
		
	}

}
