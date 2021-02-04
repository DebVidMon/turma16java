package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaLista {

	 public static void main(String[] args) {
		 	Scanner ler = new Scanner(System.in);
		 	String item = null;
		 	int i;
		 	char sN;
		    final int MAX = 5;
		    List<String> lista = new ArrayList<String>();
		    for (i = 0; i < MAX; i++) {
		    System.out.println("Adicione item na lista");
		      item= ler.next();
		      lista.add(item);
		    }
		    do {
			    System.out.println("Lista:");
			    for (i = 0; i < MAX; i++) {
			    	System.out.println((i+1)+"."+lista.get(i));
			    }
			    
			    System.out.println("Deseja remover algum item da lista? [S,N]");
			    sN= ler.next().toUpperCase().charAt(0);
			    if (sN=='S') {
			    	System.out.println("Qual o número do item a ser removido?");
			    	i=ler.nextInt();
			    	lista.remove(i-1);
			    	lista.add(" ");
			    }
		    }while(sN!='N');
		    
		    
		    ler.close();
	 }
	
}
