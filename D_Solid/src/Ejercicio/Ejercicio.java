/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio;

import java.util.Scanner;

/**
 *
 * @author labesp
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        LibroFisico fisico = new LibroFisico();
        LibroDigital digital = new LibroDigital();

        int op;

        do {

            System.out.println("----- MENU -----");
            System.out.println("1. Ingresar Libro Fisico");
            System.out.println("2. Ingresar Libro Digital");
            System.out.println("3. Guardar Libro Fisico");
            System.out.println("4. Guardar Libro Digital");
            System.out.println("5. Mostrar Informacion");
            System.out.println("6. Salir");
            System.out.print("Opcion: ");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1 -> {
                    fisico = new LibroFisico();

                    System.out.print("Titulo: ");
                    fisico.setTitulo(sc.nextLine());

                    System.out.print("Autor: ");
                    fisico.setAutor(sc.nextLine());
                }

                case 2 -> {
                    digital = new LibroDigital();

                    System.out.print("Titulo: ");
                    digital.setTitulo(sc.nextLine());

                    System.out.print("Autor: ");
                    digital.setAutor(sc.nextLine());
                }

                case 3 -> {
                    IGuardarBD guardar = new GuardarMySQL();
                    LibroService servicio = new LibroService(guardar);
                    servicio.procesarLibro(fisico);
                }

                case 4 -> {
                    IGuardarBD guardar = new GuardarMongoDB();
                    LibroService servicio = new LibroService(guardar);
                    servicio.procesarLibro(digital);
                }

                case 5 -> {
                    fisico.mostrarDatos();
                    digital.mostrarDatos();
                }

                case 6 -> System.out.println("Saliendo del programa...");

                default -> System.out.println("Opcion no permitida");
            }

        } while (op != 6);

        sc.close();
    
    }
    
}
