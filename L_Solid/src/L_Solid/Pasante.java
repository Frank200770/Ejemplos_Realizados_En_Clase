/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L_Solid;

/**
 *
 * @author frank
 */
public class Pasante extends Empleado implements IGuardarDB{

    @Override
    public void mostrarDatos() {
        System.out.println("---- INFORMACION PASANTE ----");
        System.out.println("Nombres: " + nombre);
        System.out.println("Departamento: " + departamento);
        System.out.println("Horas de Pasantia Realizadas: " + horasTrabajadas);
    }

    @Override
    public void guardarDB() {
        System.out.println("Guardando en la Base de Datos");
    }
    
    
}
