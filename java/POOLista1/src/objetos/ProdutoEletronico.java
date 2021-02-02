package objetos;

public class ProdutoEletronico {
	
	private String nomeProduto;
	private String corProduto;
	private double precoProduto;
	
	public ProdutoEletronico (String nome, String cor, double preco)
	{
		nomeProduto=nome;
		corProduto = cor;
		precoProduto = preco;
	}
	
	public String caracteristicas() {
		String caracteristicas = (nomeProduto+"\t"+corProduto+"\tR$ "+precoProduto);
		return caracteristicas;
	}
}
