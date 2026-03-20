import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("*********SISTEMA EMPLEADOS***********");
        var sc = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        var nombre = sc.nextLine();

        System.out.print("Ingresa tu edad: ");
        var edad = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese salario: ");
        var salario = Double.parseDouble(sc.nextLine());

        System.out.print("Es Jefe de Departamento: ");
        var esJefe = Boolean.parseBoolean(sc.nextLine());

        System.out.println("\nDatos del Empleado");
        System.out.println("\tNombre: " + nombre);
        System.out.println("\tEdad: " + edad + "años");
        //System.out.println("\tSalario = " + salario);
        System.out.printf("\tSalario: $%.2f%n", salario);
        System.out.println("\tEs Jefe departamento: " + esJefe);

    }
}
