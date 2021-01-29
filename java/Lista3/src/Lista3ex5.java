import java.util.Scanner;

public class Lista3ex5 {
	public static void main(String[] args) {
		/*Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
		 * No final, mostre a soma dos números digitados.(DO...WHILE)
		 */
		Scanner ler= new Scanner(System.in);
		int n, soma=0;
		do {
			System.out.println("Digite um número");
			n=ler.nextInt();
			soma+=n;
		}while(n!=0);
		
		System.out.println("A soma dos números é "+soma);
		
		ler.close();
	}

}
