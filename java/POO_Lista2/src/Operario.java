
public class Operario extends Pessoa{
	/*5. Implemente a classe Operario como subclasse da classe Pessoa. 
	 * Um determinado operário tem como atributos da classe Pessoa e também os atributos próprios como
	 * valorProducao (que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário) e
	 * comissao (que corresponde à porcentagem do valorProducao que será adicionado ao vencimento base do operário). 
	 */
	
	private double valorProducao;
	
	public Operario(String nome, double valorProducao) {
		super(nome);
		this.valorProducao = valorProducao;
	}
	
	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double comissao() {
		return valorProducao * 0.05;
	}
}
