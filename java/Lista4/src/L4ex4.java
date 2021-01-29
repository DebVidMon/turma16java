import java.util.Scanner;
public class L4ex4 {
public static void main(String[] args) {
	int[][]matriz=new int[3][3];
	int soma=0, somaPrincipal=0;
	Scanner ler= new Scanner (System.in);
	
	for (int l=0;l<3;l++) {
		for(int c=0;c<3;c++) {
			System.out.printf("Digite um número:[%d][%d]",l+1,c+1);
			matriz[l][c]= ler.nextInt();
			soma+=matriz[l][c];
			if(l==c) {
				somaPrincipal+=matriz[l][c];
			}
			
		}
	}
	System.out.println("Matriz 3X3=");
	for (int l=0;l<3;l++) {
		for(int c=0;c<3;c++) {
			System.out.print(matriz[l][c]+"\t");
		}
		System.out.print("\n");
	}
	
	System.out.printf("A soma dos elementos da matriz é %d e a soma da Diagonal Principal é %d", soma,somaPrincipal);
	ler.close();
}
}
