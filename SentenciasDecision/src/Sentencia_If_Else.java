import java.util.Scanner;

public class Sentencia_If_Else {
    public static void main(String[] args) {
        //SENTENCIA IF ELSE
        System.out.println("*** USO DE LA SENTENCIA IF ELSE ***");
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua edad: ");
        int edad = Integer.parseInt(sc.nextLine());

        if(edad >=18) {
            System.out.println("Mayor de edad");
        } else  {
            System.out.println("Menor de edad");
        }

        //SENTECIA IF - ELSE IF - ELSE
        System.out.println("\n*** USO DE LA SENTENCIA IF - ELSE IF - ELSE ***");
        if (edad >=18){
            System.out.println("Mayor de edad");
        } else if (edad >= 13 && edad < 18 ) {
            System.out.println("Adolescente");
        } else {
            System.out.println("Menor de edad");
        }




    }
}
