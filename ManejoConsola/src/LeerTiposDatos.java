import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        //LEER DISTINTOS TIPOS DE DATOS
        //Leer un tipo int

        var sc = new Scanner(System.in);
        System.out.print("Ingresa Tu edad: ");
        var edad = sc.nextInt();
        System.out.println("edad = " + edad);

        //Leer un tipo DOUBLE
        System.out.print("Ingresa Tu Altura: ");
        var altura = sc.nextDouble();
        System.out.println("altura = " + altura);
        sc.nextLine();

        //Leer un tipo STRING
        System.out.println("Ingresa tu nombre: ");
        var nombre = sc.nextLine();
        System.out.println("nombre = " + nombre);

        // ---------- CONVERSION DE DATOS
        System.out.println("Proporciona un valor entero: ");
        var enteroString = sc.nextLine();
        var entero = Integer.parseInt(enteroString);
        //var entero = Integer.parseInt(sc.nextLine()); --> Otra Opcion
        System.out.println("entero = " + entero);


        //Tipo Flotante
        System.out.println("Ingrese un valor flotante: ");
        var flotante = Float.parseFloat(sc.nextLine());
        System.out.println("flotante = " + flotante);

        //Double.parseDouble();
        //Boolean.parseBoolean();

    }
}
