import java.util.Scanner;

public class FuncionPar {

    //FUNCIONA PARA SABER SI ES UN NUMERO PAR
     static boolean esPar(int numero){
         //return (numero % 2 == 0)? true : false
         return numero % 2 == 0;
     }

    public static void main(String[] args) {
        System.out.print("Ingresa u numero: ");
         int numero = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Es numero par ?: " + esPar(numero));
    }
}
