package clase3;

import java.util.Scanner;

public class EjerciciosMetodos {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        bienvenida();

        /*el metodo o funcion calcularDoble retorna un numero entero
        ese numero lo almacena en la variable int doble
        luego, muestro el valor de la variable doble*/
        int doble = calcularDoble(3);
        System.out.println("El doble de 3 es "+ doble);

        numeroMayorA20(30);

        boolean esMayorDe18 = esMayorDeEdad(20);
        if(esMayorDe18 == true){
            System.out.println("La persona es mayor de edad!!");
        } else {
            System.out.println("La persona es menor de edad!!");
        }

        System.out.println("Ingrese un numero");
        int numero1 = input.nextInt();
        System.out.println("Ingrese otro numero");
        int numero2 = input.nextInt();
        int multiplicacion = multiplicar(numero1, numero2, 2);
        System.out.println("---> La multipllicacion es " + multiplicacion );

        int mayor = obtenerMayor(numero1, numero2);
        System.out.println("El mayor numero ingresado fue el " + mayor);

        finalizarPrograma();
    }

    public static void bienvenida() {
        System.out.println("Hola!! El programa ha comenzado!!");
    }

    public static int calcularDoble(int num) {
        return num*2;
    }

    //crear un metodo que imprima en pantalla un mensaje indicando
    // si el numero recibido por parametro es mayor a 20
    //sino, que indique que es menor a 20

    public static void numeroMayorA20(int numero){
        if(numero > 20){
            System.out.println("El numero es mayor a 20");
        }else{
            System.out.println("El numero es menor o igual a 20");
        }
    }

    public static boolean esMayorDeEdad(int unaEdad){
        if(unaEdad >= 18) {
            return true;
        }else
            return false;
    }

    //metodo que reciba dos numeros y retorne la multiplicacion de los mismos..
    public static int multiplicar(int num1, int num2){
        System.out.println("Se multiplicarn 2 numeros");
        int multiplicacion = num1 * num2;
        return multiplicacion;
    }

    //metodo que reciba dos numeros y retorne la multiplicacion de los mismos..METODO DUPLICADO CON OTRO PARAMETRO
    public static int multiplicar(int num1, int num2, int num3){
        System.out.println("Se multiplicarn 3 numeros");
        int multiplicacion = num1 * num2 * num3;
        return multiplicacion;
    }

    //metodo que retorne el mayor de dos numeros
    public static int obtenerMayor (int numero1, int numero2){
        if(numero1 > numero2){
            return numero1;
        } else {
            return numero2;
        }
    }

    public static void finalizarPrograma() {
        System.out.println("El programa ha finalizado!!");
    }
}
