import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String user = "Jorman";
        final String password = "123***";

        System.out.print("Digite su usuario: ");
        String usuarioProporcionado = sc.nextLine();

        System.out.print("Digite su contraseña: ");
        String passwordProporcionado = sc.nextLine();

        //Validamos si coinciden
        boolean estaAutenticado = user.equals(usuarioProporcionado) && password.equals(passwordProporcionado);
        System.out.println("Usuario y contraseña correctos: "+ estaAutenticado);
    }
}
