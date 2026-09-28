package animales;
//CLASE PADRE
public class Animal {
    //Protected: Modificador de acceso, que indica que solo puede ser accedido por las clases hijas
    protected void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }

}
// CLASE HIJA - PERRO -> Se usa extends para indicar que es una clase heredada
class Perro extends Animal{
    //@Override: indica que el metodo está sobrescribiendo un metodo que ya existe en la clase padre.
    @Override
    protected void hacerSonido(){
        System.out.println("El perro ladra");
    }
}

class Gato extends Animal{
    @Override
    protected void hacerSonido(){
        System.out.println("El gato Maulla");
    }
}


class PruebaAnimal{

    //Metodo Polimorfico:
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        //OBjeto de la clase Padre(Animal)
        var animal = new Animal();
        imprimirSonido(animal);

        var perro = new Perro();
        imprimirSonido(perro);

        var gato = new Gato();
        imprimirSonido(gato);

    }
}