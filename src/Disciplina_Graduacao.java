package prova1;

public class Disciplina_Graduacao extends Disciplina{
	private int semestres;
	
	public int getSemestres() {
		return semestres;
	}

	public void setSemestres(int semestres) {
		this.semestres = semestres;
	}

	public Disciplina_Graduacao(Professor professor, String nome) {
		super(professor,nome);
		semestres = 6;
	}
}
