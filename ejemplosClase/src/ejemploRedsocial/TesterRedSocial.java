package ejemploRedsocial;

public class TesterRedSocial {

	public static void main(String[] args) {
		
		Individuo i1 = new Individuo("Persona 1");
		Individuo i2 = new Individuo("Persona 2");
		Individuo i3 = new Individuo("Persona 3");
		Individuo i4 = new Individuo("Persona 4");
		Individuo i5 = new Individuo("Persona 5");
		
		// Vinculo de amistad entre el 1 y el 3 (simetrico)
		i1.amigos.add(i3);
		i3.amigos.add(i1);
		
		// Vinculo de amistad entre el 1 y el 3 (simetrico)
		i2.amigos.add(i3);
		i3.amigos.add(i2);
		
		// Vinculo de amistad entre el 1 y el 3 (simetrico)
		i1.amigos.add(i5);
		i5.amigos.add(i1);
				
		// Vinculo de amistad entre el 1 y el 3 (simetrico)
		i4.amigos.add(i3);
		i3.amigos.add(i4);

		
		// Analizamos el individuo 1
		System.out.printf("El individuo 1 tiene %s amigos\n",i1.amigos.size());
		System.out.printf("El individuo 3 tiene %s amigos\n",i3.amigos.size());
		
		System.out.printf("Lista de amigos del individuo 3:\n");
		for(Individuo a:i3.amigos) {
			System.out.printf("%s => %s\n",a.toString(),a.nombre);
			for(Individuo aa:a.amigos) {
				if(aa!=i3) {
					System.out.printf("\t%s => %s\n",aa.toString(),aa.nombre);
				}
			}
			
		}




	}

}
