package ejemploRedsocial;

import java.util.ArrayList;

public class TesterAleatorio {

	public static void main(String[] args) {
		ArrayList<Individuo> miPoblacion = new ArrayList<Individuo>();
		
		//Generar la poblacion
		for(int i=0;i<10;i++) {
			miPoblacion.add(new Individuo("I"+i));
		}
		
		//Generar la red
		double p = 0.3;
		for(Individuo searcher:miPoblacion) {
			for(Individuo candidato:miPoblacion) {
				if(searcher!=candidato && !searcher.amigos.contains(candidato)) {
					double r = Math.random();
					if(r<p) { //=> si van a ser amigos
						searcher.amigos.add(candidato);
						candidato.amigos.add(searcher);
					}
				}
			}
		}
		
		// Imprimir la lista de amigos
		for(Individuo i:miPoblacion) {
			System.out.printf("Los %s amigos de %s son:\n", i.amigos.size(),i.nombre);
			for(Individuo a:i.amigos) {
				System.out.printf("\t %s\n",a.nombre); //Imprimir 
			}
		}
		
		
		

	}

}
