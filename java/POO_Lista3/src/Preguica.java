
public class Preguica extends Animal{

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void emitirSom() {
		System.out.println(super.nome +" est� balindo");
		
	}

	@Override
	public void movimentar() {
		System.out.println(super.nome + " subiu na �rvore");
		
	}

}
