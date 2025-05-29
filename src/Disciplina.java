package prova1;

import java.util.ArrayList;

abstract class Disciplina {
	protected Professor professor;
	protected ArrayList<Aluno> alunos;
	protected String nome;
	protected int nota;
	protected int frequencia;
	
	
	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public int getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}
	

	public Disciplina(Professor professor, String nome) {
		this.professor = professor;
		professor.disciplina = this;
		alunos = new ArrayList<Aluno>();
		this.nome = nome;
	}
	
	void exibirAlunos() {
		for(Aluno i:alunos) {
			System.out.println(i.nome);
		}
	}
	
	
}
