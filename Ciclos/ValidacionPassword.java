import java.util.Scanner;

public class ValidacionPassword {
    public static void main(String[] args) {
        System.out.println("*** CREACION Y VALIDACION PASSWORD ***");
        Scanner sc = new Scanner(System.in);
        final int LONGITUD_MAX = 6;
        boolean passwordCorrecto = true;
        String password = "";



        while (passwordCorrecto) {
            System.out.print("Ingrese el password: ");
            password = sc.nextLine();
            if (password.length() < LONGITUD_MAX)
                System.out.println("El password debe tener almenos 6 caracteres");
            else
                passwordCorrecto = false;

        }

        System.out.println("Password creado correctamente");




    }
}
