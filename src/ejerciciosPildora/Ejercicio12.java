package ejerciciosPildora;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println(Byte.parseByte("2"));
        System.out.println(Integer.parseInt("256"));

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        String st = scan.nextLine();
        if (esNumerico(st)){
            System.out.println(Integer.parseInt(st)*5);
        }else{
            System.out.println("Lo introducido no es un número");
        }


    }

    public static boolean esNumerico(String st){
        try{
            Integer.parseInt(st);
            return true;
        }catch (NumberFormatException numberFormatException){
            return false;
        }
    }
}
