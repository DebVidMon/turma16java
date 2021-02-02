package programas;

import objetos.Funcionario;

public class L1ex4 {
	public static void main(String[] args) {
		Funcionario pe1 = new Funcionario("José","CEO",50000);
		Funcionario pe2 = new Funcionario("Maria","Diretora",10000);
		Funcionario pe3 = new Funcionario("Klauss","Gerente",5200);
		System.out.println("Nome\t\tFunção\t\tSalário");
		System.out.println(pe1.info()+"\n"+pe2.info()+"\n"+pe3.info());
	}

}
