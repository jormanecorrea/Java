public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        //MAS FORMAS DE CONCATENAR EN JAVA
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = (cadena1 + " " + cadena2);


        //METODO Concat
        cadena3 = cadena1.concat(" ").concat("Mundo");
        cadena3 = cadena1.concat(" ").concat(cadena2);
        System.out.println("cadena3 usando concat = " + cadena3);
        
        //StringBuilder
        var constructorDeCadenas = new StringBuilder();
        constructorDeCadenas.append(cadena1);
        constructorDeCadenas.append(" ");
        constructorDeCadenas.append(cadena2);
        //constructorDeCadenas.append(cadena1).append(" ").append(cadena2) - Otra forma
        var resultado = constructorDeCadenas.toString();
        System.out.println("resultado StringBuilder = " + resultado);

        //StringBuffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("resultado stringBuffer = " + stringBuffer);

        //Join
        //resultado = String.join(delimitador, cadena1, cadena2...,cadenaN)
        resultado = String.join(" ", cadena1, cadena2, "Adios");
        System.out.println("resultado join = " + resultado);

    }
}
