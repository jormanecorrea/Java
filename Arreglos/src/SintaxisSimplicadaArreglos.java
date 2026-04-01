public class SintaxisSimplicadaArreglos {
    public static void main(String[] args) {
        System.out.println("*** SINTAXIS SIMPLIFICADA ARREGLOS ***");
        //Primer forma
        int[] array1 = {100, 200, 300, 400, 500};

        //Segunda Forma
        var array2 = new int[] {100, 200, 300, 400, 500};

        for(int i = 0; i < array1.length; i++)
            System.out.println("Valor " + (i+1) + " - Indice " + i + ": " + array1[i]);

    }
}
