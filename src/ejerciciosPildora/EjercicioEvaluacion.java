package ejerciciosPildora;

import java.util.Scanner;

public class EjercicioEvaluacion {
    //Real Madrid
    //String nombreCurso
    //Devuelve un error de variable no inicializada
    //int personaId
    //Error

    //int
    //-32768 a 32768
    //8
    //32
    //double
    //32
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Indica el identificador del equipo:");
        int identificador = scan.nextInt();
        scan.nextLine();
        System.out.println("Nombre del equipo de futbol");
        String nombre = scan.nextLine();
        System.out.println("Presupuesto:");
        double d = scan.nextDouble();
        scan.nextLine();
        System.out.println("¿Tiene champions?");
        String respuesta = scan.nextLine();
        boolean b;
        if (respuesta.equalsIgnoreCase("si")){
            b = true;
        }else{
            b = false;
        }
        System.out.println(nombre + " #" + identificador);
        System.out.println("Presupuesto: " + d + "€");
        System.out.println("Champions: " + b);
    }
}
