package prova1;

public class Disciplina_Pos extends Disciplina{
	
	private int modulo;
	
	
	
	public int getModulo() {
		return modulo;
	}



	public void setModulo(int modulo) {
		this.modulo = modulo;
	}



	public Disciplina_Pos(Professor professor, String nome) {
		super(professor, nome);
		modulo = 6;
		// TODO Auto-generated constructor stub
	}
	
}
