/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package o_solid;

/**
 *
 * @author frank
 */
public class MostrarDatos {
    private ISalario salario;

    public MostrarDatos(ISalario salario) {
        this.salario = salario;
    }
    
    public void reporte(Empleado empleado)
    {
        System.out.println("---- REPORTE ----");
        System.out.println("NOMBRE: " + empleado.getNombre());
        System.out.println("DEPARTAMENTO: " + empleado.getDepartamento());
        System.out.println("HORAS TRABAJADAS:" + empleado.getHorasTrabajadas());
        System.out.println("SALARIO: " + salario.calcularSalario(empleado));
    }
}
