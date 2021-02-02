package objetos;

public class Cliente {
	public String nome;
	public int idade;
	public char clienteAntigo;
	
	public String frase() {
		if (clienteAntigo=='S') {
			return("Bem vindo de volta! Repetir último pedido?");
		} else {
			return("Seja bem vindo! Aqui estão nossos produtos:");
		}
	}
	
	public String produto() {
		if (idade<18) {
			return("\tLista de Produtos:\nChocolate em barra\nBombom\nTrufa\nCastanha de caju banhada");
		} else {
			return("\tLista de Produtos:\nChocolate em barra\nBombom\nTrufa\nCastanha de caju banhada\nLicor de chocolate\nBombom de licor de cereja");
		}
	}

}
