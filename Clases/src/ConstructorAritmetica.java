public class ConstructorAritmetica {
    int operando1, operando2;

    //CREAR CONSTRUCTOR:
    // 1. public - Es opcional
    // 2. Debe llamarse igual que la clase
    // 3. No inica ingun tipo de retorno
    // Si hay más de un constructor se llama sobre carga de constructores

    //CONSTRUCTOR VACIO - Se puede llamar ahora
    public ConstructorAritmetica(){ //Recibe Parametros

    }

    //Si se declara un Const con parametros ya no se puede generar el const vacio de manera automatica
    public ConstructorAritmetica(int op1, int op2){ //Recibe Parametros
        operando1 = op1;
        operando2 = op2;
    }

    //METODO 1
    void sumar() {
        var suma = operando1 + operando2;
        System.out.println("El resultado de la suma es: " + suma);
    }
    //METODO 2
    void restar() {
        var resta = operando1 - operando2;
        System.out.println("El resultado de la resta es: " + resta);
    }

    public static void main(String[] args) {
        System.out.println("EJEMPLO CLASE ARITMETICA USANDO CONTRUCTOR");

        //--------- Constructor con Parametros
        //Se envia los parametros de 5 y 7 al metodo constructor Aritmetica
        System.out.println("\nCONSTRUCTOR CON PARAMETROS");
        var constructorAritmetica = new ConstructorAritmetica(5, 7); //Se crea constructor interno de forma automatica

        constructorAritmetica.sumar();
        constructorAritmetica.restar();

        //--------- Constructor Vacio: Sin Argunmentos
        //Toma los valores de los parametros por default
        System.out.println("\nCONSTRUCTOR VACIO");
        var constructorVacioAritmetica = new ConstructorAritmetica();

        constructorVacioAritmetica.operando1 = 12;
        constructorVacioAritmetica.operando2 = 8;

        constructorVacioAritmetica.sumar();
        constructorVacioAritmetica.restar();
    }


}
