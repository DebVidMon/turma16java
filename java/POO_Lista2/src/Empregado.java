
public class Empregado extends Pessoa{
/*3. Considere, como subclasse da classe Pessoa, a classe Empregado. 
 * Considere que cada instância da classe Empregado tem, para além dos atributos que caracterizam a classe Pessoa,
 *  os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem retida dos impostos). 
 *  Implemente a classe Empregado com métodos seletores e modificadores e um método calcularSalario.
 *   Escreva um programa de teste adequado para a classe Empregado. 
 */
	private int codigoSetor;
	private double salarioBase;
	private double imposto = 0.02;
	
	public Empregado(String nome, int codigoSetor, double salarioBase) {
		super(nome);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
	}
	
	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double calcularSalario() {
		double impostoS = imposto*salarioBase;
		return salarioBase-impostoS;
	}
	
}
