public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        //Reemplazar subcadenas
        var cadena = "Hola Mundo";
        System.out.println("cadena = " + cadena);

        //Reemplazar subcadena Mundo por "A TODOS"
        var nuevaCadena = cadena.replace("Mundo", "a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);
        
        //Reemplazar "Hola" por "Adios"
        var nuevaCadena2 = cadena.replace("Hola", "Adios");
        System.out.println("nuevaCadena2 = " + nuevaCadena2);
    }
}
