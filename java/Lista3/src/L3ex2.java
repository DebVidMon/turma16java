import java.util.Scanner;

public class L3ex2 {
public static void main(String[] args) {
	Scanner dig =new Scanner(System.in);
	int x, contadorP=0, contadorI=0;
	for(int i=0;i<10;i++) {
		System.out.println("Digite um número");
		x= dig.nextInt();
		if(x%2==0) {
			System.out.println("\tPar\n");
			contadorP++;
		}else {
			System.out.println("\tÍmpar\n");
			contadorI++;
		}
	}
	System.out.println("Você digitou "+contadorP+" números pares e "+contadorI+" números ímpares");
}
}
