public class OperadoresLogicos {
    public static void main(String[] args) {
        //OPERADOR AND &&
        System.out.println("\n*** OPERADOR LOGICO: AND && ***");
        boolean a = true, b = false;
        // and: regresa true si ambos son true
        var resultado = a && b;
        System.out.println("Resultado a && b: " + resultado);

        b = true;
        resultado = a && b;
        System.out.println("Resultado a && b: " + resultado);

        //OPERADOR OR ||
        //OR: Regrese si cualquiera de los valores es verdadero
        System.out.println("\n*** OPERADOR LOGICO: OR || ***");
         a = false;
         b = false;
         resultado = a || b;
         System.out.println("Resultado a || b: " + resultado);

        //OPERADOR NOT !
        //NOT: Regrese si cualquiera de los valores es verdadero
        System.out.println("\n*** OPERADOR LOGICO: NOT ! ***");
        boolean c = false, d = true;
        resultado = !c;
        System.out.println("Resultado !c: " + resultado);
        resultado = !d;
        System.out.println("Resultado !d: " + resultado);





    }
}
