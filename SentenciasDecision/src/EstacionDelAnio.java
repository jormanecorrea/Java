import java.util.Scanner;

public class EstacionDelAnio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** RETO: ESTACION DE AÑO ***");

        System.out.print("Ingrese el numero del mes: ");
        int mes = Integer.parseInt(sc.nextLine());
        String estacion;
        if (mes == 1 || mes == 2 || mes == 12)
            estacion = "Inviero";
        else if (mes == 3 || mes == 4 || mes == 5)
            estacion = "Primavera";
        else if (mes == 6 || mes == 7 || mes == 8)
            estacion = "Verano";
        else if (mes == 9 || mes == 10 || mes == 11)
            estacion = "Otoño";
        else
            estacion = "Desconocida";

        System.out.printf("La estacion para el mes %d es: %s", mes, estacion);

    }

}
