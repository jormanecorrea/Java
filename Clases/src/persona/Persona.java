package persona;

public class Persona {
    //ATRIBUTOS PRIVADOS
    private String nombre;
    private String apellido;
    private String email;
    private int edad;

    //METODO CONSTRUCTOR
    public Persona(String nombre, String apellido, int edad, String email ){}

    //METODO MOSTRARPERSONA
    void mostrarPersona(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Email: " + email);
        System.out.println("Celular: " + edad);
    }




}

