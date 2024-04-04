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
	protected double precioBase = 100;

	/**
	 * 
	 */
	protected Color color = Color.BLANCO;

	/**
	 * 
	 */
	protected ConsumoEnergetico consumoEnergetico = ConsumoEnergetico.F;

	/**
	 * 
	 */
	protected double peso = 5;

	/**
	 * 
	 */


	public Electrodomestico() {
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

	/**
	 * 
	 * @return
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * 
	 * @param precioBase
	 */
	public void setPrecioBase(double precioBase) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
	}

	/**
	 * 
	 * @return
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * 
	 * @param color
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * 
	 * @return
	 */
	public ConsumoEnergetico getConsumoEnergetico() {
		return consumoEnergetico;
	}

	/**
	 * 
	 * @param consumoEnergetico
	 */
	public void setConsumoEnergetico(ConsumoEnergetico consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	/**
	 * 
	 * @return
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * 
	 * @param peso
	 */
	public void setPeso(double peso) {

		if (peso > 0) {
			this.peso = peso;
		}
	}

	/**
	 * 
	 * @param letra
	 * @return
	 */
	private boolean comprobarConsumoEnergetico(char letra) {

		boolean existe = false;
		String letraCadena = String.valueOf(letra);

		for (ConsumoEnergetico consumo : ConsumoEnergetico.values()) {

			if (consumo.name().equals(letraCadena)) {
				existe = true;
			}

		}

		return existe;

	}

	/**
	 * 
	 */
	public void precioFinal() {

		boolean encontrado = false;
		int i = -1;
		int modificadorPeso = 0;
		int modificadorEficiencia = 0;

		while (i < ConsumoEnergetico.values().length && !encontrado) {
			if (ConsumoEnergetico.values()[i] == this.consumoEnergetico) {
				encontrado = true;
			}else {
				i++;
			}

		}

		// desde el precio máximo le resta la posición del enum menos 20
		modificadorEficiencia = 100 - (i * 20);

		if (this.precioBase >= 0 && this.precioBase <= 19) {
			modificadorPeso = 10;
		}
		if (this.precioBase >= 20 && this.precioBase <= 49) {
			modificadorPeso = 50;
		}
		if (this.precioBase >= 50 && this.precioBase <= 79) {
			modificadorPeso = 80;
		}
		if (this.precioBase >= 80) {
			modificadorPeso = 100;
		}

		this.precioBase += (modificadorEficiencia + modificadorPeso);

	}

}
