
public class Administrador extends Pessoa{
	/* 4. Implemente a classe Administrador como subclasse da classe pessoa. 
	 * Um determinado administrador tem como atributos da classe Pessoa e 
	 * também os atributos próprios como ajudaDeCusto (ajudas referentes a viagens, estadias).*/
	
	private double ajudaDeCusto;

	public Administrador(String nome,double ajudaDeCusto) {
		super(nome);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
}
