package entidades;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
	private String nome;
	private List<Aluno> alunos;

	public Universidade(String nome) {
		this.nome = nome;
		this.alunos = new ArrayList<>();
	}

	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}

	public void listarAlunos() {
		System.out.println("Alunos da Universidade " + nome + ":");
		for (Aluno aluno : alunos) {
			System.out.println("Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula() + ", Idade: "
					+ aluno.getIdade());
		}
	}
}
