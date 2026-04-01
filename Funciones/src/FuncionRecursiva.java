public class FuncionRecursiva {
    //FUNCION RECURSIVA: Se llama a si misma hasta llegar a su caso Base
    static void funcionRecursiva(int numero){
        //Caso Base
        if (numero == 1)
            System.out.println(numero + " ");
        else {
            //Caso recursivo
            funcionRecursiva(numero - 1); //Se reduce el valor de numero
            System.out.println(numero + " ");
        }

    }

    public static void main(String[] args) {
        funcionRecursiva(5);

    }
}
