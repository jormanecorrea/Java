import java.util.Scanner;

public class AplicacionCajeroAutomatico {
    public static void main(String[] args) {
        System.out.println(" *** Aplicacion Cajero Automatico ***");
        Scanner sc = new Scanner(System.in);
        double  saldo  = 1000.00;
        boolean salir = false;

        while (!salir){
            System.out.print("""
                    MENU PRINICPAL:
                    1. Consultar saldo
                    2. Retirar dinero
                    3. Depositar dinero
                    4. Salir
                    
                    Seleccione una opcion:\s""");

            int opcion = sc.nextInt();

            switch (opcion){
                case 1 -> System.out.printf("\nTu saldo actual es: %.2f%n%n", saldo);
                case 2 -> {
                    System.out.print("\nIngresa el valor a retirar: ");
                    double valorRetiro = sc.nextDouble();
                    if(valorRetiro > saldo)
                        System.out.println("Saldo insuficiente\n");
                    else {
                        saldo -= valorRetiro; //saldo = saldo - retiro
                        System.out.printf("Tu nuevo saldo es: %.2f%n%n", saldo); //%n%n Doble espacio en blanco
                    }
                }
                case 3 -> {
                    System.out.print("\nIngresa el valor a consignar: ");
                    double valorDeposito = sc.nextDouble();
                    saldo += valorDeposito;
                    System.out.printf("Tu nuevo saldo es: %.2f%n%n", saldo);
                }
                case 4 -> {
                    System.out.println("Saliendo del sistema");
                    salir = true;
                }
                default -> System.out.println("Ingreso un valor incorrecto");
            }
        }



    }
}
