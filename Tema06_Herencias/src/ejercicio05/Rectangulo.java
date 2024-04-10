package ejercicio05;

public class Rectangulo extends Poliedro {

    /**
     * 
     */
    double lado1 = 0;

    /**
     * 
     */
    double lado2 = 0;

    /**
     * Constructor sin parámetros
     */
    public Rectangulo() {
        super();
    }

    /**
     * Constructor con todos los parámetros del rectángulo
     * @param numeroLados
     * @param lado1
     * @param lado2
     */
    public Rectangulo(int numeroLados, double lado1, double lado2) {
        super(numeroLados);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

   /**
    * Método abstracto de la clase padre definido para el Rectángulo
    *@return 
    */
    public double area(){
        double res = 0;

        res = (double) lado1 * lado2;

        return res;
    }

    /**
     * To String para el rectángulo
     * @return
     */
    @Override
    public String toString(){
        String cadena = super.toString();

        cadena += "Poliedro: " + "Rectángulo";

        return cadena;
    }



   

    

}
