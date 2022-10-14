package ejerciciosPildora;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Introduce tu aficion");
        Scanner scan = new Scanner(System.in);
        String aficion = scan.nextLine();
        System.out.println("Introduce tu nivel, siendo este principiante, amateur o profesional");
        String nivel = scan.nextLine();
        while((!nivel.equalsIgnoreCase("principiante") && !nivel.equalsIgnoreCase("amateur") && !nivel.equalsIgnoreCase("profesional"))){
            System.out.println("Introduce un nivel entre principiante, amateur y profesional");
            nivel = scan.nextLine();
        }
        System.out.println("Tu aficion es " + aficion + " y tu nivel es " + nivel);
    }
}
