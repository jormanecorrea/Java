package polimorfismo_animales.animales.animales;

import animales.Animal;

public class AnimalPolimorfismo {
    protected void hacerSonido(){
        System.out.println("E animal hace un sonido");
    }
}

class Perro extends AnimalPolimorfismo{
    @Override
    protected void hacerSonido(){
        System.out.println("El Perro Ladra");
    }
}

class Gato extends AnimalPolimorfismo{
    @Override
    protected void hacerSonido(){
        System.out.println("El Gato Maulla");
    }
}

class PruebaAnimal {

    //METODO POLIMORFICO
    static void imprimirSonido(AnimalPolimorfismo animalPolimorfismo){
        animalPolimorfismo.hacerSonido();
    }

    public static void main(String[] args) {
        //Objeto de la clase Padre Animal
        //var animal =  new AnimalPolimorfismo();
        //var animal  = new Perro();
        var animal = new Gato();
        imprimirSonido(animal);

    }
}

