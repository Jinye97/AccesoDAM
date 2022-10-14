package ejerciciosPildora;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = scanner.nextLine();
        System.out.println("Introduce tu apellido");
        String apellido = scanner.nextLine();
        System.out.println("Hola " + nombre + " " + apellido);
    }
}
