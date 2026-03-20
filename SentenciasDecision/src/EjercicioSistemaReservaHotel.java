import java.util.Scanner;

public class EjercicioSistemaReservaHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //CONSTANTES - TARIFAS
        final double CUARTO_SIN_VISTA_MAR = 150.50;
        final double CUARTO_CON_VISTA_MAR = 190.50;

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Dias de estadia: ");
        int dias = Integer.parseInt(sc.nextLine());

        System.out.print("Cuarto con vista al mar?: ");
        boolean cuartoConVistaMar = Boolean.parseBoolean(sc.nextLine());

        //double total = (cuartoConVistaMar) ? CUARTO_CON_VISTA_MAR * dias : CUARTO_SIN_VISTA_MAR * dias;
        double total;
        if(cuartoConVistaMar){
            total = dias * CUARTO_CON_VISTA_MAR;
        } else{ total = dias * CUARTO_SIN_VISTA_MAR; }

        System.out.printf("""
                %nUsuario: %s
                Dias de estadia: %d
                Total a pagar: %.2f
                Cuarto con vista: %s
                """, nombre, dias, total, cuartoConVistaMar ? "Si 😊" : "No 😒");



    }
}
