package programas;

import objetos.ProdutoEletronico;

public class L1ex3 {
public static void main(String[] args) {
	ProdutoEletronico pe1 = new ProdutoEletronico("Teclado","preto",50.48);
	ProdutoEletronico pe2 = new ProdutoEletronico("Mouse","verde",38.7);
	ProdutoEletronico pe3 = new ProdutoEletronico("Game","branco",1290.45);
	System.out.println("LOJA - PRODUTOS DISPONÍVEIS");	
	System.out.println("Produto\tCor\tPreço");
	System.out.println(pe1.caracteristicas()+"\n"+pe2.caracteristicas()+"\n"+pe3.caracteristicas());
}
}
