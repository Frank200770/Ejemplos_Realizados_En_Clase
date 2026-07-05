/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package S_No;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Solid_No {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado = new Empleado();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre: ");
        empleado.setNombres(sc.nextLine());
        System.out.print("Ingrese Departamento: ");
        empleado.setDepartamento(sc.nextLine());
        System.out.print("Ingrese horas trabajadas: ");
        empleado.setHorasTrabajadas(sc.nextDouble());
        sc.nextLine();
        System.out.print("Ingrese pago Horas: ");
        empleado.setPagoHoras(sc.nextDouble());
        sc.nextLine();
        
        empleado.calcularSalario();
        empleado.generarReporte();
        empleado.guardarEmpleado();
        empleado.imprimirReportes();
    }
    
}
