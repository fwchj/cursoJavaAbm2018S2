package ventaAuto;

public class Camion extends Vehiculo {

	double capacidadCarga;
	
	public Camion(String col, String marca, String modelo, int puertas, double km, double p, boolean elec, double cap) {
		super(col, marca, modelo, puertas, km, p, elec);
		this.capacidadCarga = cap;
	}
	
	// Metodo simple en el cual el auto 'se presenta' => imprime un texto en la consola
		public void presentate() {
			System.out.printf("Marca %s, Modelo: %s, Color: %s, Precio: %s, Capacidad: %s\n", this.marca,this.modelo,this.color,this.getPrecio(),this.capacidadCarga);
			//TODO: Tengo que hacer algo
		}

		@Override
		public double getCostoUnitario() {
			return this.getPrecio()/ this.capacidadCarga;
		}


}
