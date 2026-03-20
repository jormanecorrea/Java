import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        //RECETA DE COCINA
        System.out.println("*********** RECETA DE COCINA ***********");
        var sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la receta: ");
        var nombreReceta = sc.nextLine();

        System.out.print("Ingrese los Ingredientes: ");
        var ingredientesReceta = sc.nextLine();

        System.out.print("Ingrese cantidad(gr): ");
        var cantidad = Double.parseDouble(sc.nextLine());

        System.out.print("Tiempo de preparacion en minutos: ");
        var tiempoPreparacion = Integer.parseInt(sc.nextLine());

        System.out.print("Dificultad: ");
        var dificultad = sc.nextLine();

        System.out.println("\nReceta:");
        System.out.println("\tNombre de la receta: " + nombreReceta);
        System.out.println("\tIngredientes: " + ingredientesReceta);
        System.out.printf("\tCantidad en gramos: %5f%n", cantidad, " gramos");
        System.out.println("\tTiempo de preparacion(minutos): " + tiempoPreparacion + " minutos");
        System.out.println("\tDificultad: " + dificultad);


    }
}
