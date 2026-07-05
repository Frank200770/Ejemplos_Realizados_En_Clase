/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package No_D;

/**
 *
 * @author labesp
 */
public class EmpleadoService {
    // Atributos
    private GuardarMongo guardar;
    
    // Métodos
    public EmpleadoService(){
        guardar  = new GuardarMongo();
    }
    
    public void guardarEmpleado(Empleado empleado){
        guardar.guardar(empleado);
    }
}
