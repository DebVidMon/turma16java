import java.util.Scanner;

public class L2ex1 {
	public static void main(String[] args) {
	//receba 3 inteiros e diga qual é o maior
		
	int A,B,C, maior=0;
	Scanner ler= new Scanner(System.in);
	System.out.println("Digite um valor inteiro");
	A = ler.nextInt();
	System.out.println("Digite outro valor inteiro");
	B = ler.nextInt();
	if(B>A) {
		maior=B;
	}else {
		maior=A;
	}
	System.out.println("Digite o último valor inteiro");
	C = ler.nextInt();
	if(C>maior) {
		maior=C;
	} else {
		maior=maior;
	}
	System.out.println("O maior  valor é "+maior);
	}
}
