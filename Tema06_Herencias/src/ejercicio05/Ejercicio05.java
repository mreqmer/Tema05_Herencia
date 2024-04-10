package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
      
        Poliedro pArray[] = new Poliedro[20];

        int opc;

        int pos = 0;

        menu();
        opc = pideOpcion();

        do{
            switch(opc){
                case 1 ->{
                   pos = posicionLibre(pArray);
                   if(pos!= -1){
                       newFigura(opc);
                   }
                   
                 }case 2 ->{
                   pos = posicionLibre(pArray);
                   if(pos!= -1){
                       newFigura(opc);
                   }
                 }case 3 ->{
       
                   muestraInformacion(pArray);
       
                 }default ->{
                     System.out.println("No válido.");
                 }
       
               }
               menu();
               opc = pideOpcion();
        }while(opc!=0);
        
      
    }

    public static int pideOpcion(){
        int opc;

        System.out.println("Introduce una opción del menú: ");
        opc = sc.nextInt();
        sc.nextLine();

        return opc;
    }

    public static void menu(){

        System.out.println("1. Introducir triángulo.");
        System.out.println("2. Introducir rectángulo.");
        System.out.println("3. Mostrar contenido del Array");

    }

    public static Poliedro newFigura(int opc){

        Poliedro p;

        int lado1 = 0;
        int lado2 = 0;
        int lado3= 0 ;
       
        System.out.println("Introduce el lado 1:");
        lado1 = sc.nextInt();
        System.out.println("Introduce el lado 2:");
        lado2 = sc.nextInt();

        if(opc == 1){
            System.out.println("Introduce lado 3: ");
            lado3 = sc.nextInt();
            p = new Triangulo(3, lado1, lado2, lado3);
        }else{
             p = new Rectangulo(4, lado1, lado2);
        }


        return p;
    }

    public static int posicionLibre(Poliedro array[]){
        int pos = -1;
        int i = 0;

        while(pos == -1 && i<array.length){
            if(array[i] == null){
                pos = i;
                
            }
            i++;
        }

        return pos;
    }

    //falta por hacer esto
    public static void muestraInformacion(Poliedro array[]){

        for(Poliedro valor : array){
            System.out.println(valor.toString());
            System.out.println(valor.area());
        }
    }

}
