public class MetodosDeCadenas {
    public static void main(String[] args) {
        //METODOS DE CADENAS
        var cadena1 = "Hola Mundo";
        
        //Obtener el largo de caracteres de una cadena
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);
        
        //Reemplazar caracteres
        var nuevaCadena = cadena1.replace('o','a');
        System.out.println("nuevaCadena = " + nuevaCadena);
        
        //Convertir a mayusculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        //Convertir a minusculas
        System.out.println("Minusculas = " + cadena1.toLowerCase());

        //Eliminar espacios al inicio y al final
        var cadena2 = " Prueba de Metodo Trim ";
        System.out.println("Cadena2 sin espacion con metodo trim = " +cadena2.trim());



    }
}
