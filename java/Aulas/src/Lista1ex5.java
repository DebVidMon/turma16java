import java.util.Scanner;

public class Lista1ex5 {
public static void main(String[] args) {
	Scanner ler= new Scanner(System.in);
	double nota1,nota2,nota3, media;
	System.out.println("Digite a primeira nota");
	nota1 = ler.nextDouble();
	System.out.println("Digite a segunda nota");
	nota2 = ler.nextDouble();
	System.out.println("Digite a terceira nota");
	nota3 = ler.nextDouble();
	media =(nota1*2)+(nota2*3)+(nota3*5)/10;
	System.out.println("A média das notas é "+media);		
	
}
}
