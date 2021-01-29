import java.util.Scanner;
public class L2ex3 {
public static void main(String[] args) {
	int idade;
	Scanner ler= new Scanner(System.in);
	System.out.println("Qual a sua idade?");
	idade = ler.nextInt();
	if(idade>=10 && idade<=14) {
		System.out.println("Categoria Infantil");
	} else if(idade<=17) {
		System.out.println("Categoria Juvenil");
	} else if(idade<=24) {
		System.out.println("Categoria Adulto");
	}else {
		System.out.println("Sem categoria");
	}
	ler.close();
}
}
