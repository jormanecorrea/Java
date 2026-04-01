import java.util.Scanner;

public class SumaDiagonalMatriz {
    public static void main(String[] args) {
        System.out.println("*** RETO SUMA DIAGONAL DE UNA MATRIZ ***");
        var sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de filas: ");
        int filas = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese la cantidad de columnas: ");
        int columnas = Integer.parseInt(sc.nextLine());

        int[][] matriz = new int[filas][columnas];
        int sumaDiagonalMatriz = 0;

        //Solicitar Valores
        for (int f = 0; f < filas ; f++) {
            for (int c = 0; c < columnas; c++) {
                System.out.print("Ingrese el valor de la posición [" + f + "][" + c + "]: ");
                matriz[f][c] = Integer.parseInt(sc.nextLine());
            }

        }

        System.out.println();
        //Suma de la Diagonal
        for (int f = 0; f < filas ; f++) {
            for (int c = 0; c < columnas; c++) {
                if (f == c)
                    sumaDiagonalMatriz += matriz[f][c];
            }
        }

        System.out.println("La suma de la diagonal es: " +  sumaDiagonalMatriz);

    }
}
