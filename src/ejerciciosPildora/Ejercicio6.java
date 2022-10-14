package ejerciciosPildora;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = scan.nextLine();
        System.out.println("Introduce tu apellido");
        String apellido = scan.nextLine();
        System.out.println("Hola " + nombre + " " + apellido);
    }
}
