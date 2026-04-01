public class IntroduccionFunciones {

    // void: Indica que el metodo ejecuta una acción, pero NO devuelve ningún dato como resultado.
    // static: Indica que el metodo pertenece a la clase, por lo que se puede usar sin crear un objeto (sin usar 'new').
    //No se agrega PUBLIC ya que no se va a llamar desde otros archivos
    static void saludar(String mensaje){
        System.out.println("El mensaje es: "+ mensaje); //Parametro: Informacion que se recibe
    }

    public static void main(String[] args) {
        saludar("Hola"); //Argumento: Informacion enviada la funcion
    }
}
