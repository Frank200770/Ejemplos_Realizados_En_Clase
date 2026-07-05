/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package o_solid;

/**
 *
 * @author frank
 */
public class CalculoAdminstrativo implements ISalario{

    @Override
    public double calcularSalario(Empleado empleado) {
        return empleado.getHorasTrabajadas() * 15;
    }
    
    
}
