import java.util.Scanner;

public class L3ex6 {
	public static void main(String[] args) {
		/*Escrever um programa que receba vários números inteiros no teclado.
		 *E no final imprimir a média dos números múltiplos de 3. 
		 *Para sair digitar 0(zero).(DO...WHILE
		 */		
		Scanner ler= new Scanner(System.in);
		int n, soma3=0, n3=0;
		double media = 0;
		do {
			System.out.println("Digite um número. Para sair digite 0(zero)");
			n=ler.nextInt();
			if(n%3==0 && n!=0) {
				soma3+=n;
				n3++;
			}
		}while(n!=0);
		if(n3!=0) {
			media = 1.0*soma3/n3;
			System.out.println("A média dos números múltiplos de 3 é "+media);
		}else {
			System.out.println("Sem números múltiplos de 3");
		}
		ler.close();
	}
}
