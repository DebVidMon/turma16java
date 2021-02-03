
public class Teste {
	public static void main(String[] args) {
		Fornecedor p1 = new Fornecedor("Quartzolite",4000,1500);
		Empregado p2 = new Empregado("Ana", 13, 1500);
		Administrador p3 = new Administrador("Jorge", 1000);
		Operario p4 = new Operario("Sandra",12000);
		Vendedor p5 = new Vendedor("Adriano",5000);
		System.out.println("Saldo Fornecedor \tR$"+p1.obterSaldo());
		System.out.println("Salário Empregado \tR$"+p2.calcularSalario());
		System.out.println("Ajuda Administrador \tR$"+p3.getAjudaDeCusto());
		System.out.println("Comissão Operário \tR$"+ p4.comissao());
		System.out.println("Comissão Vendedor \tR$"+ p5.comissao());
		
	}
}
