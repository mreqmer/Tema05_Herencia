package ejercicio03;

public class Perecedero extends Producto {

	
	
	public Perecedero(String nombre, double precio) {
		super(nombre, precio);
	}
	
	public double caducaPrecio(int diasCaducar) {
		double nuevoPrecio = super.precio;
		
		if(diasCaducar == 1){
			
			nuevoPrecio /= (double) 4;
			
		}else if(diasCaducar == 2) {
			
			nuevoPrecio /= (double) 3;
		
		}else if( diasCaducar == 3) {
		
			nuevoPrecio /= (double) 2;
			
		}
		
		return nuevoPrecio;
	}

	
	
	
}
