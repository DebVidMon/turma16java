import java.util.Scanner;

public class Prefeitura {
	public static void main(String[] args) {
		
/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:   
a) m�dia do sal�rio da popula��o; 
b) m�dia do n�mero de filhos; 
c) maior sal�rio; 
d) percentual de pessoas com sal�rio at� R$100,00.*/
		
	Scanner ler= new Scanner(System.in);
	final int hab=20;
	int filhos;
	double salario, somaSalario=0, somaFilhos=0, maiorSalario=0, somaCem=0;
	
	for(int i=0;i<hab;i++){
		System.out.println("Qual seu sal�rio?");
		salario= ler.nextInt();
		somaSalario+=salario;
		if(salario>=maiorSalario) {
			maiorSalario=salario;
		}
		if(salario<=100) {
			somaCem++;
		}
		System.out.println("Quantos filhos voc� tem?");
		filhos= ler.nextInt();
		somaFilhos+=filhos;
	}
	
	System.out.printf("A m�dia salarial � R$%.2f",(somaSalario/hab));
	System.out.println("\nA m�dia de filhos � "+(somaFilhos/hab));
	System.out.printf("O maior sal�rio � R$%.2f",(maiorSalario));
	System.out.println("\nA porcentagem de pessoas com sal�rio at� R$100,00 � "+(somaCem*100/hab)+"%");
	
	
	ler.close();

	}
}
