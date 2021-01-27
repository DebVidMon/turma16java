import java.util.Scanner;

public class Lista1ex6 {
public static void main(String[] args) {
	//Math.pow (x, y)
	//Math.sqr ()
	
	Scanner ler= new Scanner(System.in);
	int x1,y1,x2,y2;
	double parcial, d;
	System.out.println("Digite o valor de x1");
	x1 = ler.nextInt();
	System.out.println("Digite o valor de y1");
	y1 = ler.nextInt();
	System.out.println("Digite o valor de x2");
	x2 = ler.nextInt();
	System.out.println("Digite o valor de y2");
	y2 = ler.nextInt();
	parcial =Math.pow((x2-x1),2)+Math.pow((y2-y1),2);
	d= Math.sqrt(parcial);
	System.out.println("Distância d= "+d);
}
}
