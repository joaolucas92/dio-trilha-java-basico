package set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
	
	private long matricula;
	private String nome;
	private double nota;
	
	public Aluno(long matricula, String nome, double nota) {
		this.matricula = matricula;
		this.nome = nome;
		this.nota = nota;
	}

	public long getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public double getNota() {
		return nota;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return matricula == other.matricula;
	}

	@Override
	public String toString() {
		return "{" + matricula + "," + nome + "," + nota + "}";
	}

	@Override
	public int compareTo(Aluno a) {
		return nome.compareToIgnoreCase(a.getNome());
	}

}

class ComparatorPorNota implements Comparator<Aluno> {
	
	public int compare(Aluno a1, Aluno a2) {
		return Double.compare(a1.getNota(), a2.getNota());
	}
	
}
