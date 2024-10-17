package set.pesquisa;

import java.util.Objects;

public class Tarefa {
	
	private String descricao;
	private boolean concluida;
	
	public Tarefa(String descricao, boolean concluida) {
		this.descricao = descricao;
		this.concluida = concluida;
	}

	public String getDescricao() {
		return descricao;
	}

	public boolean isConcluida() {
		return concluida;
	}
	

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

	@Override
	public String toString() {
		return "{" + descricao + "," + concluida + "}";
	}

	@Override
	public int hashCode() {
		return Objects.hash(concluida, descricao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return concluida == other.concluida && Objects.equals(descricao, other.descricao);
	}
	
}
