package ejerciciosPildora;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        int i = 2;
        int j = 3;
        System.out.println(i-j);
        System.out.println(i+j);
        System.out.println(i*j);
        System.out.println((double) i/j);

        /*Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        int pe = scan.nextInt();
        if (pe%2 == 0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar.");
        }*/

        System.out.println(i += 5);
        System.out.println(i -= 4);
        System.out.println(i *= 3);
        System.out.println(i /= 2);
    }
}
