public class NumerosImpares_doWhile {
    public static void main(String[] args) {
        System.out.println("*** NUMEROS IMPARES DEL 0 AL 20 (DO WHILE) ***");

        int contador = 0;
        do {
            if (contador % 2 != 0) {
                System.out.print(contador + " ");                
            }
            contador++;

        } while(contador <= 20);

    }
    
}
