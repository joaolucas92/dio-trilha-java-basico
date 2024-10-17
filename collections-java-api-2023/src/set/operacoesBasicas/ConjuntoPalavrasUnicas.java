package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	
	public static void main(String[] args) {
		ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();
		
		System.out.println("Exibindo palavra(s): ");
		conjuntoPalavras.exibirPalavrasUnicas();
		
		conjuntoPalavras.adicionarPalavra("Corinthians");
		conjuntoPalavras.adicionarPalavra("Java");
		conjuntoPalavras.adicionarPalavra("Java");
		conjuntoPalavras.adicionarPalavra("Comida");
		conjuntoPalavras.adicionarPalavra("Cerveja");
		
		System.out.println(conjuntoPalavras.verificarPalavra("Corinthians"));
		System.out.println(conjuntoPalavras.verificarPalavra("Java"));
		
		System.out.println("Exibindo palavra(s): ");
		conjuntoPalavras.exibirPalavrasUnicas();
		
		conjuntoPalavras.removerPalavra("Comida");
		
		System.out.println("Exibindo palavra(s): ");
		conjuntoPalavras.exibirPalavrasUnicas();
	}
	
	private Set<String> palavraUnicaSet;
	
	public ConjuntoPalavrasUnicas() {
		this.palavraUnicaSet = new HashSet<>();
	}

	public void adicionarPalavra(String palavraUnica) {
		palavraUnicaSet.add(palavraUnica);
	}
	
	public void removerPalavra(String palavraUnica) {
		if (!palavraUnicaSet.isEmpty()) {
			if (palavraUnicaSet.contains(palavraUnica)) {
				palavraUnicaSet.remove(palavraUnica);
			} else {
				System.out.println("Palavra não encontrada!");
			}
		} else {
			System.out.println("O bloco de palavras está vazio!");
		}
	}
	
	public String verificarPalavra(String palavraUnica) {
		String palavraVerificada = null;
		if (!palavraUnicaSet.isEmpty()) {
			if (palavraUnicaSet.contains(palavraUnica)) {
				palavraVerificada = palavraUnica;
			} else {
				System.out.println("Palavra não encontrada!");
			}
		} else {
			System.out.println("O bloco de palavras está vazio!");
		}
		return palavraVerificada;
	}
	
	public void exibirPalavrasUnicas() {
		if (!palavraUnicaSet.isEmpty()) {
			System.out.println(palavraUnicaSet);
		} else {
			System.out.println("Bloco de Palavra está vazio");
		}
	}

}
