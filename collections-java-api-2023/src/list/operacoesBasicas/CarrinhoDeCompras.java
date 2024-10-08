package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.exibirItens();
		
		carrinho.adicionarItem("PS5", 3500.00, 1);
		carrinho.adicionarItem("Óculos", 300.00, 2);
		carrinho.adicionarItem("Cerveja", 32.50, 1);
		carrinho.adicionarItem("Camisa", 100.00, 3);
		carrinho.adicionarItem("JBL", 959.90, 1);
		
		carrinho.exibirItens();
		
		System.out.println("O valor total do carrinho é de: " + carrinho.calcularValorTotal());
		
		carrinho.removerItem("Cerveja");
		carrinho.removerItem("JBL");
		
		carrinho.exibirItens();
		System.out.println("O valor total do carrinho é de: " + carrinho.calcularValorTotal());
	}
	
	private List<Item> itemList;
	
	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		itemList.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> itemParaRemover = new ArrayList<>();
		for (Item i : itemList) {
			if (i.getNome().equalsIgnoreCase(nome)) {
				itemParaRemover.add(i);
			}
		}
		itemList.removeAll(itemParaRemover);
	}
	
	public double calcularValorTotal() {
		double soma = 0.0;
		for (Item i : itemList) {
			soma += i.getPreco() * i.getQuantidade();
		}
		return soma;
	}
	
	public void exibirItens() {
		System.out.println(itemList);
	}

}
