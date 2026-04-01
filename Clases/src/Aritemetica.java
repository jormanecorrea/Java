public class Aritemetica {
    int operando1, operando2;
    //METODOS CLASE ARITMETICA

    //METODO 1
    void sumar() {
        var suma = operando1 + operando2;
        System.out.println("El resultado de la suma es: " + suma);
    }
    //METODO 2
    void restar() {
        var resta = operando1 - operando2;
        System.out.println("El resultado de la resta es: " + resta);
    }

    public static void main(String[] args) {
        System.out.println("EJEMPLO CLASE ARITMETICA");

        System.out.println("OBJETO 1:");
        var aritmetica1 = new Aritemetica();
        aritmetica1.operando1 = 5;
        aritmetica1.operando2 = 7;
        aritmetica1.sumar();

        System.out.println("\nOBJETO 2:");
        var aritmetica2 = new Aritemetica();
        aritmetica2.operando1 = 12;
        aritmetica2.operando2 = 16;
        aritmetica2.restar();
    }
}
