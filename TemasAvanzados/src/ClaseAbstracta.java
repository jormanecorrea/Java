public class ClaseAbstracta {
    public static void main(String[] args) {
        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();

        figuraGeometrica = new Circulo();
        figuraGeometrica.dibujar();
    }
}

// CLASE ABSTRACTA
// No se puede Instanciar (Crear Objetos a partir de la clase)
abstract class FiguraGeometrica{
    public abstract void dibujar();
}

class Rectangulo extends FiguraGeometrica{
    @Override
    public void dibujar(){
        System.out.println("Se dibuja un Rectangulo");
    }
}

class Circulo extends FiguraGeometrica{
    @Override
    public void dibujar(){
        System.out.println("Se dibuja un Circulo");
    }
}