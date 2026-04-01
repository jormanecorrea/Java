public class RecorrerMatriz {
    public static void main(String[] args) {
        final int FILAS = 2;
        final int COLUMNAS = 3;
        int[][] matriz = new int[FILAS][COLUMNAS];
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
        
        //Recorrer Matriz
        //Ciclo externo -> recorre Filas
        for (int f = 0; f < FILAS ; f++) {
            //Ciclo Interno -> Recorrer Columnas
            for(int c = 0; c < COLUMNAS; c++){
                System.out.println("Posicion[" + f + "][" + c + "] = " + matriz[f][c]);
            }
        }

        for (int f = 0; f < FILAS ; f++) {
            //Ciclo Interno -> Recorrer Columnas
            System.out.println(" ");
            for(int c = 0; c < COLUMNAS; c++){
                System.out.print(matriz[f][c] + " ");
            }
        }




    }
}
