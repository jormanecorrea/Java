import java.util.Scanner;

public class SistemaAdministracionCuentas {
    public static void main(String[] args) {
        System.out.println(" *** Sistema de Administacion de cuenta ***");
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        //COMENZAR ITERACION
        while (!salir) {
            System.out.print("""
                    Menu:
                    1. Crear Cuenta
                    2. Eliminar cuenta
                    3. Salir
                    Selecciona una opcion:\s""");

            int opcion = sc.nextInt();
            //Evaluar cada opcion
            switch (opcion){
                case 1 -> System.out.println("Creando tu cuenta...\n");
                case 2 -> System.out.println("Eliminando tu cuenta...\n");
                case 3 -> {
                    System.out.println("Saliendo del sistema...");
                    salir = true;
                }
                default -> System.out.println("Opción invalida");
            }
        }
    }
}
