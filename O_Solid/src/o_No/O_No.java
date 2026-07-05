/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package o_No;
import java.util.Scanner;
/**
 *
 * @author labesp
 */
public class O_No {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado = new Empleado();
        Scanner sc = new Scanner(System.in);
        MostrarDatos reportes = new MostrarDatos();
        System.out.println("Ingrese la siguiente informacion: ");
        System.out.print("Nombre: ");
        empleado.setNombre(sc.nextLine());
        System.out.print("Departamento: ");
        empleado.setDepartamento(sc.nextLine());
        System.out.println("Horas Trabajadas: ");
        empleado.setHorasTrabajadas(sc.nextDouble());
        sc.nextLine();
        System.out.println("Tipo de Empleado: ");
        empleado.setTipoEmpleado(sc.nextInt());
        sc.nextLine();
        System.out.println("Ingrese tipo de Empleado: \n1.Docente \n2.Administrativo \n3.Servicios");
        empleado.setTipoEmpleado(sc.nextInt());
        sc.nextLine();
        
        reportes.mostrar(empleado);
    }
    
}
