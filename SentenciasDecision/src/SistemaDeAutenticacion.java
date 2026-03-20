import java.util.Scanner;

public class SistemaDeAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** SISTEMA DE AUTENTICACION ***");
        Scanner sc  = new Scanner(System.in);

        final String USUARIO_COORECTO = "juan";
        final String PASSWORD_CORRECTO = "123456";

        System.out.print("Ingrese su usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String password = sc.nextLine();

        if (usuario.equals(USUARIO_COORECTO) && password.equals(PASSWORD_CORRECTO)) {
            System.out.println("'Bienvenido a Sistema'");
        } else if (usuario.equals(USUARIO_COORECTO)) {
            System.out.println("Contraseña incorrecta");
        } else if (password.equals(PASSWORD_CORRECTO)) {
            System.out.println("Usuario incorrecto");
        } else {
            System.out.println("Usuario y contraseña incorrectos");
        }

    }
}
