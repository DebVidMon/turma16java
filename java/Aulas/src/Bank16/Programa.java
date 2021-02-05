package Bank16;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		System.out.println("Digite número da conta");
		String numero = ler.next();
		System.out.println("Digite o cpf");
		String cpf = ler.next();
		Conta conta1 = new Conta(numero,cpf);
		char op;
		do {
			System.out.println("Saldo R$"+conta1.getSaldo());
			System.out.println("D=Débito ou C=Crédito?");
			op = ler.next().toUpperCase().charAt(0);
			System.out.println("Qual o valor?");
			double valor = ler.nextDouble();
			if (op=='D') {
				conta1.debitar(valor);
			} else if(op=='C') {
				conta1.creditar(valor);
			} else {
				System.out.println("Opção invália");
			}
			System.out.println("Nova Operação? [S,N]");
			 op = ler.next().toUpperCase().charAt(0);
		} while(op=='S');
		
		ler.close();
	}

}
