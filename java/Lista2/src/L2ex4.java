import java.util.Scanner;
public class L2ex4 {
	public static void main(String[] args) {
		/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba
		 *  se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo;
		 *  se for �mpar exiba o n�mero elevado ao quadrado.*/
		double x, raiz,quadrado;
		Scanner ler= new Scanner(System.in);
		System.out.println("Par ou �mpar? Digite um valor inteiro positivo");
		x = ler.nextDouble();
		if(x%2==0) {
			raiz = Math.sqrt(x);
			System.out.println("Este valor � par e sua raiz quadrada � "+raiz);
		}else if(x%2==1){
			quadrado = Math.pow(x,2);
			System.out.println("Este valor � �mpar e ao quadrado � "+quadrado);
		}
		
		ler.close();
	}

}
