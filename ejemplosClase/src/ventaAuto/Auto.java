
package ventaAuto;


public class Auto extends Vehiculo {
	
	int numeroPasajeros;

	public Auto(String col, String marca, String modelo, int puertas, double km, double p, boolean elec,int pax) {
		super(col, marca, modelo, puertas, km, p, elec);
		this.numeroPasajeros = pax;
	}
	
	public double getPuertasPorPax() {
		return (double)this.numeroPasajeros / this.puertas;
	}

}
