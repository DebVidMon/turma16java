
public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void emitirSom() {
		System.out.println(super.nome +" est� relinchando");
		
	}

	@Override
	public void movimentar() {
		System.out.println(super.nome +" disparou correndo");
	}
}
