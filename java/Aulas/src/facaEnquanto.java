import java.util.Scanner;

public class facaEnquanto {
public static void main(String[] args) {
	/*2- Faça um programa que pegue um número do teclado
	 * e calcule a soma de todos os números  de 1 até ele.
	 * Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
	 * TENTAR NOVAMENTE COM DO/WHILE E CONTADOR
	 * */
	Scanner ler= new Scanner(System.in);
	int valor,soma=0;
	
	System.out.println("Digite um número");
	valor = ler.nextInt();
	
	while(valor>0) {
		soma+=valor;
		valor--;
	}
	System.out.println("A soma de todos os números de 1 até o número dado é "+soma);
	
}
}
