package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Desafio6 {
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Predicate<Integer> maiorQueDez = n -> n > 10;
		
		Consumer<Integer> maiores = n -> System.out.println(n);
		
		Runnable mensagemElse = () -> System.out.println("Não há números maiores que 10.");
		
		if (numeros.stream().anyMatch(maiorQueDez)) {
			numeros.stream()
			.filter(maiorQueDez)
			.forEach(maiores);
		} else {
			mensagemElse.run();
		}
		
	}

}
