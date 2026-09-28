package persona;

public class Persona {
    private static int contadorObjetosPersonas = 0;
    private int id;
    private String nombre;
    private String apellido;

    //METODO CONSTRUCTOR
    public Persona(String nombre, String apellido)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        //Incrementar el atributo Static cada que se crea un nuevo objeto
        //Persona.contadorObjetosPersonas++; --> Mas Practico Usar =
        //Asignamos el id Unico con ayuda del Id unico y usando PostIncremento
        this.id = ++ Persona.contadorObjetosPersonas;
        }
    public Persona() { } //METODO CONSTRUCTOR VACIO

    @Override
    public String toString() {
        return "Id Objeto: " + this.id
                + "\nNombre: " + this.nombre
                + "\nApellido: " + this.apellido
                + "\nDireccion de Memoria: " + super.toString();
    }

//    void mostrarPersona() {
//        System.out.println("Nombre: " + nombre);
//        System.out.println("Apellido: " + apellido);
//    }

    //GETTER
    public String getNombre() { return this.nombre; }
    public String getApellido() { return this.apellido; }
    public int getId() { return this.id; }

    //SETTER
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    //GETTER Variable Static
    public static int  getContadorObjetosPersonas()
    {
        return Persona.contadorObjetosPersonas;
    }


}