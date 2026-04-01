import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println(" *** APLICACION CALCULADORA ***");
        Scanner sc = new Scanner(System.in);

        double valor1 = 0, valor2 = 0, resultado;
        boolean salir = false;
        while (!salir){

            System.out.print("""
                    Operaciones que puedes realizar
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    
                    Escoja una opcion:\s""");

            int opcion = sc.nextInt();

            if(opcion >= 1 && opcion <= 4) {
                System.out.print("\nIngrese el valor 1: ");
                valor1 = sc.nextDouble();

                System.out.print("Ingrese el valor 2: ");
                valor2 = sc.nextDouble();
            }

            switch (opcion) {
                //SUMA
                case 1 -> {
                    resultado = valor1 + valor2;
                    System.out.printf("El resultado suma: %.2f%n%n", resultado);
                }
                //RESTA
                case 2 -> {
                    resultado = valor1 - valor2;
                    System.out.printf("El resultado resta: %.2f%n%n", resultado);
                }
                //MULTIPLICACION
                case 3 -> {
                    resultado = valor1 * valor2;
                    System.out.printf("El resultado resta es: %.2f%n%n", resultado);
                }
                //DIVISION
                case 4 -> {

                    if (valor2 != 0) {
                        resultado = valor1 / valor2;
                        System.out.printf("El resultado division: %.2f%n%n", resultado);
                    } else
                        System.out.println("Error: division por 0");
                }
                //SALIR
                case 5 -> {
                    salir = true;
                    System.out.println("Saliendo de calculadora...\n");
                }
                default -> System.out.println("Seleccione una opcion correcta...\n");
            }
        }


    }
}
