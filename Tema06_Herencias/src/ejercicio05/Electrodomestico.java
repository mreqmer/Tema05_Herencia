package ejercicio05;

/**
 *
 */
public class Electrodomestico {

	/**
	 * 
	 */
	enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS;
	}

	/**
	 * 
	 */
	enum ConsumoEnergetico {
		A, B, C, D, E, F
	}

	/**
	 * 
	 */
	private double precioBase = 100;

	/**
	 * 
	 */
	private Color color = Color.BLANCO;

	/**
	 * 
	 */
	private ConsumoEnergetico consumoEnergetico = ConsumoEnergetico.F;

	/**
	 * 
	 */
	double peso = 5;

	/**
	 * 
	 */
	public Electrodomestico(String color, String consumoEnergetico) {

		this.color = Color.valueOf(color.toUpperCase());
		this.consumoEnergetico = ConsumoEnergetico.valueOf(consumoEnergetico.toUpperCase());
	}

	/**
	 * 
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 */
	public Electrodomestico(double precioBase, Color color, ConsumoEnergetico consumoEnergetico, double peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		this.color = color;

		this.consumoEnergetico = consumoEnergetico;

		if (peso > 0) {
			this.peso = peso;
		}
	}

}
