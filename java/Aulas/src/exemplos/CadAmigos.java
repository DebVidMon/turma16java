package exemplos;

import java.util.Scanner;

import entidades.Pessoa;

public class CadAmigos {
	
	public static void main(String[] args) {
		Scanner ler =new Scanner(System.in); 
		Pessoa miga1 = new Pessoa();
		
		System.out.println("Nome: ");
		miga1.nome = ler.next();
		System.out.println("G�nero F- feminino, M- masculino ou S- segredo: ");
		miga1.genero = ler.next().toUpperCase().charAt(0);
		System.out.println("Ano de Nascimento :");
		miga1.anoNascimento = ler.nextInt();
		
		System.out.printf("oi %s, sua idade � %d anos",miga1.nome,miga1.idade());
		
		ler.close();
	}
}
