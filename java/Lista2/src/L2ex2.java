import java.util.Scanner;
public class L2ex2 {
	public static void main(String[] args) {
		//receba 3 inteiros e coloque em ordem crescente
		int A,B,C, maior=0, menor=0, meio=0;
		
		Scanner ler= new Scanner(System.in);
		System.out.println("Digite um valor inteiro");
		A = ler.nextInt();
		System.out.println("Digite outro valor inteiro");
		B = ler.nextInt();
		if(B>A) {
			maior=B;
			menor=A;
		}else {
			maior=A;
			menor=B;
		}
		System.out.println("Digite o último valor inteiro");
		C = ler.nextInt();
		if(C>maior) {
			meio=maior;
			maior=C;
		} else if(C<=menor){
			meio=menor;
			menor=C;
		} else {
			C=meio;				
		}
		System.out.println("Ordem crescente "+menor+"\t"+meio+"\t"+maior);
	}
}

