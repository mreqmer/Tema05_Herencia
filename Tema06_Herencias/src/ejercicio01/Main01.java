package ejercicio01;

public class Main01 {

	public static void main(String[] args) {
		
		Hora nuevaHora = new Hora(13, 14);
		
		nuevaHora.inc();
		
		System.out.println(nuevaHora);

		HoraExacta nuevaHoraExacta = new HoraExacta(12, 5999, 59);
		
		nuevaHoraExacta.inc();
		
		System.out.println(nuevaHoraExacta);
		
		
		
	}

}
