import java.util.Random;
public class L4ex2 {
public static void main(String[] args) {
	int dado[] = new int[10], maiorValor=0, cont=0;
	double soma=0;
	Random d6 = new Random();
	for(int i=0;i<10;i++) {
		dado[i]=(d6.nextInt(6)+1);
		System.out.printf("\nRodada %d, dado= %d",(i+1),dado[i]);
		soma+=dado[i];
		if(dado[i]>=maiorValor) {
			if(dado[i]>maiorValor) {
				cont=1;
			}else if(dado[i]==maiorValor) {
				cont++;
			}
			maiorValor=dado[i];
		}
	}
	System.out.printf("\nA média é %.2f",soma/10);
	System.out.printf("\nO maior valor %d foi alcançado %d vezes",maiorValor,cont);
}
}
