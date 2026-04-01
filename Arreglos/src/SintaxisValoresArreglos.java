public class SintaxisValoresArreglos {
    public static void main(String[] args) {
        var enteros = new int[5];
        //Modificar los elementos en cada posicion [i0][i1][i2][i3][i4]
        enteros[0] = 13;
        enteros[1] = 21;
        enteros[4] = 42;

        System.out.println("Valor 1 - Posición 0: " + enteros[0]);
        System.out.println("Valor 2 - Posición 1: " + enteros[1]);
        System.out.println("Valor 3 - Posición 2: " + enteros[2]);
        System.out.println("Valor 4 - Posición 3: " + enteros[3]);
        System.out.println("Valor 5 - Posición 4: " + enteros[4]);

        //Otra forma usando For
        /*for (int i = 0; i < enteros.length; i++) {
            System.out.println("Posicion: " + i + " Valor: " + enteros[i]);
        }*/



    }
}
