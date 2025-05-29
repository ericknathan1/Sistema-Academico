package prova1;

import java.util.ArrayList;

abstract class Aluno {
	
	protected String nome;
	protected int cpf;
	protected int matricula;
	protected int telefone;
	protected String endereco;
	protected String email;
	protected ArrayList<Disciplina> disciplinas;
	protected Boleto b;
	protected Historico h;
	
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



	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}



	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}



	public Boleto getBoleto() {
		return b;
	}



	public void setBoleto(Boleto b) {
		this.b = b;
	}



	public Historico getHistorico() {
		return h;
	}



	public void setHistorico(Historico h) {
		this.h = h;
	}


	public Aluno(String nome, int cpf, int matricula, int telefone, String endereco, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
		this.disciplinas = new ArrayList<Disciplina>();
		b = new Boleto(this.nome,580.00);
		h = new Historico(this.nome, this.disciplinas);
	}

	
}
