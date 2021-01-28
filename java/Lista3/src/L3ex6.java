import java.util.Scanner;

public class L3ex6 {
	public static void main(String[] args) {
		/*Escrever um programa que receba vários números inteiros no teclado.
		 *E no final imprimir a média dos números múltiplos de 3. 
		 *Para sair digitar 0(zero).(DO...WHILE
		 */		
		Scanner ler= new Scanner(System.in);
		int n, soma3=0;
		do {
			System.out.println("Digite um número. Para sair digite 0(zero)");
			n=ler.nextInt();
			if(n%3==0) {
				soma3+=n;
			}
		}while(n!=0);
		
		System.out.println("A soma dos números múltiplos de 3 é "+soma3);
	}
}
