
public class Vendedor extends Pessoa{
	/*6. Implemente a classe Vendedor como subclasse da classe Pessoa.
	 * Um determinado vendedor tem como atributos da classe Pessoa e tamb�m os atributos pr�prios como 
	 * valorVendas (correspondente ao valor monet�rio dos artigos vendidos) 
	 * e o atributo comissao (porcentagem do valorVendas que ser� adicionado ao vencimento base do Vendedor).
	 */
	public double valorVendas;
	

	public Vendedor(String nome, double valorVendas) {
		super(nome);
		this.valorVendas = valorVendas;
	}
	
	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double comissao() {
		return (valorVendas*0.1);
	}
}
