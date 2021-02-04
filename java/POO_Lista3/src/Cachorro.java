
public class Cachorro extends Animal{

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void emitirSom() {
		System.out.println(super.nome +" está latindo");
	}

	@Override
	public void movimentar() {
		System.out.println(super.nome +" disparou correndo");
	}
}
