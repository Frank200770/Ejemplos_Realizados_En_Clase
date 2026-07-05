/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package L_Solid;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author frank
 */
public class L_Solid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Empleado> empleados = new ArrayList<>();
        Empleado empleado = null;
        
        int op =0;
        
        do
        {
            System.out.println("---- MENU PRINCIPAL ----");
            System.out.println("1. Ingresar Docente");
            System.out.println("2, Ingresar Administrativo");
            System.out.println("3. Ingresar Presonal de Servicio");
            System.out.println("4. Ingresar Pasante");
            System.out.println("5. Mostrar Datos");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opcion: ");
            op= sc.nextInt();
            sc.nextLine();
            
            switch (op) {
                case 1 -> {
                    empleado = new Docente();
                    
                    System.out.print("Ingrese el nombre: ");
                    empleado.setNombre(sc.nextLine());
                    System.out.print("Ingrese el Departamento: ");
                    empleado.setDepartamento(sc.nextLine());
                    System.out.print("Ingrese las Horas Trabajadas: ");
                    empleado.setHorasTrabajadas(sc.nextInt());
                    sc.nextLine();
                    
                    empleados.add(empleado);
                }
                    
                case 2 -> {
                    empleado = new Administrativo();
                    
                    System.out.print("Ingrese el nombre: ");
                    empleado.setNombre(sc.nextLine());
                    System.out.print("Ingrese el Departamento: ");
                    empleado.setDepartamento(sc.nextLine());
                    System.out.print("Ingrese las Horas Trabajadas: ");
                    empleado.setHorasTrabajadas(sc.nextInt());
                    sc.nextLine();
                    
                    empleados.add(empleado);
                }
                    
                case 3 -> {
                    empleado = new PersonalServicios();
                    
                    System.out.print("Ingrese el nombre: ");
                    empleado.setNombre(sc.nextLine());
                    System.out.print("Ingrese el Departamento: ");
                    empleado.setDepartamento(sc.nextLine());
                    System.out.print("Ingrese las Horas Trabajadas: ");
                    empleado.setHorasTrabajadas(sc.nextInt());
                    sc.nextLine();
                    
                    empleados.add(empleado);
                }
                    
                case 4 -> {
                    empleado = new Pasante();
                    
                    System.out.print("Ingrese el nombre: ");
                    empleado.setNombre(sc.nextLine());
                    System.out.print("Ingrese el Departamento: ");
                    empleado.setDepartamento(sc.nextLine());
                    System.out.print("Ingrese las Horas realizadas de Pasantia: ");
                    empleado.setHorasTrabajadas(sc.nextInt());
                    sc.nextLine();
                    
                    empleados.add(empleado);
                }
                    
                case 5 -> {
                    for(Empleado e: empleados)
                    {
                        e.mostrarDatos();
                    }
                }
                    
                case 6 -> System.out.println("SALIENDO............");
                    
                default -> System.out.println("INGRESE UNA OPCION VALIDA....");
            }
        }while(op != 6);
    }
    
}
