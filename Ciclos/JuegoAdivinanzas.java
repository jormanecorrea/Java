import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
    public static void main(String[] args) {
        System.out.println("*** Bienvenido a Juego de Adivinanzas ***");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        final int MAXIMO_INTENTOS = 3;
        int intentos = 0, numero = 0;
        int numeroSecreto = random.nextInt(11) + 1;



        while (numero != numeroSecreto && intentos < MAXIMO_INTENTOS ) {
            System.out.print("Ingresa un numero entre 1 y 10: ");
            numero = sc.nextInt();

            if (numero > numeroSecreto) {
                System.out.println("No has adivinado el numero, intenta con un numero menor");
            } else if (numero < numeroSecreto) {
                System.out.println("No has adivinado el numero, intenta con un numero mayor");
            }

            intentos++;
        }

        if (intentos == MAXIMO_INTENTOS) {
            System.out.println("Felicidades, adivinaste");
        }



    }
}
