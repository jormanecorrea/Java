public class SumaAcumulativa {
    public static void main(String[] args) {
        System.out.println("*** EJERCICIO SUMA ACUMULATIVA ***");
        final int MAXIMO = 5;
        int acumuladorSuma = 0;

        //Iterar los valores
        int numero = 1;
        while(numero <= MAXIMO){
            System.out.println("***ITERACION: " + numero + " ***");

            //Imprimir lo que va asumar
            System.out.println("acumuladorSuma + numero -> " + acumuladorSuma + " + " + numero);

            //Realizar Suma
            acumuladorSuma += numero++; //acumuladorSuma = acumuladorSuma + numero

            //Imprimir la suma parcial acumulada
            System.out.println("Suma parcial acumulada: " + acumuladorSuma + "\n");            
        }
        System.out.println("La suma de los primeros " + MAXIMO + " " + "numeros es: " + acumuladorSuma);

    }

    
}
