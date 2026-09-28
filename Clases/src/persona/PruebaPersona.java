package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("Creacion de clases y objetos Persona");
        System.out.println("Variable Estatica Contador: " + Persona.getContadorObjetosPersonas());
        //OBJETO 1:
        var objeto1 = new Persona("Juan", "Peres");
        System.out.println(objeto1);
        System.out.println("Variable Estatica Contador: " + Persona.getContadorObjetosPersonas());
        //Se puede acceder al concepto Estatico desde el Objeto a la clase, Pero no es buena Practica
        //System.out.println("Variable Estatica Contador: " + objeto1.contadorObjetosPersonas);

        //OBJETO 2:
        var objeto2 = new Persona("Pedro", "Sanchez");
        System.out.println("\n" + objeto2);
        System.out.println("Variable Estatica Contador: " + Persona.getContadorObjetosPersonas());

    }
}
