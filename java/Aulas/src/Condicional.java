import java.util.Scanner;

public class Condicional {
	public static void main(String[] args) {
		int x;
		Scanner ler= new Scanner(System.in);
		System.out.println("Par ou ímpar? Digite um valor inteiro positivo");
		x = ler.nextInt();
		if(x<0) {
			System.out.println("Este número é negativo");
		} else if(x==0) {
			System.out.println("Este valor é nulo");
		} else if(x%2==0) {
			System.out.println("Este valor é par");
		}else if(x%2==1){
			System.out.println("Este valor é ímpar");
		}
	}

}
