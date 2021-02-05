import java.util.Scanner;

public class Lista1ex8 {
	public static void main(String[] args) {
		double fabrica,imposto,distribuidor,precoFinal;
		Scanner ler= new Scanner(System.in);
		System.out.println("Insira o valor de fábrica");
		fabrica = ler.nextDouble();
		imposto=0.45*fabrica;
		distribuidor=0.28*fabrica;
		precoFinal=fabrica+imposto+distribuidor;
		System.out.println("O preço ao consumidor será R$"+precoFinal);
		ler.close();
	}

}
