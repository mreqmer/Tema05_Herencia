package ejercicio05;

public class Television extends Electrodomestico {

	/**
	 * Resolución de la televisión
	 */
	private int resolucion = 20;

	/**
	 * La televisión tiene o no TDT
	 */
	private boolean sintonizadorTDT = false;

	/**
	 * Constructor sin parámetros
	 */
	public Television() {
		super();
	}

	/**
	 * Constructor con el precio y el peso
	 * @param precioBase
	 * @param peso
	 */
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
	}

	/**
	 * Constructor con todos los atributos de la televisión
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 * @param resolucion
	 * @param sintonizadorTDT
	 */
	public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion,
			boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	/**
	 * 
	 * @return
	 */
	public int getResolucion() {
		return resolucion;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	/**
	 * Sobreescribe el pecioFinal para tener en cuenta si tiene TDT y la resolución
	 */
	@Override
	public void precioFinal() {

		super.precioFinal();

		if (this.sintonizadorTDT) {
			super.precioBase += 50;
		}
		if (this.resolucion >= 40) {
			super.precioBase += (super.precioBase * 0.3);
		}

	}

	
	/**
	 * Sobreescribe el toString con los nuevos atributos
	 */
	@Override
	public String toString() {
		
		String cadena = super.toString();

		cadena += "Resolución: " + this.resolucion + "\n";
		cadena += "TDT: " + this.sintonizadorTDT + "\n";
		
		return cadena;

	}

}
