import java.util.Scanner;

public class EjercicioGeneracionTicketVenta {
    public static void main(String[] args) {
        System.out.println("*** EJERCICIO GENERACION TICKET VENTA ***");
        Scanner sc = new Scanner(System.in);

        System.out.print("Precio Leche: ");
        double precioLeche = Double.parseDouble(sc.nextLine());

        System.out.print("Precio Pan: ");
        double precioPan = Double.parseDouble(sc.nextLine());

        System.out.print("Precio lechuga: ");
        double precioLechuga = Double.parseDouble(sc.nextLine());

        System.out.print("Precio Platanos: ");
        double precioPlatanos = Double.parseDouble(sc.nextLine());

        System.out.print("¿Aplicar algun descuento(%) ?: ");
        int descuentoPorcentaje = Integer.parseInt(sc.nextLine());

        //Calcular subtotal sin impuestos
        double subtotal = precioLeche + precioPan + precioLechuga + precioPlatanos;

        //Aplicar el descuento
        double descuento = subtotal *(descuentoPorcentaje / 100.0);

        //Subtotal con descuento
        double subtotalDescuento = subtotal - descuento;

        //Calculo con Impuestos
        double impuesto = subtotalDescuento * 0.16;

        //Calculo total con impuestos
        double total = subtotalDescuento + impuesto;

        //IMPRIMIR TICKER
        System.out.printf("""
                %nTicket de Venta:
                ------------------
                Subtotal: $%.2f
                Descuento: $%.2f (%d%%)
                Impuesto(16%%): $%.2f
                Valor total a pagar: $%.2f
                """, subtotal, descuento, descuentoPorcentaje, impuesto, total);

    }
}
