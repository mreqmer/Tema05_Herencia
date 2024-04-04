package ejercicio05;

public class Lavadora extends Electrodomestico{

	private int carga = 5;

	

	public Lavadora(double precioBase, Color color, ConsumoEnergetico consumoEnergetico, double peso) {
		super(precioBase, color, consumoEnergetico, peso);
	}

	public Lavadora(double precioBase, Color color, ConsumoEnergetico consumoEnergetico, double peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	
	public void precioFinal() {
		
		super.precioFinal();
		
		if(carga>=30) {
			super.precioBase += 50;
		}
		
	}
	
	
	
	
	
	
	
	

	
	
}
