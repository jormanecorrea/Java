public interface Traductor {
    //publicos y abstractos
    //Una Interfaz no puede ser Instanciada ya que tiene metodos abstractos
    void traducir();

    //Metodos con Implementacion
    default void iniciarTraductor(){
        System.out.println("Iniciando traductor...");
    }
}

class Ingles implements Traductor{
    @Override
    public void traducir(){
        System.out.println("Traduzco al Ingles");
    }
}
class Frances implements Traductor{
    @Override
    public void traducir(){
        System.out.println("Traduzco al Frances");
    }
    @Override
    public void iniciarTraductor(){
        System.out.println("\nIniciando traductor en Frances");
    }
}

class PruebaTraductor{
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();

        //Traductor en Frances
        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();

    }
}
