import java.util.Scanner;

public class L3ex2 {
public static void main(String[] args) {
	Scanner dig =new Scanner(System.in);
	int x, contadorP=0, contadorI=0;
	for(int i=0;i<10;i++) {
		System.out.println("Digite um n�mero");
		x= dig.nextInt();
		if(x%2==0) {
			System.out.println("\tPar\n");
			contadorP++;
		}else {
			System.out.println("\t�mpar\n");
			contadorI++;
		}
	}
	System.out.println("Voc� digitou "+contadorP+" n�meros pares e "+contadorI+" n�meros �mpares");
}
}
