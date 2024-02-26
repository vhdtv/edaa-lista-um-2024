package programas;

import entidades.Aluno;
import entidades.Cachorro;
import entidades.Disciplina;
import entidades.Livro;
import entidades.Pessoa;
import entidades.Professor;
import entidades.Universidade;

public class MainMenu {
	public static void main(String[] args) {
		// Parte 1: Livro e Pessoa
		Livro livro = new Livro("Dom Quixote", "Miguel de Cervantes", 1605, 29.90);
		System.out.println("\nLivro:");
		System.out.println("Título: " + livro.getTitulo());
		System.out.println("Autor: " + livro.getAutor());
		System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());
		System.out.println("Preço: R$" + livro.getPreco());
		Pessoa pessoa = new Pessoa("João", 30, "Rua Principal, 123");
		System.out.println("\nPessoa:");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Idade: " + pessoa.getIdade());
		System.out.println("Endereço: " + pessoa.getEndereco());

		// Parte 2: Universidade, Aluno e Professor
		Universidade universidade = new Universidade("Universidade XYZ");
		Aluno aluno1 = new Aluno("João", 12345, 20);
		Aluno aluno2 = new Aluno("Maria", 54321, 22);
		universidade.adicionarAluno(aluno1);
		universidade.adicionarAluno(aluno2);
		universidade.listarAlunos();
		Professor professor = new Professor("Dr. Silva", "Matemática");
		Disciplina disciplina = new Disciplina("Cálculo I", professor);
		System.out.println("\nDisciplina:");
		System.out.println("Nome: " + disciplina.getNome());
		System.out.println("Professor Responsável: " + disciplina.getProfessorResponsavel().getNome());
		System.out.println("Disciplina ministrada por: " + disciplina.getProfessorResponsavel().getDisciplina());

		// Parte 3: Cachorro
		Cachorro cachorro = new Cachorro(1, "Doméstico", "Terrestre", "Rex", "Labrador", 3);
		System.out.println("Cachorro:");
		System.out.println("Nome: " + cachorro.getNome());
		System.out.println("Raça: " + cachorro.getRaca());
		System.out.println("Idade: " + cachorro.getIdade());
		System.out.println("Tipo: " + cachorro.getTipo());
		System.out.println("Habitat: " + cachorro.getHabitat());
	}
}
