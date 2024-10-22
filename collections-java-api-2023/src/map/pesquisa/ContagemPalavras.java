package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
	
	private Map<String, Integer> contagemPalavrasMap;

	public ContagemPalavras() {
		this.contagemPalavrasMap = new HashMap<>();
	}
	
	public void adicionarPalavra(String palavra, Integer contagem) {
		contagemPalavrasMap.put(palavra, contagem);
	}
	
	public void removerPalavra(String palavra) {
		if (!contagemPalavrasMap.isEmpty()) {
			contagemPalavrasMap.remove(palavra);
		} else {
			System.out.println("Palavra não encontrada");
		}
	}
	
	public int exibirContagemPalavras() {
	    int contagemTotal = 0;
	    for (int contagem : contagemPalavrasMap.values()) {
	      contagemTotal += contagem;
	    }
	    return contagemTotal;
	  }
	
	public String encontrarPalavrasMaisFrequente() {
	    String palavraMaisFrequente = null;
	    int maiorContagem = 0;
	    for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
	      if (entry.getValue() > maiorContagem) {
	        maiorContagem = entry.getValue();
	        palavraMaisFrequente = entry.getKey();
	      }
	    }
	    return palavraMaisFrequente;
	  }
	
	public static void main(String[] args) {
		
		ContagemPalavras palavrasMap = new ContagemPalavras();
		
		System.out.println(palavrasMap.exibirContagemPalavras());
		
		palavrasMap.adicionarPalavra("Java", 3);
		palavrasMap.adicionarPalavra("C#", 2);
		palavrasMap.adicionarPalavra("Kotlin", 6);
		palavrasMap.adicionarPalavra("HTML", 10);
		palavrasMap.adicionarPalavra("JavaScript", 5);
		palavrasMap.adicionarPalavra("CSS", 4);
		
		System.out.println(palavrasMap.exibirContagemPalavras());
		
		palavrasMap.removerPalavra("JavaScript");
		
		System.out.println(palavrasMap.exibirContagemPalavras());
		
		System.out.println(palavrasMap.encontrarPalavrasMaisFrequente());
		
	}

}
