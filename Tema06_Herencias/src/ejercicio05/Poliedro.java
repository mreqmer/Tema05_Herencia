package ejercicio05;

public abstract class Poliedro {

    /**
     * 
     */
    protected int numeroLados = 0;

    /**
     * 
     */
    public Poliedro() {
    }

    /**
     * 
     * @param numeroLados
     */
    public Poliedro(int numeroLados) {

        this.numeroLados = numeroLados;

    }

    /**
     * 
     * @return
     */
    public int getNumeroLados() {
        return numeroLados;
    }

    /**
     * 
     * @param numeroLados
     */
    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    /**
     * Método área sin definir, abstracto
     * @return
     */
    public abstract double area();


    /**
     * Método toString
     */
    @Override
    public String toString() {

        String cadena = "";

        cadena += "Lados: " + this.numeroLados + "\n";

        return cadena;
    }

 
    
    


}
