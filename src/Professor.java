package prova1;

import java.util.ArrayList;

public class Professor {
	
	protected String nome;
	protected int cpf;
	protected int matricula;
	protected int telefone;
	protected String endereco;
	protected String email;
	protected Disciplina disciplina;
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Disciplina getDisciplina() {
		return disciplina;
	}


	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}


	public Professor(String nome, int cpf, int matricula, int telefone, String endereco, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
	}
	
	
	boolean avaliar(Disciplina d, int nota, int frequencia) {
		if (d == this.disciplina) {
			Avaliacao av = new Avaliacao(d, nota, frequencia);
		}else {
			System.out.println("O professor não possui essa disciplina");
		}
		return true;
	}
	
	
}
