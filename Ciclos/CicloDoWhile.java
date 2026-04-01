public class CicloDoWhile {
    public static void main(String[] args) {
        System.out.println("*** CICLO DO WHILE ***");
        /* El ciclo do while evalua la condicion despues de ejecutar el bloque de codigo, 
        garantizando su ejecucion al menos una vez, independientemente de la condicion */
        int contador = 1;
        do {
            System.out.println("contador = " + contador);
            contador++;
        }while(contador <= 3);
 
        System.out.println("Fin del ciclo");
        
    }
}

