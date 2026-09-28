package aritmetica.prueba;

import aritmetica.Aritmetica;

public class PruebaArimetica {
    public static void main(String[] args) {
        System.out.println("*** EJEMPLO ARITMETICA ***");

        //OBJETO 1:
        System.out.println("\nOBJETO 1: ");
        var aritmetica1 = new Aritmetica(5, 7);
        System.out.println("Atributo Operando1: " + aritmetica1.getOperando1());
        aritmetica1.setOperando1(10);
        aritmetica1.setOperando2(15);
        aritmetica1.sumar();
        aritmetica1.restar();

        //OBJETO 2:
        System.out.println("\nOBJETO 2: ");
        var aritmetica2 = new Aritmetica();
        aritmetica2.setOperando1(10);
        aritmetica2.setOperando2(15);
        System.out.println("Atributo Operando1: " + aritmetica2.getOperando1());
        System.out.println("Atributo Operando2: " + aritmetica2.getOperando2());
        aritmetica2.sumar();
        aritmetica2.restar();


    }

}
