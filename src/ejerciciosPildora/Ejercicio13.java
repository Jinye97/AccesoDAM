package ejerciciosPildora;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        String st = String.valueOf(3);

        String nombre = "Jinye";
        System.out.println(nombre.charAt(3));

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca un caracter");
        String sg = scan.nextLine();
        if (sg.length() == 1){
            char c = sg.charAt(0);
        }else{
            System.out.println("No has introducido un caracter");
        }
    }
}
