package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	
	public static void main(String[] args) {
		
		ListaTarefas tarefas = new ListaTarefas();
		
		tarefas.exibirTarefas();
		
		tarefas.adicionarTarefa("Limpar");
		tarefas.adicionarTarefa("Varrer casa");
		tarefas.adicionarTarefa("Jogar bola");
		tarefas.adicionarTarefa("Organizar evento");
		tarefas.adicionarTarefa("Fazer compras");
		tarefas.adicionarTarefa("Sair pro bar");
		
		tarefas.exibirTarefas();
		tarefas.contarTarefas();
		
		tarefas.removerTarefa("Varrer casa");
		
		tarefas.exibirTarefas();
		
		tarefas.marcarTarefaConcluida("Limpar");
		tarefas.marcarTarefaConcluida("Jogar bola");
		tarefas.marcarTarefaConcluida("Sair pro bar");
		tarefas.marcarTarefaConcluida("Fazer compras");
		
		System.out.println(tarefas.obterTarefasConcluidas());
		System.out.println(tarefas.obterTarefasPendentes());
		
		tarefas.marcarTarefaPendente("Fazer compras");
		
		System.out.println(tarefas.obterTarefasConcluidas());
		System.out.println(tarefas.obterTarefasPendentes());
		
		tarefas.contarTarefas();
		
		tarefas.limparListaTarefas();
		tarefas.exibirTarefas();
		
	}
	
	private Set<Tarefa> tarefaSet;

	public ListaTarefas() {
		this.tarefaSet = new HashSet<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefaSet.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		Tarefa tarefaParaRemover = null;
		if(!tarefaSet.isEmpty()) {
			for (Tarefa t : tarefaSet) {
				if (t.getDescricao().equalsIgnoreCase(descricao)) {
					tarefaParaRemover = t;
					break;
				}
			}
		tarefaSet.remove(tarefaParaRemover);
		} else {
			throw new RuntimeException("O conjunto está vazio");
		}
	}
	
	public void exibirTarefas() {
		System.out.println(tarefaSet);
	}
	
	public void contarTarefas() {
		System.out.println("A lista possuí " + tarefaSet.size() + " tarefa(s)");
	}
	
	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> tarefaConcluida = new HashSet<>();
		if(!tarefaSet.isEmpty()) {
			for (Tarefa t : tarefaSet) {
				if (t.isConcluida() == true) {
					tarefaConcluida.add(t);
				}
			}
		return tarefaConcluida;
		} else {
			throw new RuntimeException("O conjunto está vazio");
		}
	}
	
	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> tarefaPendente = new HashSet<>();
		if(!tarefaSet.isEmpty()) {
			for (Tarefa t : tarefaSet) {
				if (t.isConcluida() == false) {
					tarefaPendente.add(t);
				}
			}
		return tarefaPendente;
		} else {
			throw new RuntimeException("O conjunto está vazio");
		}
	}
	
	public void marcarTarefaConcluida(String descricao) {
		Tarefa tConcluida = null;
		if (!tarefaSet.isEmpty()) {
			for (Tarefa t : tarefaSet) {
				if (t.getDescricao().equalsIgnoreCase(descricao) && t.isConcluida() == false) {
					tConcluida = t;
					tConcluida.setConcluida(true);
					break;
				}
			}
		} else {
			throw new RuntimeException("O conjunto está vazio");
		}
	}
	
	public void marcarTarefaPendente(String descricao) {
		Tarefa tPendente = null;
		if (!tarefaSet.isEmpty()) {
			for (Tarefa t : tarefaSet) {
				if (t.getDescricao().equalsIgnoreCase(descricao) && t.isConcluida() == true) {
					tPendente = t;
					tPendente.setConcluida(false);
					break;
				}
			}
		} else {
			throw new RuntimeException("O conjunto está vazio");
		}
	}
	
	public void limparListaTarefas() {
		Set<Tarefa> apagarTarefas = new HashSet<>();
		if(!tarefaSet.isEmpty()) {
			for (Tarefa t : tarefaSet) {
				apagarTarefas.add(t);
			}
		tarefaSet.removeAll(apagarTarefas);
		} else {
			throw new RuntimeException("O conjunto está vazio");
		}
	}
	
}
