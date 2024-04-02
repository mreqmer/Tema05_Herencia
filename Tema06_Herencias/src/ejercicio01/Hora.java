package ejercicio01;

public class Hora {

	/**
	 * hora
	 */
	private int hora;
	/**
	 * minutos
	 */
	private int min;

	/**
	 * constructor
	 * 
	 * @param hora
	 * @param minutos
	 */
	public Hora(int hora, int minutos) {
		if(hora>0 && hora<=23) {
		this.hora = hora;
		}
		if(min > 0 && min <= 59) {
		this.min = minutos;
		}
	}
	
	

	public int getHora() {
		return hora;
	}



	public void setHora(int hora) {
		this.hora = hora;
	}



	public int getMin() {
		return min;
	}



	public void setMin(int min) {
		this.min = min;
	}



	/**
	 * incrementa los min en 1 min
	 */
	void inc() {

		if (min < 59) {
			min++;
		} else {
			min = 0;
			if (hora < 23) {
				hora++;
			} else {
				hora = 00;
			}
		}

	}
	
	/**
	 * Asigna un valor a lo minutos
	 * @param valor
	 * @return
	 */
	boolean setMinutos(int valor) {
		boolean correcto = false;
		
		if(valor>0 && valor <=59) {
			
			this.min = valor;
			correcto = true;
			
		}
		
		return correcto;
	}
	
	/**
	 * Asigna un valor a las horas
	 * @param valor
	 * @return
	 */
	boolean setHoras(int valor) {
		boolean correcto = false;
		
		if(valor>0 || valor <=23) {
			
			this.hora = valor;
			correcto = true;
		}
		return correcto;
	}

	@Override
	public String toString() {
		String cadena;
		
		cadena = hora + ":" + min;
		
		return cadena;
	}
	
	
	

}
