public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** OPERADORES UNARIOS ***");
        int a = 3, b = -2, resultado;
        boolean c = true;
        //OPERADOR UNARIO (+) --> Cambia signo del numero a Positivo
        resultado = +a;
        System.out.println("Resultado +a: " + resultado);

        //OPERADOR UNARIO (-) Cambia signo del numero a negativo
        resultado = -a;
        System.out.println("Resultado -a: " + resultado);

        // Operadores Unarios de Incremento/Decremento
        System.out.println("\nINCREMENTO");
        //Pre-Incremento
        resultado = ++a; //Pre-incremento, primero se incrementa el valor
        System.out.println("Resultado ++a: " + resultado);
        System.out.println("a = "+ a);
        //Post-Incremento
        a = 3;
        resultado = a++; //Primero se usa el valor y despues se incrementa
        System.out.println("Resultado a++: " + resultado);
        System.out.println("a++ despues de incrementar = "+ a);

        System.out.println("\nDECREMENTO");
        //Pre-decremento
        System.out.println("b = " + (b = 2));
        resultado = --b; //Primero se decrementa y despues se usa el valor
        System.out.println("Resultado --b: " + resultado);

        //Post-Decremento
        b = 2;
        resultado = b--; //Primero usa el valor original b=2, luego incrementa
        System.out.println("Resultado b--: " + resultado);
        System.out.println("b-- despues de decrementar = "+ b);


    }
}
