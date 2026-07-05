/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package d_solid;

/**
 *
 * @author labesp
 */
public class Docente extends Empleado{

    @Override
    public void mostrarDatos() {
        System.out.println("---Informacion del Docente---");
        System.out.println("Nombre: "+nombre+
                "\nDepartamento: "+departamento);
    }
}
