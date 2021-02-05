package CadFun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadFun2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		List <Empregado> lista = new ArrayList<>();
		
		System.out.println("Digite o n�mero de Funcion�rios");
		int numeroFun = ler.nextInt();
		
		for(int i=0;i<numeroFun;i++) {
			System.out.println("Funcion�rio "+(i+1));
			
			System.out.println("Qual a matricula do funcion�rio?");
			int matricula = ler.nextInt();
			
			System.out.println("Qual o nome do funcion�rio?");
			String nome = ler.next();
			
			System.out.println("Qual o sal�rio por hora?");
			double valorHora = ler.nextDouble();
			
			System.out.println("Quantas horas foram trabalhadas?");
			int horas = ler.nextInt();
			
			System.out.println("O funcion�rio � terceirizado? [S,N]");
			char sN = ler.next().toUpperCase().charAt(0);
			
			if (sN=='S') {
				System.out.println("Qual o acr�scimo?");
				double acrescimo = ler.nextDouble();
				lista.add( new  Terceiro(nome,matricula,horas,valorHora,acrescimo));
				//System.out.printf("%s R$%.2f\n",fun.getNome(),fun.salario());
				
			} else {
				lista.add( new  Empregado (nome,matricula,horas,valorHora));
				//System.out.printf("%s R$%.2f\n",fun.getNome(),fun.salario());
			}
		}
		System.out.println("Sal�rios:");
		for(Empregado nario:lista) {
			System.out.printf("%s \tR$%.2f\n",nario.getNome(),nario.salario());
		}
		ler.close();
	}
}
