import java.util.Scanner;

public class EjercicioSistemaBancario {
    public static void main(String[] args) {
        System.out.println("*** BIENVENIDOS AL SISTEMA BANCARIO ***");
        Scanner sc = new Scanner(System.in);

        System.out.print("Desea salir del sistema ? (True/False): ");

        boolean salir = Boolean.parseBoolean(sc.nextLine());

        if(!salir){
            System.out.println("Continuamos dentro del sistema");
        } else {
            System.out.println("Saliendo del sistema");
        }
    }
}
