import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** EJERCICIO PROMEDIO CALIFICACIONES ***");
        Scanner sc = new Scanner(System.in);
        double suma = 0;

        System.out.print("Cuantas Calificaciones deseas agregar: ");
        int cantidadCalificaciones = Integer.parseInt(sc.nextLine());
        int[] calificaciones = new int[cantidadCalificaciones]; //Tamaño definido

        for (int i = 0; i < cantidadCalificaciones ; i++) {
            System.out.print("Ingrese la calificación[" +  i + "]: " );
            calificaciones[i] = Integer.parseInt(sc.nextLine());
            suma += calificaciones[i];
        }

        System.out.println("\n Promedio Calificaciones = " + (suma/cantidadCalificaciones));






    }
}
