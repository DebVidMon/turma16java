
import java.util.Scanner;
public class Lista1ex1 {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int anos,meses,dias,total=0;
		
		System.out.println("Qual a sua idade em dias?");
		System.out.println("Para isso precisamos que você saiba sua idade em Anos, Meses e Dias.");
		System.out.println("Quantos anos completos você tem?");
		anos = ler.nextInt();
		System.out.println("Quantos meses completos você tem?");
		meses = ler.nextInt();
		System.out.println("Quantos dias completos você tem?");
		dias = ler.nextInt();
		total=(anos*365)+(meses*30)+dias;
		System.out.println("Você tem aproximadamente "+ total +" dias de idade");
		ler.close();
	}
}
