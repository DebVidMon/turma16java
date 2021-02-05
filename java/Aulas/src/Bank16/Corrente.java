package Bank16;

public class Corrente extends Conta{
	private int qtMesTalao =3;

	public Corrente(String numero, String cpf, int qtMesTalao) {
		super(numero, cpf);
		this.qtMesTalao = qtMesTalao;
	}

	public int getQtMesTalao() {
		return qtMesTalao;
	}

	public void emitirTal�o() {
		if(qtMesTalao>1){
			System.out.println("Imprimindo Tal�o...");
			qtMesTalao--;
		} else {
			System.out.println("Atingiu o limite de tal�es");
		}
		
	}
	
	

}
