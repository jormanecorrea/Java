import javax.sound.midi.Soundbank;
import java.util.Random;

public class NumeroAleatorios {
    public static void main(String[] args) {
        System.out.println("*** NUMEROS ALEATORIOS ***");
        var random = new Random();

        //Gnerar un numero aleatorio entre 0 y 9
        var numeroAleatorio = random.nextInt(10 );
        System.out.println("Numero Aleatorio entre 0 y 9 = " + numeroAleatorio);

        //Gnerar un numero aleatorio entre 1 y 10
        numeroAleatorio = random.nextInt(10) + 1 ;
        System.out.println("Numero Aleatorio entre 1 y 10 = " + numeroAleatorio);

        //Generar un numero FLOAT entre 0.0 y 1.0
        var floatAleatorio = random.nextFloat(); //Si no se asigna rango, Por defecto toma el rango entre 0.0 y 1.0
        System.out.printf("Float Aleatorio: %.2f%n", floatAleatorio);

        //Simular lanzamiento de un dado (1 -6)
        var dado = random.nextInt(6) + 1;
        System.out.println("Resultado lanzamiento dado = " + dado);

    }

}
