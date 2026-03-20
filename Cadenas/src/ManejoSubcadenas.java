public class ManejoSubcadenas {
    public static void main(String[] args) {
        //TEMA de SUBCADENAS
        //Substring(inicio, fin(sin incluirlo))
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        //Subcadena - Imprime los primeros 4 caracteres: Hola
        var subcadena1 = cadena1.substring(0, 4);
        System.out.println("subcadena1 = " + subcadena1);
        
        //Var subcadena2 = cadena1.substring(5); Imprime desde el indice 5 hasta el final
        var subcadena2 = cadena1.substring(5, 10);
        System.out.println("subcadena2 = " + subcadena2);
        

    }
}
