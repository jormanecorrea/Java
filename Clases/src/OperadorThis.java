public class OperadorThis {
    int operando1, operando2;

    public OperadorThis(int operando1, int operando2) {
        //Atributo de la clase u objeto = Argumento recibido en el constructor
        this.operando1 = operando1; //this sirve para
        this.operando2 = operando2;
//      Aquí:
//      this.operando1 → atributo o metodo de la clase
//      operando1 → parámetro del constructor
    }


    void sumar(){
        int suma = operando1 + operando2;
        System.out.println(suma);
    }

    void restar(){
        int resta = operando1 - operando2;
        System.out.println(resta);
    }

    public static void main(String[] args) {
        var operacion = new OperadorThis(5, 7);
        operacion.sumar();
        operacion.restar();
    }





}
