import java.util.Scanner;

public class EjercicioRangoVariable {
    public static void main(String[] args) {
        System.out.println("** EJERCICIO RANGO VARIABLE ***");
        Scanner sc = new Scanner(System.in);
        System.out.print("Proporciona un valor entero: ");
        int dato = Integer.parseInt(sc.nextLine());

        //Revisamos si esta en el rango entre 1 y 10
        boolean estaDentroRango = dato >= 1 && dato <= 10;
        System.out.println("Variable dentro de rango entre 1 y 10: " + estaDentroRango);

        //Revisar Logica inversa, si el dato esta fuera del rango
        boolean estaFueraDeRango = !(dato >= 1 && dato <= 10);
        System.out.println("Variable fuera de rango: " + estaFueraDeRango);



    }
}
