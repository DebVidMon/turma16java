import java.util.Scanner;

public class Lista1ex3 {
public static void main(String[] args) {
	Scanner ler= new Scanner(System.in);
	int h,min,seg;
	System.out.println("Qual o tempo em segundos?");
	seg = ler.nextInt();
	h = seg/3600;
	min= (seg%3600)/30;
	seg =(seg%3600)%30;
	System.out.println("Foram "+ h +" horas, "+min+" minutos e "+seg+" segundos");
	ler.close();
}
}
