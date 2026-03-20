public class OperadoresComparacion {
    public static void main(String[] args) {
        System.out.println("\u001B[1m*** OPERADORES DE COMPARACION ***");
        int a =3, b = 2;
        System.out.println("a = " + a + "\nb = " + b );

        //Igualdad ==
        var resultado = a == b;
        System.out.println("Resultado a == b: " + resultado);

        //Distinto !=
        resultado = a != b;
        System.out.println("Resultado a != b = " + resultado);

        //Mayor que >
        resultado = a > b;
        System.out.println("Resultado a > b: " + resultado);

        //Mayor o igual que >=
        resultado = a >= b;
        System.out.println("Resultado a >= b: " + resultado);

        //Menor que <
        resultado = a < b;
        System.out.println("Resultado a < b: " + resultado);

        //Menor o igual que <=:
        resultado = a <= b;
        System.out.println("Resultado a <= b: " + resultado);




    }
}
