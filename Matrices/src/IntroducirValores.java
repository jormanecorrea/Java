import java.util.Scanner;

public class IntroducirValores {
    public static void main(String[] args) {
        //INTRODUCIR VALORES A UNA MATRIZ
        var sc = new Scanner(System.in);
        //int filas, columnas;

        //1. Se define tamaño Matriz
        System.out.print("Ingresa la cantidad de Filas: ");
        int filas = Integer.parseInt(sc.nextLine());
        System.out.print("Ingresa la cantidad de Columnas: ");
        int columnas = Integer.parseInt(sc.nextLine());

        int[][] matriz = new int[filas][columnas];

        //Solicitar valores
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                System.out.print("Ingrese el valor de la posicion[" + f + "][" + c + "] = ");
                matriz[f][c] = Integer.parseInt(sc.nextLine());
            }
        }

        //Iterar los valores de la Matriz
        for (int f = 0; f < filas; f++){
            for (int c = 0; c < columnas; c++){
                System.out.println("Posicion[" + f + "][" + c + "] - Valor = " + matriz[f][c]);
            }
        }





    }
}
