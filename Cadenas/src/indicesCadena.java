public class indicesCadena {
    public static void main(String[] args) {
        //MANEJO DE INDICES EN UNA CADENA
        var cadena1 = "Hola Mundo";
        
        //Recuperar primer caracter n1
        var primerCaracter = cadena1.charAt(0); //Esto debe tomas la letra H
        System.out.println("primerCaracter = " + primerCaracter);
        //Recuperar ultimo caracter n9
        char ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        //Recuperar letra M
        char letraM = cadena1.charAt(5);
        System.out.println("letraM = " + letraM);

    }
}
