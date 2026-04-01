public class IntroduccionMatrices {
    public static void main(String[] args) {
        // 1. Definimos  una Matriz
        //Matriz de [2] Filas por [3] columnas
        int[][] matriz = new int[2][3];
        var matriz2 = new int[2][3];

        //Modificar los Valores de la Matriz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        //Accedemos(Imprimimos) a los valores
        System.out.println("Valor 1 [0][0] = " + matriz[0][0]); //Fila 1 - Columna 1
        System.out.println("Valor 2 [0][1] = " + matriz[0][1]); //Fila 1 - Columna 2
        System.out.println("Valor 3 [0][2] = " + matriz[0][2]); //Fila 1 - Columna 3
        System.out.println("Valor 4 [1][0] = " + matriz[1][0]); //Fila 2 - Columna 1
        System.out.println("Valor 5 [1][1] = " + matriz[1][1]); //Fila 2 - Columna 2
        System.out.println("Valor 5 [1][1] = " + matriz[1][2]); //Fila 2 - Columna 3

    }
}
