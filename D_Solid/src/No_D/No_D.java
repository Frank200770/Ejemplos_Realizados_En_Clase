/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package No_D;
import java.util.Scanner;
/**
 *
 * @author labesp
 */
public class No_D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Empleado empleado = new Empleado();
        System.out.println("Ingrese la siguiente informacion del empleado: ");
        System.out.print("Nombre: ");
        empleado.setNombre(sc.nextLine());
        System.out.print("Departamento: ");
        empleado.setDepartamento(sc.nextLine());
        
        EmpleadoService servicio = new EmpleadoService();
        servicio.guardarEmpleado(empleado);
    }
    
}
