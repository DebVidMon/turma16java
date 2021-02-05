package heranca;

public class Classe2 extends ClasseGeral{

	//Calça
	private String bainha;
	private boolean bolso;
	private boolean ziper;
	
	public Classe2(String tecido,String bainha,boolean bolso,boolean ziper, String marca, String cor) {
		super(tecido, marca, cor);
		
		this.bainha=bainha;
		this.bolso=bolso;
		this.ziper=ziper;
	}

	public String getBainha() {
		return bainha;
	}

	public void setBainha(String bainha) {
		this.bainha = bainha;
	}

	public boolean getBolso() {
		return bolso;
	}

	public void setBolso(boolean bolso) {
		this.bolso = bolso;
	}

	public boolean isZiper() {
		return ziper;
	}

	public void setZiper(boolean ziper) {
		this.ziper = ziper;
	}	
	
	
}

