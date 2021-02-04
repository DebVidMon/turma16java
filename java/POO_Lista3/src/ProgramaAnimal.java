
public class ProgramaAnimal {
	public static void main(String[] args) {
		Cachorro toto = new Cachorro("Totó",7);
		Cavalo selv = new Cavalo("Selvagem",5);
		Preguica madu = new Preguica ("Maria Eduarda",10);
		
		madu.movimentar();
		toto.emitirSom();
		selv.emitirSom();
		madu.emitirSom();
		selv.movimentar();
		toto.movimentar();
		
	}

}
