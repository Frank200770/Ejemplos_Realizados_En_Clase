/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package o_No;

/**
 *
 * @author labesp
 */
public class MostrarDatos {
    public void mostrar(Empleado empleado){
        CalcularSalario salario = new CalcularSalario();
        System.out.println("---Datos del Empleado---");
        System.out.println("Empleado: "+empleado.getNombre()+
                "\nDepartamento: "+empleado.getDepartamento()+
                "\nSalario: "+salario.calcularSalario(empleado));
    }
}
