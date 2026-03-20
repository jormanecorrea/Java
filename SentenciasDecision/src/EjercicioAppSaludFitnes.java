import java.util.Scanner;

public class EjercicioAppSaludFitnes {
    public static void main(String[] args) {
        System.out.println("*** EJERCICIO APLICACION SALUD FITNES ***");
        Scanner sc = new Scanner(System.in);
        //CONSTANTES
        final int META_PASOS_DIARIOS = 10000;
        final double CALORIAS_POR_PASO = 0.04;

        System.out.print("Nombre Usuario: ");
        String nombre = sc.nextLine();

        System.out.print("Pasos Caminados: ");
        int pasosCaminados = Integer.parseInt(sc.nextLine());

        double caloriasQuemadas = pasosCaminados * CALORIAS_POR_PASO
                ;
        //OPERADOR TERNARIO
        String metaAlcanzada = (pasosCaminados >= META_PASOS_DIARIOS) ? "Si 😊" : "No 😒";

        //Mostar Informacion
        System.out.printf("""
                %nUsuario: %s
                Pasos caminados hoy: %d
                Calorias quemadas: %.2f Kcal
                ¿Se cumplio la meta de pasos diarios?: %s
                ------------------------------------------
                La meta de pasos diarios es de: %d pasos
                """, nombre, pasosCaminados, caloriasQuemadas, metaAlcanzada, META_PASOS_DIARIOS);

    }
}
