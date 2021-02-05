import java.util.Scanner;

import formas.Triangulo;
public class AreaTriangulo {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);//instaciar = criar
		Triangulo tri1 = new Triangulo();
		double base, altura, area, maiorArea = 0;
		for(int i=0;i<3;i++) {
			System.out.println("Digite a base do triangulo: ");
			base = leia.nextDouble();
			System.out.println("Digite a altura do triangulo: ");
			altura = leia.nextDouble();
			
			area = ((base * altura) / 2 );
			System.out.printf("Area = %.2f \n", area);
			
			if(area > maiorArea) {
				maiorArea = area;
			}
		}
		System.out.printf("A maior área é %.2f",maiorArea);
		System.out.println("\n+++++++++++++++++++++++++++++++++++++++");
		System.out.println("Digite a base do triangulo 1: ");
		tri1.base = leia.nextDouble();
		System.out.println("Digite a altura do triangulo 1: ");
		tri1.altura = leia.nextDouble();
		System.out.println("A área é "+tri1.area());
		
		leia.close();
	}

}
