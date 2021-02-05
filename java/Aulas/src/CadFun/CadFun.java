package CadFun;

import java.util.Scanner;

public class CadFun {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.println("Qual a matricula do funcionário?");
		int matricula = ler.nextInt();
		System.out.println("Qual o nome do funcionário?");
		String nome = ler.next();
		System.out.println("Qual o salário por hora?");
		double valorHora = ler.nextDouble();
		System.out.println("Quantas horas foram trabalhadas?");
		int horas = ler.nextInt();
		System.out.println("O funcionário é terceirizado? [S,N]");
		char sN = ler.next().toUpperCase().charAt(0);
		if (sN=='S') {
			System.out.println("Qual o acréscimo?");
			double acrescimo = ler.nextDouble();
			Terceiro fun1 = new  Terceiro(nome,matricula,horas,valorHora,acrescimo);
			System.out.printf("%s R$%.2f\n",fun1.getNome(),fun1.salario());
			
		} else {
			Empregado fun1 = new  Empregado (nome,matricula,horas,valorHora);
			System.out.printf("%s R$%.2f\n",fun1.getNome(),fun1.salario());
		}
		
		
		/*Empregado joao = new Empregado("João",22);
		Terceiro maria = new Terceiro("Maria",533, 0.1);
		
		joao.setHoras(40);
		maria.setHoras(40);
		joao.setValorHora(80.67);
		maria.setValorHora(80.67);
		System.out.printf("%s R$%.2f\n",joao.getNome(),joao.salario());
		System.out.printf("%s R$%.2f\n",maria.getNome(),maria.salario());*/
		
		ler.close();
	}

}
