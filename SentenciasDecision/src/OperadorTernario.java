import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("*** OPERADOR TERNARIO ***");
        Scanner sc = new Scanner(System.in);
        //SINTAXIS:
        //condicion ? exp1 : exp2

        //Determinar si un numero es par o no
        System.out.print("Digite un numero: ");
        int numero = sc.nextInt();
        var resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("El numero es: " + resultado);

        //Calcular si es mayor de edad
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        String mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println("\nTienes: " + edad + ", " + mensaje);

        //Valor positivo, negativo o cero(Operador ternario anidado)
        numero = 0;
        resultado = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "cero";

        System.out.println("El numero es: " + resultado);



    }
}
