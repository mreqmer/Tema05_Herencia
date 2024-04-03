package ejercicio03;

/**
 * Clase padre producto
 */
public class Producto {

	/**
	 * Nombre del producto
	 */
	protected String nombre = "";

	/**
	 * Precio del producto
	 */
	protected double precio = 0;

	/**
	 * Constructor
	 * @param nombre
	 * @param precio
	 */
	public Producto(String nombre, double precio) {
		if (!nombre.equals("") || nombre != null) {
			this.nombre = nombre;
		}
		if (precio > 0) {
			this.precio = precio;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	/**
	 * 
	 * @param numero
	 * @return
	 */
	public double calcular(int numero) {
		double res;
		
		res = this.precio * numero;
		
		return res;
	}
	
	/**
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		
		Producto p = (Producto) obj;
		
		if(this.nombre.equals(p.nombre) && this.precio == p.precio) {
			iguales = true;
		}
		
		return iguales;
		
	}

}
