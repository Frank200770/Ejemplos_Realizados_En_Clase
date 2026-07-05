/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package o_No;

/**
 *
 * @author labesp
 */
public class CalcularSalario {
    public double calcularSalario(Empleado empleado){
        if(empleado.getTipoEmpleado() == 1){
            return empleado.getHorasTrabajadas()*20;
        }else if(empleado.getTipoEmpleado()==2){
            return empleado.getHorasTrabajadas()*15;
        }else if(empleado.getTipoEmpleado()==3){
            return empleado.getHorasTrabajadas()*10;
        }
        return 0;
    }
}
