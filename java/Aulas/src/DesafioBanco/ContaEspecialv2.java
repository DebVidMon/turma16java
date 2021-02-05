package DesafioBanco;
import java.util.Scanner;

public class ContaEspecialv2 {
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
		char continua = 'S', movimento[]=new char[10];
		int  cont=0;
		double valor[]=new double[10], saldoAtual=0.0, limiteEspecial=1000.00;
		String descricao[]=new String[10];
		System.out.println("CONTA ESPECIAL\n\n");
		
		while((continua=='S' || continua=='s') && cont<10) {
			System.out.printf("SALDO ATUAL: R$%.2f LIMITE ESPECIAL: R$%.2f",saldoAtual,limiteEspecial);
			
			System.out.print("\nSELECIONE O MOVIMENTO - D/C: ");
			movimento[cont]= ler.next().toUpperCase().charAt(0);
			System.out.print("VALOR: R$");
			valor[cont]= ler.nextDouble();
			System.out.print("DESCRIÇÃO: ");
			descricao[cont] = ler.next();
			
			if(movimento[cont]=='C') {
					saldoAtual+=valor[cont];
						if(limiteEspecial==1000) {
							System.out.printf("SALDO ATUAL: R$%.2f LIMITE ESPECIAL: R$%.2f",saldoAtual,limiteEspecial);
						}else if(limiteEspecial<1000){
								if(limiteEspecial+valor[cont]<1000) {
									limiteEspecial+=valor[cont];
								}else{
									limiteEspecial=1000;
								}
							System.out.printf("SALDO ATUAL: R$%.2f LIMITE ESPECIAL: R$%.2f",saldoAtual,limiteEspecial);
						}
				}else if(movimento[cont]=='D') {
					saldoAtual= saldoAtual-valor[cont];
					if(saldoAtual<=0) {
						System.out.println("Saldo insuficiente");
						System.out.println("DESEJA USAR O LIMITE?[S,N]");
						continua= ler.next().toUpperCase().charAt(0);
						if(continua=='S') {
								limiteEspecial=(saldoAtual+limiteEspecial);
								if(limiteEspecial>=0) {
									System.out.printf("Você ainda tem R$%.2f no Limite Especial",limiteEspecial);
								}else {
									saldoAtual+=valor[cont];
									limiteEspecial+=valor[cont];
									valor[cont]=0;
									System.out.println("Saldo insuficiente\n Transação Cancelada");
								}
							}else {
								saldoAtual+=valor[cont];
								valor[cont]=0;
								System.out.printf("SALDO ATUAL: R$%.2f LIMITE ESPECIAL: R$%.2f",saldoAtual,limiteEspecial);
							}
					}
					
				}
			
			System.out.println("\nOutra Transação?[S,N]");
			continua= ler.next().toUpperCase().charAt(0);
			cont++;
			
		}
		
		System.out.println("Deseja conferir o extrato?[S,N]");
		continua= ler.next().toUpperCase().charAt(0);
		
		if(continua=='S') {
			linha();
			System.out.println("\n\tExtrato da Conta Especial");
			linha();
			System.out.println("\nValor\t\tDescrição\n");
			
			for(int i=0;i<10;i++){
					if(movimento[i]=='C' && valor[i]!=0) {
						System.out.printf(" %.2f %c\t\t%s",valor[i],movimento[i],descricao[i]);
					}else if(movimento[i]=='D' && valor[i]!=0) {
						System.out.printf("- %.2f %c\t\t%s",valor[i],movimento[i],descricao[i]);
					}
				System.out.println();
			}
			linha();
			System.out.printf("\nSALDO ATUAL: R$%.2f LIMITE ESPECIAL: R$%.2f\n",saldoAtual,limiteEspecial);
			linha();
			
		}
		
		System.out.println("\nAté Logo");
		ler.close();

	}
	
	public static void linha() {
		for(int i=0;i<40;i++) {
			System.out.print("-");
		}
			
	}

}
