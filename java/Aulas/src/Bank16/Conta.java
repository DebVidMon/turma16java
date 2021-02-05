package Bank16;

public class Conta {//abstract
	
	protected String numero;
	protected String cpf;
	protected double saldo;
	public double valor;
	
	public Conta(String numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
	}
	
	public String getNumero() {
		return numero;
	}

	public String getCpf() {
		return cpf;
	}

	public double getSaldo() {
		return saldo;
	}


	public void debitar(double valor) {
		if(saldo-valor>=0) {
		System.out.println("R$"+(saldo - valor));
		saldo-=valor;
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void creditar(double valor) {
		System.out.println("R$"+(saldo + valor));
		saldo+=valor;
	}

}
