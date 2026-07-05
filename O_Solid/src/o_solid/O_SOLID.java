/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package o_solid;
import java.util.Scanner;
/**
 *
 * @author labesp
 */
public class O_SOLID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        Empleado empleado = null;
        ISalario salario = null;
        
        int op=0, op2=0;
        do
        {
            System.out.println("---- MENU DE OPCIONES----");
            System.out.println("1. Ingrese Emepleado");
            System.out.println("2. Mostrar Datos");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opcion; ");
            op = sc.nextInt();
            sc.nextLine();
            
            switch (op) {
                case 1:
                    
                        empleado = new Empleado();
                        System.out.print("Ingrese el nombre: ");
                        empleado.setNombre(sc.nextLine());
                        System.out.print("Ingrese el Departamento: ");
                        empleado.setDepartamento(sc.nextLine());
                        System.out.print("Ingrese Horas Trabajadas: ");
                        empleado.setHorasTrabajadas(sc.nextInt());
                        sc.nextLine();
                        System.out.println("\nIngrese tipo de Empleado:");
                        System.out.println("1. Docente");
                        System.out.println("2. Administrativo");
                        System.out.println("3. Personal de Servicios");
                        System.out.print("Seleccione: ");
                        op2 = sc.nextInt();
                        sc.nextLine();
                        
                        switch (op2) {
                            case 1:
                                    salario = new CalculoDocente();
                                break;
                            case 2:
                                    salario = new CalculoAdminstrativo();
                                break;
                            case 3: 
                                    salario = new CalculoServicios();
                                break;
                            default:
                                System.out.println("INGRESE UNA OPCION VALIDA");
                        }
                    break;
                    
                case 2:
                    
                    MostrarDatos mostrar = new MostrarDatos(salario);
                    mostrar.reporte(empleado);
                    break;
                    
                    
                default:
                    System.out.println("Ingrese una opcuion correcta");
            }
        }while(op != 3);
    }
    
}
