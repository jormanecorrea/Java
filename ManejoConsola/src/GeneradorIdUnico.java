import java.util.Random;
import java.util.Scanner;

public class GeneradorIdUnico {
    public static void main(String[] args) {
        var random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su Apellido: ");
        String apellido = sc.nextLine().substring(0,2).toUpperCase();

        System.out.print("Ingrese su año de nacimiento (AAAA): ");
        String anioNacimiento = sc.nextLine().substring(2).toUpperCase(); //substring(2) -> Apartir del digito 2 toma los caracteres

        String nombre2 = nombre.trim().toUpperCase().substring(0,2);
        Integer numeroAleatorio = random.nextInt(9999) + 1;

        //FORMATO 4 DIGITOS
        String numeroAleatorioFormato = String.format("%04d", numeroAleatorio);

        //GENERAR ID UNICO:
        var idUnico = nombre2 + apellido + anioNacimiento + numeroAleatorioFormato;

        System.out.printf("""
                %nHola %s,
                \tTu nuevo ID generado Automaticamente es:
                \t%s
                \tFelicidades !
                """, nombre,  idUnico);
    }
}
