import java.util.Scanner;

public class EjercicioValorEnRango {
    public static void main(String[] args){
        System.out.println("*** EJERCICIO VALOR DENTRO DE RANGO: AND ***");
        Scanner sc = new Scanner(System.in);
        //DEFINIMOS LIMITES
        final int minimo = 0;
        final int maximo = 5;

        //Solicitar un valor
        System.out.print("Digite o valor entre 1 e 5: ");
        int dato = Integer.parseInt(sc.nextLine());
        //Verificar si variable esta en rango
        boolean estaEnRango = dato >= minimo && dato <= maximo;
        System.out.println("El dato esta en el rango = " + estaEnRango);



    }
}
