import java.util.Scanner;

public class Prefeitura {
	public static void main(String[] args) {
		
/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.*/
		
	Scanner ler= new Scanner(System.in);
	final int hab=20;
	int filhos;
	double salario, somaSalario=0, somaFilhos=0, maiorSalario=0, somaCem=0;
	
	for(int i=0;i<hab;i++){
		System.out.println("Qual seu salário?");
		salario= ler.nextInt();
		somaSalario+=salario;
		if(salario>=maiorSalario) {
			maiorSalario=salario;
		}
		if(salario<=100) {
			somaCem++;
		}
		System.out.println("Quantos filhos você tem?");
		filhos= ler.nextInt();
		somaFilhos+=filhos;
	}
	
	System.out.printf("A média salarial é R$%.2f",(somaSalario/hab));
	System.out.println("\nA média de filhos é "+(somaFilhos/hab));
	System.out.printf("O maior salário é R$%.2f",(maiorSalario));
	System.out.println("\nA porcentagem de pessoas com salário até R$100,00 é "+(somaCem*100/hab)+"%");
	
	
	ler.close();

	}
}
