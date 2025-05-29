package prova1;

import java.util.ArrayList;

public class Aluno_Pos extends Aluno{
	
	private String TCC;
	
	public String getTCC() {
		return TCC;
	}

	public void setTCC(String tCC) {
		TCC = tCC;
	}

	boolean inscreverDisciplina(Disciplina_Pos d) {
		this.disciplinas.add(d);
		d.alunos.add(this);
		return true;
	}

	public Aluno_Pos(String nome, int cpf, int matricula, int telefone, String endereco, String email) {
		super(nome, cpf, matricula, telefone, endereco, email);
		this.disciplinas = new ArrayList<Disciplina>();
		// TODO Auto-generated constructor stub
	}

}
