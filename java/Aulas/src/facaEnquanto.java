import java.util.Scanner;

public class facaEnquanto {
public static void main(String[] args) {
	/*2- Fa�a um programa que pegue um n�mero do teclado
	 * e calcule a soma de todos os n�meros  de 1 at� ele.
	 * Ex.: o usu�rio entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
	 * TENTAR NOVAMENTE COM DO/WHILE E CONTADOR
	 * */
	Scanner ler= new Scanner(System.in);
	int valor,soma=0;
	
	System.out.println("Digite um n�mero");
	valor = ler.nextInt();
	
	while(valor>0) {
		soma+=valor;
		valor--;
	}
	System.out.println("A soma de todos os n�meros de 1 at� o n�mero dado � "+soma);
	
}
}
