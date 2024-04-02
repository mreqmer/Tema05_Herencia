package ejercicio02;

/**
 * Empelados directivos
 */
public class Directivo extends Empleado {

	/**
	 * Constructor de directivos
	 * @param nombre
	 */
	public Directivo(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		String cadena = super.toString();
		
		cadena += "-> Directivo";
		
		return cadena;
	}
	
	

	
	
}
