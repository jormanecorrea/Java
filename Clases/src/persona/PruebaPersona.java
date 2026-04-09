package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("CREACION DE CLASE Y OBJETOS DE TIPO PERSONA");

        //OBJETO 1
        System.out.println("OBJETO 1:");
        var objeto1 = new Persona();
        objeto1.nombre = "Layla";
        objeto1.apellido = "Acosta";
        objeto1.email = "objeto1@email.com";
        objeto1.celular = "123456789";
        objeto1.mostrarPersona();

        //OBJETO 2
        System.out.println("\nOBJETO 2:");
        var objeto2 = new Persona();
        objeto2.nombre = "Ian";
        objeto2.apellido = "Gomez";
        objeto2.email = "objeto2@email.com";
        objeto2.celular = "987654321";
        objeto2.mostrarPersona();

    }
}
