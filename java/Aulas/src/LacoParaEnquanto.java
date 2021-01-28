import java.util.Scanner;

public class LacoParaEnquanto {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int x=0;
		
		//for - para
		for(int i=1;i<=50;i++) {
			System.out.print("-");
		}
		System.out.print("\n");
		//while - enquanto
		while(x<50) {
			x++;
			System.out.print("-");
		}
		
		
	}

}
