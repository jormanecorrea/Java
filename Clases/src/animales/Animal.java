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

class Perro extends Animal {
    protected void ladrar(){
        System.out.println("Puedo Ladrar");
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
        perro1.ladrar();

    }
}

