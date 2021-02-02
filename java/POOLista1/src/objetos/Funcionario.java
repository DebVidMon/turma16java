package objetos;

public class Funcionario {
	private String nome;
	private String funcao;
	private double salario;
	
	public Funcionario (String nomeF, String funcaog, double salarioF){
		nome=nomeF;
		funcao = funcaog;
		salario = salarioF;
	}
	
	public String info() {
		String info = (nome+"\t\t"+funcao+"\t\tR$ "+salario);
		return info;
	}
}
