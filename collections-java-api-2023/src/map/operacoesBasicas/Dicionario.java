package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	
	private Map<String, String> dicionarioMap;

	public Dicionario() {
		this.dicionarioMap = new HashMap<>();
	}
	
	public void adicionarPalavra(String palavra, String definicao) {
		dicionarioMap.put(palavra, definicao);
	}
	
	public void removerPalavra(String palavra) {
		if (!dicionarioMap.isEmpty()) {
			dicionarioMap.remove(palavra);
		} else {
			System.out.println("O dicionário está vazio.");
		}
	}
	
	public void exibirPalavras() {
		System.out.println(dicionarioMap);
	}
	
	public String pesquisarPorPalavra(String palavra) {
		String pesquisaPalavra = null;
		if (!dicionarioMap.isEmpty()) {
			pesquisaPalavra = dicionarioMap.get(palavra);
			 if (pesquisaPalavra == null) {
				 System.out.println("Palavra não encontrada.");
			 }
		} else {
			System.out.println("O dicionário está vazio.");
		}
		return pesquisaPalavra;
	}
	
	public static void main(String[] args) {
		Dicionario dicionario = new Dicionario();
		
		dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
	    dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
	    dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");
	    
	    dicionario.exibirPalavras();
	    
	    System.out.println("Definição: " + dicionario.pesquisarPorPalavra("java"));
	    
	    dicionario.removerPalavra("kotlin");
	    dicionario.exibirPalavras();
	    
	    System.out.println(dicionario.pesquisarPorPalavra("kotlin"));
	    
	}

}
