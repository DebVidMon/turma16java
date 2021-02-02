package programas;

import java.util.Scanner;

import objetos.Cliente;

public class L1ex1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Cliente cliente1 = new Cliente();
		System.out.println("Olá! Qual seu nome?");
		cliente1.nome = ler.next();
		System.out.println("Qual a sua idade?");
		cliente1.idade = ler.nextInt();
		System.out.println("Já comprou com a gente antes?[S,N]");
		cliente1.clienteAntigo = ler.next().toUpperCase().charAt(0);
		
		System.out.println(cliente1.frase());
		System.out.println(cliente1.produto());
		
		
		ler.close();
	}
}
