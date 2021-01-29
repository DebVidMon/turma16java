package DesafioBanco;
import java.util.Scanner;

public class ContaEspecial {
	public static void main(String[] args) {
		/*[1 / 2 ] - CONTA XXXXX


SELECIONE O MOVIMENTO - D/C:
VALOR: _
DESCRIÇÃO:  
SALDO ATUAL:_
CONTINUA S/N:
A CONTA NÃO PODE FICA NEGATIVA

PEDIDO POR CONTA:
C ESPECIAL - DESEJA USAR O LIMITE - SE SIM QUANTO: [1000] - SALDO

*char continua = 'S';
saldoAtual=0
*/
		Scanner ler= new Scanner(System.in);
		char continua = 'S', movimento;
		int  contador=0;
		double valor, saldoAtual=0.0, limiteEspecial=1000.00;
		String descricao;
		System.out.println("CONTA ESPECIAL\n\n");
		
		while((continua=='S' || continua=='s') && contador<10) {
			System.out.printf("SALDO ATUAL: R$%.2f LIMITE ESPECIAL: R$%.2f",saldoAtual,limiteEspecial);
			System.out.print("\nSELECIONE O MOVIMENTO - D/C: ");
			movimento= ler.next().charAt(0);
			System.out.print("VALOR: R$");
			valor= ler.nextDouble();
			System.out.print("DESCRIÇÃO: ");
			descricao = ler.next();
			if(movimento=='C' || movimento=='c') {
					saldoAtual+=valor;
						if(limiteEspecial==1000) {
							System.out.printf("SALDO ATUAL: R$%.2f LIMITE ESPECIAL: R$%.2f",saldoAtual,limiteEspecial);
						}else if(limiteEspecial<1000){
								if(limiteEspecial+valor<1000) {
									limiteEspecial+=valor;
								}else{
									limiteEspecial=1000;
								}
							System.out.printf("SALDO ATUAL: R$%.2f LIMITE ESPECIAL: R$%.2f",saldoAtual,limiteEspecial);
						}
				}else if(movimento=='D' || movimento=='d') {
					saldoAtual= saldoAtual-valor;
					if(saldoAtual<=0) {
						System.out.println("Saldo insuficiente");
						System.out.println("DESEJA USAR O LIMITE?[S,N]");
						continua= ler.next().charAt(0);
						//continua= ler.next().toUpperCase().charAt(0);
						if(continua=='S' || continua=='s') {
						//if(continua=='S'|| continua=='s') {
								limiteEspecial=(saldoAtual+limiteEspecial);
								if(limiteEspecial>=0) {
									System.out.printf("Você ainda tem R$%.2f no Limite Especial",limiteEspecial);
								}else {
									System.out.println("Saldo insuficiente\n Transação Cancelada");
									break;
								}
							}else {
								saldoAtual+=valor;
								System.out.printf("SALDO ATUAL: R$%.2f LIMITE ESPECIAL: R$%.2f",saldoAtual,limiteEspecial);
							}
					}
					
				}
			System.out.println("\nOutra Transação?[S,N]");
			continua= ler.next().charAt(0);
			contador++;
		}
		System.out.println("Até Logo");
		ler.close();

	}

}
