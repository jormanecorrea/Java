public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("\u001B[1m*** OPERADORES DE ASIGNACION ***");

        //Asignacion simple (=)
        var miNumero = 10;
        int miNumero2;
        miNumero2 = 15;

        // Asignacion COMPUESTO
        // +=
        miNumero += 5; //miNumero = miNumero + 5
        System.out.println("miNumero +=5 = " + miNumero);

        // -=, *=, /=, %=
        miNumero *= 2;
        System.out.println("miNumero *=2 = " + miNumero);

        //Asignacion Variables Multiples
        int a = 10, b = 15, c =10;
        System.out.printf("a = %d, b = %d, c = %d ", a, b, c);

        double d = 10, e = 20, f = 50.50;
        System.out.printf("d = %.1f, e = %.1f, f = %.1f", d, e, f);



    }
}
