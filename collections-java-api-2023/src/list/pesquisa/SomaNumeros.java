package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	
	public static void main(String[] args) {
		SomaNumeros somanumeros = new SomaNumeros();
		
		somanumeros.adicionarNumero(1);
		somanumeros.adicionarNumero(2);
		somanumeros.adicionarNumero(4);
		somanumeros.adicionarNumero(5);
		somanumeros.adicionarNumero(12);
		somanumeros.adicionarNumero(54);
		somanumeros.adicionarNumero(14);
		somanumeros.adicionarNumero(9);
		somanumeros.adicionarNumero(10);
		
		System.out.println(somanumeros.calcularSoma());
		System.out.println(somanumeros.encontrarMaiorNumero());
		System.out.println(somanumeros.encontrarMenorNumero());
		System.out.println(somanumeros.exibirNumeros());
	}
	
	private List<Integer> numeros;

	public SomaNumeros() {
		this.numeros = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		numeros.add(numero);
	}
	
	public int calcularSoma() {
		int soma = 0;
		for (int n : numeros) {
			soma += n;
		}
		return soma;
	}
	
	public int encontrarMaiorNumero() {
		int maior = Integer.MIN_VALUE;
		if (!numeros.isEmpty()) {
			for (int n : numeros) {
				if (n > maior) {
					maior = n;
				}
			}
		}
		return maior;
	}
	
	public int encontrarMenorNumero() {
		int menor = Integer.MAX_VALUE;
		if (!numeros.isEmpty()) {
			for (int n : numeros) {
				if (n < menor) {
					menor = n;
				}
			}
		}
		return menor;
	}
	
	public List<Integer> exibirNumeros() {
		return numeros;
	}

}
