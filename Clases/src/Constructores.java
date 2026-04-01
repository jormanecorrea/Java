public class Constructores {

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
