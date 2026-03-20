import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la calificacion numerica(0-10): ");
        double calificacion = sc.nextDouble();
        char  letra = '\0';

        if(calificacion >= 9 && calificacion <= 10)
            letra = 'A';
        else if (calificacion >= 8 && calificacion < 9)
            letra = 'B';
        else if (calificacion >= 7 && calificacion < 8)
            letra = 'C';
        else if (calificacion >= 6 && calificacion < 7)
            letra = 'D';
        else if (calificacion >= 0 && calificacion < 6)
            letra = 'F';
        else
            System.out.println("Valor desconocido");

        System.out.printf("""
                Calificacion: %.1f es equivalente a %c
                """, calificacion, letra);

    }
}

//import java.util.Scanner;
//
//public class SistemaCalificaciones {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Ingrese la calificacion numerica(0-10): ");
//        double calificacion = sc.nextDouble();
//
//        int rango = (int) calificacion; // convertir a entero
//
//        char letra = switch (rango) {
//            case 9, 10 -> 'A';
//            case 8 -> 'B';
//            case 7 -> 'C';
//            case 6 -> 'D';
//            case 0, 1, 2, 3, 4, 5 -> 'F';
//            default -> '?';
//        };
//
//        System.out.printf("""
//                Calificacion: %.1f es equivalente a %c
//                """, calificacion, letra);
//    }
//}

