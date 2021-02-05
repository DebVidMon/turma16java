public class TesteDesafio {
	public static void main(String[] args) {
		ProdutoDesafio item1= new ProdutoDesafio(12);
		ProdutoDesafio item2 = new ProdutoDesafio(3,"Apagador");
		ProdutoDesafio item3 = new ProdutoDesafio(8,"Giz",5.8);
		
		System.out.println(item1.codigo+" "+item1.descricao+" R$"+item1.valorUnitario);
		System.out.println(item2.codigo+" "+item2.descricao+" R$"+item2.valorUnitario);
		System.out.println(item3.codigo+" "+item3.descricao+" R$"+item3.valorUnitario);
		
	}
}
