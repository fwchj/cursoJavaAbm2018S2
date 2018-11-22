package ejemploRedsocial;

import java.util.ArrayList;

public class Individuo {

	String nombre;
	ArrayList<Individuo> amigos = new ArrayList<Individuo>();
	
	public Individuo(String nombre) {
		this.nombre = nombre;
	}
}
