package prova1;

public class Avaliacao {
	private Disciplina disciplina;
	private int nota;
	private int frequencia;

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
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

public Avaliacao(Disciplina d, int nota, int frequencia) {
	this.disciplina = d;
	this.disciplina.nota = nota;
	this.disciplina.frequencia = frequencia;
}

}
