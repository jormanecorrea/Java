import java.util.Scanner;

public class EjercicioSistemasDescuentosVIP {
    public static void main(String[] args) {
        System.out.println("*** EJERCICIO SISTEMA DE DESCUENTOS VIP: OPERADOR AND***");
        Scanner sc = new Scanner(System.in);
        int cantidadProductos;
        boolean esMiembro;

        System.out.print("Cuantos productos lleva: ");
        cantidadProductos = Integer.parseInt(sc.nextLine());

        System.out.print("Es miembro: ");
        esMiembro = Boolean.parseBoolean(sc.nextLine());

        var descuentoVIP = cantidadProductos >= 10 && esMiembro;
        System.out.println("Tiene descuento VIP: " + descuentoVIP);

    }
}
