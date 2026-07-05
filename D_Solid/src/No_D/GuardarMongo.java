/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package No_D;

/**
 *
 * @author labesp
 */
public class GuardarMongo {
    public void guardar(Empleado empleado){
 
        System.out.println("Empleado "+empleado.getNombre());
        System.out.println("Departamento: "+empleado.getDepartamento());
        System.out.println("Se ha guardado correctamente en Mongo!!");
    }
}
