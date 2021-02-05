package heranca;

public class Main {

	public static void main(String[] args) {
		Classe1 camiseta = new Classe1("Algodão","Manga longa","Alta","Florido","Nike","Verde");
		Classe2 calca= new Classe2("Jeans","Classica",false,true,"Adidas","Azul");

		
		camiseta.vestir();
		
		calca.setBolso(true);
		System.out.println(calca.getBolso());
	}

}
