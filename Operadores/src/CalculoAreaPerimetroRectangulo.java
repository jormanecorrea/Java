import java.util.Scanner;

public class CalculoAreaPerimetroRectangulo {
    public static void main(String[] args) {
        System.out.println("*** EJERCICIO CALCULAR AREA Y PERIMETRO RECTANGULO ***");
        Scanner sc = new Scanner(System.in);
        //BASE
        System.out.println("Ingrese los siguientes Valores");
        System.out.print("Base del rectangulo: ");
        int base = Integer.parseInt(sc.nextLine());
        //ALTURA
        System.out.print("Altura del rectangulo: ");
        int altura = Integer.parseInt(sc.nextLine());

        final int areaRectangulo = base * altura;
        final int perimetroRectangulo = 2 * (base + altura);

        System.out.printf("""
                %nCalculo Area y Perimetro Rectangulo:
                --------------------------------------
                Area del rectangulo: %d
                Perimetro rectangulo: %d
                """, areaRectangulo, perimetroRectangulo);

    }
}
