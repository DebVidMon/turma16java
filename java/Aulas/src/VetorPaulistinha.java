import java.util.Scanner;

public class VetorPaulistinha {
public static void main(String[] args) {
	Scanner ler= new Scanner(System.in);
	String times[]= {"Corinthias","Palmeiras"," Santos  ","São Paulo"};
	int pontos[]=new int[4];
	char resultado;
	//4 rodadas
	for(int rodada=0;rodada<4;rodada++) {
		System.out.println("\n\tParcial da "+(rodada+1)+"ª rodada:\n");
	for(int i=0;i<4;i++) {
		System.out.print(times[i]+" Ganhou-G, Empatou-E, Perdeu-P? ");
		resultado = ler.next().toUpperCase().charAt(0);
		if(resultado=='G') {
			pontos[i]+=3;
		}else if(resultado=='E') {
			pontos[i]+=1;
		}else if(resultado=='P') {
			pontos[i]+=0;
		}else {
			System.out.println("Tente novamente\n"+times[i]+" Ganhou-G, Empatou-E, Perdeu-P? ");
			resultado = ler.next().toUpperCase().charAt(0);
				}
		}
		
	}
	System.out.println("\n\tTabela Final\n\n");
	System.out.println("   Times\t\tPontos\n");
	for(int i=0;i<4;i++){
	System.out.println(times[i]+"\t\t"+pontos[i]);
	}
}
}
