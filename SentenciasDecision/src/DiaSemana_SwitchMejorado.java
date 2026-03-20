import java.util.Scanner;

public class DiaSemana_SwitchMejorado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio dia semana con SwitchMejorado");

        System.out.print("Ingrese un dia de la semana(1-7): ");
        int dia = sc.nextInt();
        String nombreDia;

        nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "Dia invalido";
        };

        System.out.println(nombreDia);
    }
}
