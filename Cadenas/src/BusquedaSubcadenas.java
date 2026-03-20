public class BusquedaSubcadenas {
    public static void main(String[] args) {
        //BUSCAR SUBCADENAS
        //FUNCION IndexOf - Devuelve el indice de la primera aparicion de la subcadena
        var cadena1 = "Hola Mundo";
        //Subcadena a buscar "HOLA"
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);
        
        //METODO: lastIndexOf - devuelve el indice de la ultima aparicion de la subcadena
        //Subcadena de Mundo
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);
        //Subcadena no encontrada devuelve -1
        var indice3 = cadena1.indexOf("Java");
        System.out.println("indice3 = " + indice3);
        
        
    }
}
