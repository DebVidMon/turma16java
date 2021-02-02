package programas;

import objetos.Aviao;

public class L1ex2 {
	public static void main(String[] args) {
		//jumbo//concorde//caça
		//913km/h //1200km/h//2200km/h
		//412,8 t//12,7t//5,3t
		Aviao av1 = new Aviao("Jumbo",913,412.8);
		Aviao av2 = new Aviao("Concorde",1200,12.7);
		Aviao av3 = new Aviao("Caça",2200,5.3);
		System.out.println("\tAviões e suas características:\n");
		System.out.println(av1.getcaracteristicas()+"\n"+av2.getcaracteristicas()+"\n"+av3.getcaracteristicas());
	}

}
