import java.util.Scanner;

public class IntroducirValoresArreglos {
    public static void main(String[] args) {
        //INTRODUCIR VALORES A UN ARREGLO
        Scanner sc = new Scanner(System.in);

        //Declarar Arreglo
        System.out.print("Indique el tamaño del Arreglo(Array): ");
        int largoArreglo = Integer.parseInt(sc.nextLine());

        //Creamos de manera dinámica el Arreglo
        int[] enteros = new int[largoArreglo];

        //Solicitar Valores del Arreglo
        for(int i = 0; i < largoArreglo; i++){
            System.out.print("Proporciona el valor respectivo[" + i + "] = ");
            enteros[i] = Integer.parseInt(sc.nextLine());
        }
        //Imprimir valores del arreglo
        for(int i = 0; i < largoArreglo; i++)
            System.out.println("\nIndice[" + i + "] - entero " + (i+1) + " : " + enteros[i]);


    }
}
