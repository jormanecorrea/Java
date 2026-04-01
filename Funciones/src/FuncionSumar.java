public class FuncionSumar {
    //Definir Funcion

    static  int sumar(int a, int b){
        int resultado = a + b;
        return resultado;
    }

    public static void main(String[] args) {
        int argumento1 = 8, argumento2 = 8;
        int resultado_funcion =  sumar(argumento1, argumento2);
        System.out.println("El resultado es: " + resultado_funcion);

        argumento1 = 30;
        argumento2 = 10;
        System.out.println("El resultado es: " + sumar(argumento1, argumento2));

    }

}
