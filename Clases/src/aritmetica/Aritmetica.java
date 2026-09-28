package aritmetica;

public class Aritmetica {
    //ATRIBUTOS DE LA CLASE ARITMETICA
   private int operando1;
   private int operando2;

    // METODO CONSTRUCTOR
    // REGLAS:
    // 1. Debe llamarse igual que la clase
    // 2. No tiene tipo de retorno, ni siquiera lleva la palabra void
    // Constructor Vacio, se crea automaticamente si no se crea constructor con retorno
    public Aritmetica(int operando1, int operando2) {
        // ATRIBUTOS DE LA CLASE = PARAMETROS RECIBIDOS
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public Aritmetica() {

    }

   //METODOS DE LA CLASE ARITMETICA
   public void sumar(){
       int resultado = operando1 + operando2;
       System.out.println("Resultado de la Suma: " + resultado);

   }
    public void restar(){
       int resultado = operando1 - operando2;
        System.out.println("Resultado de la Resta: " + resultado);
    }

    //GETER Y SETER
    public int getOperando1() {
        //This = Este es un atributo de nuestra clase
        return this.operando1;
    }
    public void setOperando1(int operando1) {
        //Atributo Operando 1 de la clase y modificamos la variable local con el parametro recibido
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return this.operando2;
    }
    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }

}
