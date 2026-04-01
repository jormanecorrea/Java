public class Terminos_Brake_Continue {
    public static void main(String[] args) {
        System.out.println("*** TERMINOS: BRAKE & CONTINUE ***");
        //break: Se utiliza para salir de un ciclo prematuramente.
        //continue: Se utiliza para saltar la iteración actual y continuar con la siguiente.

        //BRAKE: Finaliza ciclo
        System.out.println("SINTAXIS BRAKE:");
        for (int numero = 1; numero < 10; numero++) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
                break;
            }
        }

        //CONTINUE: Se salta la iteracion actual e inicia la nueva iteracion
        System.out.println("\nSINTAXIS CONTINUE:");
        for (int numero = 1; numero < 10; numero++) {
            if (numero % 2 == 0) {
                continue;
                }
            System.out.print(numero + " ");

        }
    }
}
