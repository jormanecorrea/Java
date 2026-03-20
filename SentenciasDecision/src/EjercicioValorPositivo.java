import java.util.Scanner;

public class EjercicioValorPositivo {
    public static void main(String[] args) {
        System.out.println("*** EJERCICIO VALOR POSITIVO ***");
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = Integer.parseInt(sc.nextLine());

        if(numero > 0){
            System.out.println(numero + " Es positivo");
        } else if(numero < 0){
            System.out.println(numero + " Es negativo");
        } else {
            System.out.println("El numero es 0");
        }


    }
}
