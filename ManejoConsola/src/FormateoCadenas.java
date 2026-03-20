public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("*** FORMATEO DE CADENAS ***");
        String nombre = "Matias";
        int edad = 35;
        float salario = 21000.50F;

        // METODOS:
        // String.format
        String mensaje = String.format("Nombre: %s, Edad: %d, Salario: %.2f", nombre, edad, salario);
        System.out.println(mensaje);

        //printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: %.2f", nombre, edad, salario);
        var numeroEmpleado = 12;
        //Formteo con text block
        //Formato %04d --> 0 - numeros a agregar a la izquierda - 4 cantidad minima de digitos a la izquierda - d double
        mensaje = """
                 %nDetalle Persona:\s
                 --------------------
                 \tNombre: %s
                 \tEdad: %d años
                 \tNo. Empleado: %04d
                 \tSalario $%.2f
                 """.formatted(nombre, edad, numeroEmpleado, salario);
        System.out.println(mensaje);

        //Formateo con text block y printf directamenet
        System.out.printf("""
                 %nDetalle Persona:\s
                 --------------------
                 \tNombre: %s
                 \tEdad: %d años
                 \tNo. Empleado: %04d
                 \tSalario $%.2f
                 """, nombre, edad, numeroEmpleado, salario);




    }
}
