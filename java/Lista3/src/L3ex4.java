import java.util.Scanner;

public class L3ex4 {
	public static void main(String[] args) {
		/*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas 
		 *dos indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado:
		 *idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções 
		 *(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
		 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas,
		 * calcule e mostre: (WHILE)
	o número de pessoas calmas; 
	o número de mulheres nervosas; 
	o número de homens agressivos; 
	o número de outros calmos;
	o número de pessoas nervosas com mais de 40 anos; 
	o número de pessoas calmas com menos de 18 anos.
		 */
		
		Scanner ler= new Scanner(System.in);
		int idade, sexo, temperamento,sN=0;
		int pessoaCalma=0,mulherNervosa=0,homemAgressivo=0, outrosCalme=0, pessoaNervosa40=0,pessoaCalma18=0;
			while(sN!=1) {
				System.out.println("Qual a sua idade?");
				idade = ler.nextInt();
				System.out.println("Qual a seu sexo?(1-feminino / 2-masculino / 3-outros)");
				sexo = ler.nextInt();
				System.out.println("Você se considera uma pessoa:(1-calma / 2-nervosa / 3-agressiva");
				temperamento = ler.nextInt();
				System.out.println("Sair(1-S / 2-N)");
				sN=ler.nextInt();
				
				if(temperamento==1) {
					pessoaCalma++;
				}else if(sexo==1 && temperamento==2) {
					mulherNervosa++;
				}else if (sexo==2 && temperamento==3) {
					homemAgressivo++;
				}else if(sexo==3 && temperamento==1) {
					outrosCalme++;
				}else if(temperamento==2 && idade>40) {
					pessoaNervosa40++;
				}else if(temperamento==1 && idade<18) {
					pessoaCalma18++;
				}
			}
			
			System.out.println("São "+pessoaCalma+" pessoas calmas;");	
			System.out.println(" "+mulherNervosa+" mulheres nervosas;");
			System.out.println(" "+homemAgressivo+" homens agressivos;");	
			System.out.println(" "+outrosCalme+" outros calmes;");
			System.out.println(" "+pessoaNervosa40+" pessoas nervosas com mais de 40 anos;");	
			System.out.println(" "+pessoaCalma18+" pessoas calmas com menos de 18 anos");
				
	}
}
