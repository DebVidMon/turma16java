import java.util.Scanner;

public class L4ex1 {
public static void main(String[] args) {
	Scanner tec= new Scanner(System.in);
	int pontos[]= new int[5];
	int maiorPontuacao=0;
	for(int i=0;i<5;i++) {
		System.out.printf("Digite a %dª pontuação:",(i+1));
		pontos[i]=tec.nextInt();
		if(pontos[i]>maiorPontuacao) {
			maiorPontuacao=pontos[i];
		}
	}
	System.out.println("A maior pontuação foi:"+maiorPontuacao);
	tec.close();
	}
}
