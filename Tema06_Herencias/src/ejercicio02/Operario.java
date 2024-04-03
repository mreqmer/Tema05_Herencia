package ejercicio02;

/**
 * Clase operario que hereda de Empleado
 */
public class Operario extends Empleado {

	public Operario() {
		super();
	}

	public Operario(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		String cadena = super.toString();
		
		cadena += "-> Operario";
		
		return cadena;
	}
	
	
	

}
