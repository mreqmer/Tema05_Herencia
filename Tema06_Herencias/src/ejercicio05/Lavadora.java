package ejercicio05;

public class Lavadora extends Electrodomestico{

	/**
	 * Carga que tendrá la lavadora
	 */
	private int carga = 5;

	/**
	 * Constructor sin parámetros
	 */
	public Lavadora() {
		super();
	}

	/**
	 * Constructor con parámetros
	 * @param precioBase
	 * @param peso
	 */
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);

	}

	/**
	 * Constructor con todos los atributos de la lavadora
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 * @param carga
	 */
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	/**
	 * 
	 * @return
	 */
	public int getCarga() {
		return carga;
	}
	
	/**
	 * Sobreescribe el precioFinal con una nueva condición para tener en cuenta la carga
	 */
	@Override
	public void precioFinal() {
		super.precioFinal();
		
		if(this.carga>30) {
			super.precioBase += 50;
		}
		
	}

	
	/**
	 * Sobreescribe el método toString
	 */
	@Override
	public String toString() {
		String cadena = super.toString();
		
		cadena += "Carga: " + this.carga + "\n";
		
		return cadena;

	}

	

	

	

	
	
}
