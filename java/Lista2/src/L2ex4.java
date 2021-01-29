import java.util.Scanner;
public class L2ex4 {
	public static void main(String[] args) {
		/*Faça um programa em que permita a entrada de um número qualquer e exiba
		 *  se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo;
		 *  se for ímpar exiba o número elevado ao quadrado.*/
		double x, raiz,quadrado;
		Scanner ler= new Scanner(System.in);
		System.out.println("Par ou ímpar? Digite um valor inteiro positivo");
		x = ler.nextDouble();
		if(x%2==0) {
			raiz = Math.sqrt(x);
			System.out.println("Este valor é par e sua raiz quadrada é "+raiz);
		}else if(x%2==1){
			quadrado = Math.pow(x,2);
			System.out.println("Este valor é ímpar e ao quadrado é "+quadrado);
		}
		
		ler.close();
	}

}
