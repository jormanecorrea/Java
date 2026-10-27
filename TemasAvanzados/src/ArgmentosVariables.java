public class ArgmentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(1, 2, 3, 4, 5, 6, 7); //var args -> Argumentos
        variosParametros("Karla", 10, 20, 5);
    }
    //Los argumentos variables (...) deben ir al final del metodo
    static void variosParametros(String nombre, int... numeros) {
        System.out.print("Nombre: " + nombre);
        imprimirNumeros(numeros);
    }

    // ... (Tres Puntos) Significa que se crea un arreglo de manera interna
    static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++)
            System.out.print(numeros[i] + " ");
        //


    }
}
