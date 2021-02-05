import java.util.Scanner;
public class Agenda {
public static void main(String[] args) {
	String agenda[][]= new String[24][31];
	Scanner ler= new Scanner(System.in);
	int dia, hora;
	char sN;
	do {
		do {
		System.out.println("Digite o dia");
		dia=ler.nextInt();
		dia-=1;
		}while(dia<=1 && dia>31);
		do {
		System.out.println("Digite a hora");
		hora=ler.nextInt();
		}while(hora<=0 && hora>23);
		System.out.println("Digite o compromisso");
		agenda[hora][dia]=ler.next();
		System.out.println("Novo compromisso?[S,N]");
		sN=ler.next().toUpperCase().charAt(0);
	} while (sN=='S');
		
	System.out.println("Agenda");
	for(hora=0;hora<24;hora++) {
		for(dia=0;dia<31;dia++) {
			if(agenda[hora][dia]!=null) {
				System.out.printf("\nDia "+(dia+1)+", às "+hora+" horas, "+ agenda[hora][dia]);
			}
		}
	}
	
	ler.close();
}
}
