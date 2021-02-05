package exemplos;

import java.util.Scanner;
import entidades.Pessoa;

public class CursoIngles {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Pessoa alune = new Pessoa();
		System.out.println("Qual seu nome? ");
		alune.nome = ler.next();
		System.out.println("Gênero F- feminino, M- masculino ou S- segredo: ");
		alune.genero = ler.next().toUpperCase().charAt(0);
		System.out.println("Ano de Nascimento :");
		alune.anoNascimento = ler.nextInt();
		
		System.out.printf("Olá %s %s \n", alune.tratamento(), alune.nome);
		if (alune.idade()<18) {
			System.out.println("Indicamos o Curso for Teens");
		} else {
			System.out.println("Indicamos o Curso for Adults");
		}
		
		ler.close();
	}

}
