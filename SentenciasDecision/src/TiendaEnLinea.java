import java.util.Scanner;

public class TiendaEnLinea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el monto de la compra: ");
        double monto = Double.parseDouble(sc.nextLine());

        System.out.print("Es miembro?: ");
        String esMiembro = sc.nextLine();

        double descuento = 0;

         if(monto > 1000 && esMiembro.equals("Si")){
             descuento = monto*0.10;
             System.out.println("Felicidades has recibido un descuento del 10%");
         } else if(esMiembro.equals("Si")){
             descuento = monto*0.05;
             System.out.println("Felicidades has recibido un descuento del 5%");
         } else{
             descuento = 0;
             System.out.println("Lo invitamos a ser miembro de nuestra tienda");
         }

         double montoFinal = monto - descuento;

        System.out.printf("""
                %nFactura de compra
                -------------------
                Monto de la compra: $%.2f
                Monto del decuento: $%.2f
                Monto final de la compra con descuento: $%.2f
                """, monto, descuento, montoFinal);




    }
}
