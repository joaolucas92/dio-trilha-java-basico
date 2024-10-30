package map.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class LivrariaOnline {
	
	private Map<String, Livro> livrariaMap;

	public LivrariaOnline() {
		this.livrariaMap = new HashMap<>();
	}
	
	public void adicionarLivro(String link, Livro livro) {
		livrariaMap.put(link, livro);
	}
	
	public void removerLivro(String titulo) {
		List<String> livroParaRemover = new ArrayList<>();
		for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
			if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
				livroParaRemover.add(entry.getKey());
			}
		}
		for (String livro : livroParaRemover) {
			livrariaMap.remove(livro);
		}
	}
	
	public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
		List<Map.Entry<String, Livro>> livrosParaOrdenar = new ArrayList<>(livrariaMap.entrySet());
		Collections.sort(livrosParaOrdenar, new ComparatorPorPreco());
		Map<String, Livro> livrosOrdenados = new LinkedHashMap<>();
		for (Map.Entry<String, Livro> entry : livrosParaOrdenar) {
			livrosOrdenados.put(entry.getKey(), entry.getValue());
		}
		return livrosOrdenados;
	}
	
	public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
		List<Map.Entry<String, Livro>> livrosParaOrdenar = new ArrayList<>(livrariaMap.entrySet());
		Collections.sort(livrosParaOrdenar, new ComparatorPorAutor());
		Map<String, Livro> livrosOrdenados = new LinkedHashMap<>();
		for (Map.Entry<String, Livro> entry : livrosParaOrdenar) {
			livrosOrdenados.put(entry.getKey(), entry.getValue());
		}
		return livrosOrdenados;
	}
	
	public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
		Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
		for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
			Livro livro = entry.getValue();
			if (livro.getAutor().equals(autor)) {
				livrosPorAutor.put(entry.getKey(), livro);
			}
		}
		return livrosPorAutor;
	}
	
	public List<Livro> obterLivroMaisCaro() {
		List<Livro> livrosMaisCaros = new ArrayList<>();
		double precoMaisCaro = Double.MIN_VALUE;
		
		if (!livrariaMap.isEmpty()) {
			for (Livro livro : livrariaMap.values()) {
				if (livro.getPreco() > precoMaisCaro) {
					precoMaisCaro = livro.getPreco();
				}
			}
		} else {
			throw new NoSuchElementException("Livraria está vazia.");
		}
		
		for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
			if (entry.getValue().getPreco() == precoMaisCaro) {
				Livro livroMaisCaro = livrariaMap.get(entry.getKey());
				livrosMaisCaros.add(livroMaisCaro);
			}
		}
		return livrosMaisCaros;
	}
	
	public List<Livro> obterLivroMaisBarato() {
		List<Livro> livrosMaisBaratos = new ArrayList<>();
		double precoMaisBarato = Double.MAX_VALUE;
		
		if (!livrariaMap.isEmpty()) {
			for (Livro livro : livrariaMap.values()) {
				if (livro.getPreco() < precoMaisBarato) {
					precoMaisBarato = livro.getPreco();
				}
			}
		} else {
			throw new NoSuchElementException("Livraria está vazia.");
		}
		
		for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
			if (entry.getValue().getPreco() == precoMaisBarato) {
				Livro livroMaisBarato = livrariaMap.get(entry.getKey());
				livrosMaisBaratos.add(livroMaisBarato);
			}
		}
		return livrosMaisBaratos;
	}
	
	public static void main(String[] args) {
		
		LivrariaOnline livraria = new LivrariaOnline();
		
		livraria.adicionarLivro("https://encurtador.com.br/Wd9l2", new Livro("Harry Potter e a Pedra Filosofal","J.K. Rowling",37.14));
		livraria.adicionarLivro("https://encurtador.com.br/kutwa", new Livro("Harry Potter e o Cálice de Fogo", "J.K. Rowling",61.94));
		livraria.adicionarLivro("https://encurtador.com.br/ttdds", new Livro("Sherlock Holmes - O Cão dos Baskerville", "Arthur Conan Doyle",22.81));
		livraria.adicionarLivro("https://encurtador.com.br/hpyDD", new Livro("Memórias de Sherlock Holmes", "Arthur Conan Doyle",11.90));
		livraria.adicionarLivro("https://encurtador.com.br/hpyDE", new Livro("Mitologia Nórdica", "Neil Gaiman",52.26));
		livraria.adicionarLivro("https://encurtador.com.br/hpyDW", new Livro("O investidor inteligente", "Benjamin Graham",61.94));
		
		System.out.println("Livros ordenados por preço: " + livraria.exibirLivrosOrdenadosPorPreco());
		System.out.println("Livros ordenados por autor: " + livraria.exibirLivrosOrdenadosPorAutor());
		
		System.out.println("Livro(s) mais caro(s): " + livraria.obterLivroMaisCaro());
		System.out.println("Livro(s) mais barato(s): " + livraria.obterLivroMaisBarato());
		
		System.out.println("Pesquisa: " + livraria.pesquisarLivrosPorAutor("J.K. Rowling"));
		
		livraria.removerLivro("Harry Potter e a Pedra Filosofal");
		
		System.out.println("Livros ordenados por preço: " + livraria.exibirLivrosOrdenadosPorPreco());
		System.out.println("Livros ordenados por autor: " + livraria.exibirLivrosOrdenadosPorAutor());
	}

}
