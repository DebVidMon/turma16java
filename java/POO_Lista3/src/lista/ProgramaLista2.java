package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaLista2 {

	 public static void main(String[] args) {
		 	Scanner ler = new Scanner(System.in);
		 	String item;
		 	int i, cont=0;
		 	char sN;
		    List<String> lista = new ArrayList<String>();
		    //Faz a lista
		    do {
		    System.out.println("Adicione item na lista");
		      item= ler.next();
		      lista.add(item);
		      System.out.println("Mais um item?[S,N]");
		      sN = ler.next().toUpperCase().charAt(0);
		      cont++;
		    }while(sN!='N');
		    
		  //Mostra a lista
		    System.out.println("Lista:");
		    for (i = 0; i < cont; i++) {
		    	System.out.println((i+1)+"."+lista.get(i));
		    }
		    //Remove da lista
		    do {
			    System.out.println("Deseja remover algum item da lista? [S,N]");
			    sN= ler.next().toUpperCase().charAt(0);
			    if (sN=='S') {
			    	System.out.println("Qual o número do item a ser removido?");
			    	i=ler.nextInt();
			    	lista.remove(i-1);
			    	cont--;
			    }
			    System.out.println("Lista:");
			    for (i = 0; i < cont; i++) {
			    	System.out.println((i+1)+"."+lista.get(i));
			    }
		    }while(sN!='N');
		    
		    //Adicionar na lista
		    
		  do{
		    	System.out.println("Deseja adicionar algum item na lista? [S,N]");
		    	sN= ler.next().toUpperCase().charAt(0);
		    if (sN=='S') {
		    	System.out.println("Adicione item na lista");
		    	item=ler.next();
		    	lista.add(item);
		    	cont++;
		    }
		    	System.out.println("Lista:");
			    for (i = 0; i < cont; i++) {
			    System.out.println((i+1)+"."+lista.get(i));
			    }
	    }while(sN!='N');
	    	//Final
		    System.out.println("Operação Finalizada");
		    ler.close();

	 }
	
}
