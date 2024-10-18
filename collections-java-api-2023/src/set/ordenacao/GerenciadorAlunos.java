package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
	
	private Set<Aluno> alunoSet;

	public GerenciadorAlunos() {
		this.alunoSet = new HashSet<>();
	}
	
	public void adicionarAluno(Long matricula, String nome, double nota) {
		alunoSet.add(new Aluno(matricula, nome, nota));
	}
	
	public void removerAluno(long matricula) {
		Aluno alunoParaRemover = null;
		if (!alunoSet.isEmpty()) {
			for (Aluno a : alunoSet) {
				if (a.getMatricula() == matricula) {
					alunoParaRemover = a;
					break;
				}
			}
			alunoSet.remove(alunoParaRemover);
		} else {
			throw new RuntimeException("O conjunto está vazio.");
		}
		if (alunoParaRemover == null) {
			System.out.println("Matrícula não encontrada.");
		}
	}
	
	public Set<Aluno> exibirAlunosPorNome() {
		Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
		if (!alunoSet.isEmpty()) {
			return alunoPorNome;
		} else {
			throw new RuntimeException("O conjunto está vazio.");
		}
	}
	
	public Set<Aluno> exibirAlunoPorNota() {
		Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
		if (!alunoSet.isEmpty()) {
			alunoPorNota.addAll(alunoSet);
			return alunoPorNota;
		} else {
			throw new RuntimeException("O conjunto está vazio.");
		}
	}
	
	public void exibirAlunos() {
		System.out.println(alunoSet);
	}
	
	public static void main(String[] args) {
		
		GerenciadorAlunos alunos = new GerenciadorAlunos();
		
		alunos.adicionarAluno(1111L, "João Lucas", 100.0);
		alunos.adicionarAluno(1111L, "Maria", 55.0);
		alunos.adicionarAluno(2222L, "Ana Maria", 76.5);
		alunos.adicionarAluno(3333L, "Rafael", 65.9);
		alunos.adicionarAluno(4444L, "Marcela", 45.95);
		
		alunos.exibirAlunos();
		System.out.println(alunos.exibirAlunosPorNome());
		System.out.println(alunos.exibirAlunoPorNota());
		
		alunos.removerAluno(3333L);
		
		alunos.exibirAlunos();
		System.out.println(alunos.exibirAlunosPorNome());
		System.out.println(alunos.exibirAlunoPorNota());
	}

}
