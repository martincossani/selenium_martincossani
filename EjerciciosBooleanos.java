package clase3;

import java.util.Scanner;

public class EjerciciosBooleanos {

    public static void main(String arss[]){

        System.out.println("Bienvenido al programa");
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        int edad = input.nextInt();

        /*boolean esMayorDeEdad = false;
        if(edad >= 18){
            esMayorDeEdad == true;
        }

        if (esMayorDeEdad ==true){
            System.out.println("Ed. es mayor de edad");
        } else {
            System.out.println("Ud. Es menor de edad!!");
        }*/


        //se pide identificar si se ingreso enl nro 5
        // en una cantidad indefinida de numeros a ser ingresados
        //se termina de pedir numeros cuando se ingresa el 0

        System.out.println("Ingrese numeros hasta que se digite el 0");
        int num = -1;

        //banderas booleanas
        boolean seIngresoElCinco = false;

        while (num != 0){
            System.out.println("Ingrese un numero");
            num = input.nextInt();
            if(num == 5){
                seIngresoElCinco = true;
            }
        }

        if (seIngresoElCinco == true){
            System.out.println("Se ingeso el nro 5");
        }else {
            System.out.println("No se ingreso el 5");
        }
        System.out.println("El programa ha finalizado!");
    }

}
