import java.util.Scanner;

public class Condicional {
	public static void main(String[] args) {
		int x;
		Scanner ler= new Scanner(System.in);
		System.out.println("Par ou �mpar? Digite um valor inteiro positivo");
		x = ler.nextInt();
		if(x<0) {
			System.out.println("Este n�mero � negativo");
		} else if(x==0) {
			System.out.println("Este valor � nulo");
		} else if(x%2==0) {
			System.out.println("Este valor � par");
		}else if(x%2==1){
			System.out.println("Este valor � �mpar");
		}
	}

}
