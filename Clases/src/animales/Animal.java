package animales;

public class Animal {
    //METODOS:
    //Protected: Solo es accesible por las clases hijas pero no desde otras clases
    protected void comer(){
        System.out.println("Como muchas veces al dia");
    }
    protected void dormir(){
        System.out.println("Duermo muchas horas");
    }

}
// CLASE HIJA DE LA CLASE ANIMAL
class Perro extends Animal {
    protected void ladrar(){
        System.out.println("Puedo Ladrar");
    }

    //Sobreescritura del metodo heredado de la clase padre Animal
    @Override //Significa
    protected void dormir(){
        System.out.println("Duermo 8 horas al dia");
        System.out.println("Metodo de la clase Padre: ");
        super.dormir(); //Accede al metodo de la clase Padre
    }

}

class PruebaAnimal {
    public static void main(String[] args) {
        System.out.println(" *** EJEMPLO HERENCIA ***");
        System.out.println("Soy un Animal");
        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();
        // animal1.Ladrar(); --> Este metodo no existe en la clase padre

        System.out.println("\nClase hija: Soy un Perro");
        var perro1 = new Perro();
        perro1.ladrar(); //Metodo de la clase hija
        perro1.dormir(); //Metodo de la cls Padre Sobreescrito en la cls Hija
        perro1.comer(); // Metodo de la clase padre

    }
}

