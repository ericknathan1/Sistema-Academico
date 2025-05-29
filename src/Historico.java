package prova1;

import java.util.ArrayList;

public class Historico {
	private String nome;
	private ArrayList<Disciplina> disciplinas;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Historico(String nome, ArrayList<Disciplina> disciplinas) {
		this.nome = nome;
		this.disciplinas = disciplinas;
	}
	
	
	void exibirHistorico(){
		System.out.println("Nome do Aluno: "+this.nome);
		for(Disciplina i:disciplinas) {
			System.out.println("Displina ("+i.nome+"): "+i.nota+" | frequência: "+i.frequencia+"%");
		}
	}
}
