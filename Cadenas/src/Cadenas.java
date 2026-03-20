public class Cadenas {
    public static void main(String[] args) {
        System.out.println("***MANEJO DE CADENAS");
        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);
        var cadena2 = new String("Mundo");
        System.out.println("cadena2 = " + cadena2);
        var cadena3 = cadena1 + " " + cadena1;
        System.out.println("cadena3 = " + cadena3);

        //CADENA MULTIPES LINEAS
        var cadena4 = """
                
                Estes es un texto
                multilinea
                """;
        System.out.println("cadena4 = " + cadena4);
    }
}
