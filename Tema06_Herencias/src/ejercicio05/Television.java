package ejercicio05;

public class Television extends Electrodomestico {

	private int resolucion = 20;
	
	private boolean sintonizadorTDT = false;

	public Television(double precioBase, Color color, ConsumoEnergetico consumoEnergetico, double peso) {
		super(precioBase, color, consumoEnergetico, peso);
	}

	public Television(int resolucion, boolean sintonizadorTDT) {
		super();
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	
	public void precioFinal() {
		
		super.precioFinal();
		
		if(this.sintonizadorTDT) {
			super.precioBase += 50;
		}
		if(this.resolucion >=40) {
			super.precioBase += (super.precioBase * 0.3);
		}
		
	}
	
	
}
