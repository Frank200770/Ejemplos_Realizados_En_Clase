    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package S_Solid;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author frank
 */
public class S_Solid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Empleado empleado = null;
        int op;
        
        GenerarReporte reporte = new GenerarReporte();
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        do
        {
            System.out.println("----- MENU EMPLEADOS -----");   
            System.out.println("1. REGISTRAR EMPLEADOS");
            System.out.println("2. MOSTRAR EMPLEADOS");
            System.out.println("3. Generar PDF");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opcion; ");
            op = sc.nextInt();
            sc.nextLine();
            
            switch (op) {
                case 1:
                    empleado = new Empleado();
                    
                    System.out.print("Ingrese Nombres: ");
                    empleado.setNombres(sc.nextLine());
                    System.out.print("Ingrese Departamento: ");
                    empleado.setDepartamento(sc.nextLine());
                    System.out.print("Ingrese Horas Trabajadas: ");
                    empleado.setHorasTrabajadas(sc.nextDouble());
                    sc.nextLine();
                    System.out.print("Ingrese Pago Horas: ");
                    empleado.setPagoHoras(sc.nextDouble());
                    sc.nextLine();
                    
                    empleados.add(empleado);
                   
                    break;
                    
                case 2: 
                        
                    for(Empleado e: empleados)
                    {
                        reporte.mostrarEmpleado(e);
                    }
                    break;
                 
                case 3:
                        
                    reporte.generarPDF(empleados);
                        
                    break;
                    
                default:
                    System.out.println("Opcion INvalida.....");
            }
            
            
        }while(op != 4);
        
    }
    
}
