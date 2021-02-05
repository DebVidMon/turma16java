package entidades;

public class Pessoa {
	public String nome, tratamento;
	public char genero;
	public int anoNascimento;
	
	public int idade(){
		return 2021-anoNascimento;
	}
	
	public String tratamento() {
		if (genero =='F') {
			return  ("Senhora");
		}else if (genero == 'M') {
			return ("Senhor");
		}else {
			return ("Senhore");
			}
	}
	
/*	public void statusIdade() {
		if (idade<18) {
			System.out.println("Menor de idade");
		} else {
			System.out.println("Maior de idade");
		}
		}*/
		
}
