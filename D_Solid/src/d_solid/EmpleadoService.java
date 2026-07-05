/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package d_solid;

/**
 *
 * @author labesp
 */
public class EmpleadoService {
    // Clase de Alto Nivel
    
    // Atributos
    private IGuardarBD guardar;
    
    // Constructores
    public EmpleadoService(IGuardarBD guardar) {
        this.guardar = guardar;
    }
    
    // Métodos
    public void procesarEmpleado(Empleado empleado){
        guardar.guardar(empleado);
    }
}
