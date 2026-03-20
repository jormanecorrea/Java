import java.util.Scanner;

public class EjercicioCasaDeLosEspejos {
    public static void main(String[] args) {
        System.out.println("*** EJERCICIO CASA DE LOS ESPEJOS: NOT !");
        Scanner sc = new Scanner(System.in);

        System.out.print("Cual es tu edad: ");
        int edad = Integer.parseInt(sc.nextLine());

        System.out.print("Tienes miedo a la oscuridad?: ");
        boolean miedoOscuridad = Boolean.parseBoolean(sc.nextLine());

        if(!miedoOscuridad && edad > 10){
            System.out.println("Puedes Ingresar");
        } else{
            System.out.println("No puedes Ingresar");
        }
    }
}
