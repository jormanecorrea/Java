package persona;

public class Persona {
    //ATRIBUTOS PRIVADOS
    private String nombre;
    private String apellido;
    private String email;
    private int edad;

    //METODO CONSTRUCTOR
    public Persona(String nombre, String apellido, int edad, String email ){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
    }

    //METODO MOSTRARPERSONA
    public void mostrarPersona(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Email: " + this.email);
        System.out.println("Celular: " + this.edad);
        System.out.println();
    }

    //ENCAPSULAMINETO
    // ************* GETTERS *************
    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getEmail() {
        return this.email;
    }

    // ************* SETTERS *************
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

