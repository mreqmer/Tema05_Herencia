package ejercicio05;

public class Triangulo extends Poliedro {

    /**
     * 
     */
    double lado1 = 0;

    /**
     * 
     */
    double lado2 = 0;

    /**
     * 
     */
    double lado3 = 0;

    /**
     * 
     */
    public Triangulo() {
        super();
    }

    /**
     * 
     * @param numeroLados
     * @param lado1
     * @param lado2
     * @param lado3
     */
    public Triangulo(int numeroLados, double lado1, double lado2, double lado3) {
        super(numeroLados);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }


    /**
     * 
     * @return
     */
    public double area(){

        double res = 0;
        double a = this.lado1;
        double b = this.lado2;
        double c = this.lado3;
        double semiperimetro = (double) (a + b + c)/2;

        res = Math.sqrt(semiperimetro*(semiperimetro - a)*(semiperimetro - b)*(semiperimetro - c));

        return res;
    }

    /**
     * To String para el triángulo
     * @return
     */
    @Override
    public String toString(){
        String cadena = super.toString();

        cadena += "Poliedro: " + "Triángulo";

        return cadena;
    }
    

}
