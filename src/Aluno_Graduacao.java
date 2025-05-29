package prova1;

import java.util.ArrayList;

public class Aluno_Graduacao extends Aluno{
	
	private String projetoIntegrador;
	
	public String getProjetoIntegrador() {
		return projetoIntegrador;
	}

	public void setProjetoIntegrador(String projetoIntegrador) {
		this.projetoIntegrador = projetoIntegrador;
	}

	boolean inscreverDisciplina(Disciplina_Graduacao d) {
		this.disciplinas.add(d);
		d.alunos.add(this);
		return true;
	}
	
	public Aluno_Graduacao(String nome, int cpf, int matricula, int telefone, String endereco, String email) {
		super(nome, cpf, matricula, telefone, endereco, email);
		this.disciplinas = new ArrayList<Disciplina>();
	}

	
	
}
