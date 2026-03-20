import java.util.Scanner;

public class ElMayorDeDosNumeros {
    public static void main(String[] args) {
        System.out.println("*** EJERCICIO EL MAYOR DE DOS NUMEROS ***");
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int n1 = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        int n2 = Integer.parseInt(sc.nextLine());

        if(n1 > n2)
            System.out.println("El numero mayor es: "+n1);
        else
            System.out.println("El numero mayor es: "+n2);



    }
}
