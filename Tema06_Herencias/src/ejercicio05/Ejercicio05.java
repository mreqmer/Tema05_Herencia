package ejercicio05;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Array de electrodomesticos
		Electrodomestico[] listadoElectrodomesticos = new Electrodomestico[10];

		// Precio de todos los electrodomesticos
		double precioElectrodomesticos = 0;
		// precio de las lavadoras
		double precioLavadora = 0;
		// precio de todas las televisiones
		double precioTelevision = 0;

		// rellena las 10 posiciones con 10 objetos
		listadoElectrodomesticos[0] = new Electrodomestico();
		listadoElectrodomesticos[1] = new Lavadora();
		listadoElectrodomesticos[2] = new Television();
		listadoElectrodomesticos[3] = new Electrodomestico(2, 20);
		listadoElectrodomesticos[4] = new Electrodomestico(20.5, "NEGRO", 'A', 40);
		listadoElectrodomesticos[5] = new Lavadora(20.5, "NEGRO", 'A', 40, 15);
		listadoElectrodomesticos[6] = new Lavadora(20.5, "BLANCO", 'B', 40, 30);
		listadoElectrodomesticos[7] = new Television(20.5, "AZUL", 'C', 40, 20, true);
		listadoElectrodomesticos[8] = new Television(20.5, "GRIS", 'D', 40, 35, false);
		listadoElectrodomesticos[9] = new Television(20.5, "NEGRO", 'Z', 40, 45, true);

		// prueba
		// System.out.println(ListadoElectrodomesticos[4]);

		// recorre el array de los electrodomesticos para aplicar el método que aplica
		// el precio final y lo muestra
		for (Electrodomestico posicion : listadoElectrodomesticos) {

			posicion.precioFinal();

			System.out.println("Precio: " + posicion.getPrecioBase());

		}

		System.out.println();

		// vuelve a recorrer el array para sumar a su variable correspondiente el total
		// de electrodomesticos, el total de lavadoras y el total de televisiones
		for (Electrodomestico posicion : listadoElectrodomesticos) {

			if (posicion instanceof Electrodomestico) {
				precioElectrodomesticos += posicion.getPrecioBase();
			}
			if (posicion instanceof Lavadora) {
				precioLavadora += posicion.getPrecioBase();
			}
			if (posicion instanceof Television) {
				precioTelevision += posicion.getPrecioBase();
			}
		}

		System.out.println("Precio de electrodoméstico: " + precioElectrodomesticos);
		System.out.println("Precio de lavadoras: " + precioLavadora);
		System.out.println("Precio de televisiones: " + precioTelevision);

	}

}
