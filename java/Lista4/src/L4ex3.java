import java.util.Random;

public class L4ex3 {
public static void main(String[] args) {
	int [][]N1=new int [4][6];
	int [][]N2=new int [4][6];
	
	Random d9 = new Random();
	System.out.println("\tN1=\n");
	for(int l=0;l<4;l++) {
		for(int c=0;c<6;c++) {
			N1[l][c]=d9.nextInt(10);
			System.out.print(N1[l][c]+"\t");
		}
		System.out.print("\n");
	}
	
	System.out.println("\n\tN2=\n");
	for(int l=0;l<4;l++) {
		for(int c=0;c<6;c++) {
			N2[l][c]=d9.nextInt(10);
			System.out.print(N2[l][c]+"\t");
		}
		System.out.print("\n");
	}
	
	System.out.println("\n\tM1=\n");
	for(int l=0;l<4;l++) {
		for(int c=0;c<6;c++) {
			System.out.print((N1[l][c]+N2[l][c])+"\t");
		}
		System.out.print("\n");
	}
	
	System.out.println("\n\tM2=\n");
	for(int l=0;l<4;l++) {
		for(int c=0;c<6;c++) {
			System.out.print((N1[l][c]-N2[l][c])+"\t");
		}
		System.out.print("\n");
	}
}
}
