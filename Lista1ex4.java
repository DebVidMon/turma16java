import java.util.Scanner;

public class Lista1ex4 {
	public static void main(String[] args) {
		//Math.pow (x, y)
		//Math.sqr ()
		
		Scanner ler= new Scanner(System.in);
		double A,B,C,D,R,S;
		System.out.println("Digite o valor de A");
		A = ler.nextInt();
		System.out.println("Digite o valor de B");
		B = ler.nextInt();
		System.out.println("Digite o valor de C");
		C = ler.nextInt();
		R= Math.pow((A+B),2);
		S= Math.pow((B+C),2);
		D= (R+S)/2;
		System.out.println("R= "+R+" S= "+S);
		System.out.println("D= "+D);
		
	}
}
