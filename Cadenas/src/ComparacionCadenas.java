public class ComparacionCadenas {
    public static void main(String[] args) {
        //COMPARACION DE CADENAS - POOL DE CADENAS
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java"); //Este genera una referencia diferente
        //Comparacion de cadenas (==) comparan la referencia en memoria
        System.out.print("Cadena1 es igual en referenia a la Cadena2: ");
        System.out.println(cadena1 == cadena2);
        //Comparamos cadena 1 con cadena3(referencias)
        System.out.print("Cadena1 es iguan en referencia a Cadena3: ");
        System.out.println(cadena1 == cadena3);

        //Comparar CONTENIDO usando metodo EQUALS
        System.out.print("Cadena1 es iguan en contenido a Cadena3: ");
        System.out.println(cadena1.equals(cadena3));
    }
}
