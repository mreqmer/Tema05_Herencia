package ejercicio02;

/**
 * Clase padre empleado de la que heredan los demás tipos de empleados
 */
public class Empleado {

	/**
	 * nombre del empleado
	 */
	protected String nombre = "";

	/**
	 * Constructor sin parámetros
	 */
	public Empleado() {
	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param nombre
	 */
	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		String cadena = "";

		cadena += "Empleado: " + nombre;

		return cadena;
	}

}
