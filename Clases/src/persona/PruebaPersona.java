package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        var persona1 = new Persona("Juan", "Perez", 18, "juanperez@correo.com");
        persona1.mostrarPersona();

        var persona2 = new Persona("Carmen", "Diaz", 29, "carmendiaz@correo.com");
        persona2.mostrarPersona();


    }
}
