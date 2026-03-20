import java.util.Scanner;

public class SistemaEnvios_Switch {
    public static void main(String[] args) {
        System.out.println("*** RETO SISTEMA DE ENVIOS ***");
        Scanner sc = new Scanner(System.in);

        final double TARIFA_NACIONAL = 10.0;
        final double TARIFA_INTERNACIONAL = 20.0;

        System.out.print("Indique el destino: ");
        String destino = sc.nextLine().strip().toLowerCase();

        System.out.print("Indique el peso del paquete en Kg: ");
        double peso = Double.parseDouble(sc.nextLine());

        double costoTarifa = switch (destino){
          case "nacional" -> peso * TARIFA_NACIONAL;
          case "internacional" -> peso * TARIFA_INTERNACIONAL;
          default -> {
              System.out.println("Ingrese un dato valido");
              yield 0;
          }
        };

        if (costoTarifa != 0)
            System.out.printf("""
                    %n DATOS DE ENVIO
                    -----------------
                    Destino: %s
                    Peso: %.2f
                    Costo: $%.2f
                    """, destino, peso, costoTarifa);



    }
}
