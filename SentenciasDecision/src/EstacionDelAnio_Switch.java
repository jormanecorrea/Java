import java.util.Scanner;

public class EstacionDelAnio_Switch {
    public static void main(String[] args) {
        System.out.println("EJERCICIO ESTACION DEL AÑO: SWITCH");
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el mes(1-12): ");
        int mes = sc.nextInt();
        String estacion;

        estacion = switch (mes) {
            case 1, 2, 12  -> "Invierno";
            case 3, 4, 5   -> "Primavera";
            case 6, 7, 8   -> "Verano";
            case 9, 10, 11 -> "Otoño";
            default        -> "Mes invalido";
        };

        System.out.println(estacion);



    }
}
