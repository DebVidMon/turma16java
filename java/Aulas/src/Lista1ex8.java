import java.util.Scanner;

public class Lista1ex8 {
	public static void main(String[] args) {
		double fabrica,imposto,distribuidor,precoFinal;
		Scanner ler= new Scanner(System.in);
		System.out.println("Insira o valor de f�brica");
		fabrica = ler.nextDouble();
		imposto=0.45*fabrica;
		distribuidor=0.28*fabrica;
		precoFinal=fabrica+imposto+distribuidor;
		System.out.println("O pre�o ao consumidor ser� R$"+precoFinal);
		ler.close();
	}

}
