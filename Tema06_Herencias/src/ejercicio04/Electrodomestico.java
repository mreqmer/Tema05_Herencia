package ejercicio04;

/**
 *
 */
public class Electrodomestico {

	/**
	 * Colores disponibles
	 */
	enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS;
	}

	/**
	 * Posibles opciones de consumo
	 */
	enum ConsumoEnergetico {
		A, B, C, D, E, F

	}

	/**
	 * Precio del producto
	 */
	protected double precioBase = 100;

	/**
	 * Colores del producto
	 */
	protected Color color = Color.BLANCO;

	/**
	 * Consumo del producto
	 */
	protected ConsumoEnergetico consumoEnergetico = ConsumoEnergetico.F;

	/**
	 * Peso del producto
	 */
	protected double peso = 5;

	/**
	 * Constructor sin parámetros
	 */
	public Electrodomestico() {

	}

	/**
	 * Constructor con parámetos
	 * @param precioBase
	 * @param peso
	 */
	public Electrodomestico(double precioBase, double peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}

		if (peso > 0) {
			this.peso = peso;
		}
	}

	/**
	 * Constructor con parámetros
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 */
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}

		this.color = comprobarColor(color);

		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);

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
	public void setColor(String color) {
		this.color = comprobarColor(color);
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
	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
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
	 * Comprueba que se haya introducido un consumo válido, si no le asina F de predeterminado
	 * @param letra
	 * @return
	 */
	public ConsumoEnergetico comprobarConsumoEnergetico(char letra) {

		String letraString = Character.toString(letra);

		ConsumoEnergetico consumo = ConsumoEnergetico.F;

		for (ConsumoEnergetico ce : ConsumoEnergetico.values()) {

			if (ce.name().equals(letraString)) {
				consumo = ConsumoEnergetico.valueOf(letraString);
			}
		}

		return consumo;
	}

	/**
	 * Comprueba que se haya introduciddo un color válido, si no se pone Blanco de predeterminado
	 * @param color
	 * @return
	 */
	public Color comprobarColor(String color) {

		Color c = Color.BLANCO;

		for (Color valor : Color.values()) {

			if (valor.name().equals(color)) {
				c = Color.valueOf(color);
			}
		}

		return c;

	}

	/**
	 * Calcula el precio que tendrá el producto según su consumo y su peso
	 */
	public void precioFinal() {

		switch (this.consumoEnergetico) {

		case A -> {
			this.precioBase += 100;
		}
		case B -> {
			this.precioBase += 80;
		}
		case C -> {
			this.precioBase += 60;
		}
		case D -> {
			this.precioBase += 50;
		}
		case E -> {
			this.precioBase += 30;
		}
		case F -> {
			this.precioBase += 10;
		}

		}

		if (peso > 0 && peso < 20) {
			this.precioBase += 10;
		} else if (peso >= 20 && peso < 50) {
			this.precioBase += 50;
		} else if (peso >= 50 && peso < 80) {
			this.precioBase += 80;
		} else if (peso >= 80) {
			this.precioBase += 100;
		}

	}

	/**
	 * Método to String
	 */
	@Override
	public String toString() {
		String cadena = "";

		cadena += "Precio: " + this.precioBase + "\n";

		cadena += "Color: " + this.color + "\n";

		cadena += "Consumo: " + this.consumoEnergetico + "\n";

		cadena += "Peso: " + this.peso + "\n";

		return cadena;
	}

}
