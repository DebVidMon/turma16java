import java.util.Scanner;

public class Lista1ex2 {
public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int anos,meses,dias;
		System.out.println("Qual a sua idade?");
		System.out.println("Quantos dias você tem?");
		dias = ler.nextInt();
		anos = dias/365;
		meses= (dias%365)/30;
		dias =(dias%365)%30;
		System.out.println("Você tem "+ anos +" anos, "+meses+" meses e "+dias+" dias de idade");
		ler.close();
	}

}
