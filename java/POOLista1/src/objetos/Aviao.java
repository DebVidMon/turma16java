package objetos;

public class Aviao {
	
	public String nomeAviao;
	public double velocidadeMaxima;
	public double cargaMaxima;
	
	public Aviao (String nome, double velocidade, double carga)
	{
		nomeAviao=nome;
		velocidadeMaxima = velocidade;
		cargaMaxima = carga;
	}
	
	public String getcaracteristicas() {
		String caracteristicas = (nomeAviao+" chega à velocidade de "+velocidadeMaxima+" km/h e aguenta "+cargaMaxima+" toneladas");
		return caracteristicas;
	}
	
	
}
