/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package d_solid;

import java.util.Scanner;

/**
 *
 * @author labesp
 */
public class D_SOLID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Docente docente = new Docente();
        Administrativo a = new Administrativo();
        int op;
        do{
            System.out.println("---Menu de Opciones---");
            System.out.println("1. Ingresar Docente");
            System.out.println("2. Ingresar Administrativo");
            System.out.println("3. Guardar en la Base de Datos a Docente");
            System.out.println("4. Guardar en la Base de Datos a Administrativo");
            System.out.println("5. Mostrar Informacion");
            System.out.println("6. Salir");
            System.out.print("Ingrese la opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            switch(op){
                case 1 ->{
                    docente = new Docente();
                    System.out.println("Ingrese la inofrmacion del Docente: ");
                    System.out.print("Nombre: ");
                    docente.setNombre(sc.nextLine());
                    System.out.print("Departamento: ");
                    docente.setDepartamento(sc.nextLine());
                    
                }
                case 2 ->{
                    a = new Administrativo();
                    System.out.println("Ingrese la informacion del Administrativo: ");
                    System.out.print("Nombre: ");
                    a.setNombre(sc.nextLine());
                    System.out.print("Departamento: ");
                    a.setDepartamento(sc.nextLine());
                }
                case 3 ->{
                    IGuardarBD guardar = new GuardarMySQL();
                    EmpleadoService servicio = new EmpleadoService(guardar);
                    servicio.procesarEmpleado(docente);
                    
                }
                case 4 ->{
                    IGuardarBD guardar = new GuardarMongo();
                    EmpleadoService servicio = new EmpleadoService(guardar);
                    servicio.procesarEmpleado(a);
                }
                case 5 ->{
                    docente.mostrarDatos();
                    a.mostrarDatos();
                }
                case 6 ->{
                    System.out.println("Saliendo del programa...");
                }
                default ->{
                    System.out.println("Opcion no Permitida");
                }
            }
        }while(op!=6);
        sc.close();
    } 
}
