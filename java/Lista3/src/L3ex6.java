import java.util.Scanner;

public class L3ex6 {
	public static void main(String[] args) {
		/*Escrever um programa que receba v�rios n�meros inteiros no teclado.
		 *E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
		 *Para sair digitar 0(zero).(DO...WHILE
		 */		
		Scanner ler= new Scanner(System.in);
		int n, soma3=0, n3=0;
		double media = 0;
		do {
			System.out.println("Digite um n�mero. Para sair digite 0(zero)");
			n=ler.nextInt();
			if(n%3==0 && n!=0) {
				soma3+=n;
				n3++;
			}
		}while(n!=0);
		if(n3!=0) {
			media = 1.0*soma3/n3;
			System.out.println("A m�dia dos n�meros m�ltiplos de 3 � "+media);
		}else {
			System.out.println("Sem n�meros m�ltiplos de 3");
		}
		ler.close();
	}
}
