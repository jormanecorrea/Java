public class ForEach {
    public static void main(String[] args) {
        System.out.println("*** CICLO FOREACH - Alternativa Recorrer Arrays");
            int edades[] = {5, 10, 30, 45};
            for(int edad : edades) {
                System.out.println("Edad: " + edad);
            }
    }
}
