public class SintaxisSimplificada {
    public static void main(String[] args) {
        //int[][] matriz = new int[][] Filas{ Columna{100, 200, 300}, {400, 500, 600} };
        int[][] matriz = new int[][]{
                {100, 200, 300},//--> Posiciones [0][0], [0][1], [0][2]
                {400, 500, 600} //--> Posiciones [1][0], [1][1], [1][2]

        };

        for (int f = 0; f < matriz.length ; f++) { //Se Obtiene el largo del arreglo de cada fila en este caso 2
            for (int c = 0; c < matriz[f].length; c++) { //Se obtiene el largo de cada arreglo dentro de las filas es decir la cantidad de columnas
                System.out.println("Posición[" + f + "][" + c + "] = " + matriz[f][c]);
            }
        }
    }
}
