import java.util.Scanner;

public class DibujoTriangulo {
    public static void main(String[] args) {
        System.out.println("DIBUJA UN TRIANGULO");
        Scanner sc = new Scanner(System.in);
        System.out.print("Indique el numero de filas: ");
        int numeroFilas = sc.nextInt();

        //Iterar sobre cada fila
        for(int fila = 1; fila <= numeroFilas; fila++){
            String espaciosBlancos = " ".repeat(numeroFilas - fila);
            String asteriscos = "*".repeat(2 * fila -1);
            System.out.println(espaciosBlancos + asteriscos);
        }


    }
}
