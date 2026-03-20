import java.util.Scanner;

public class EjercicioSistemaPrestamoLibros {
    public static void main(String[] args) {
        System.out.println("*** EJERCICIO SISTEMA PRESTAMOS LIBROS: OR || ***");
        Scanner sc = new Scanner(System.in);
        final int distaciaMaxima = 3;

        System.out.print("A cuantos km de la biblioteca: ");
        int distancia = Integer.parseInt(sc.nextLine());
        System.out.print("Tiene credencial de estudiante: ");
        final boolean credencialEstudiante = Boolean.parseBoolean(sc.nextLine());

        boolean prestamoLibro = credencialEstudiante || distancia <= distaciaMaxima;
        System.out.println("Se permite prestarle libro: " + prestamoLibro);




    }
}
