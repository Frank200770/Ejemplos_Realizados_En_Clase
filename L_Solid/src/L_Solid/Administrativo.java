/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L_Solid;

/**
 *
 * @author frank
 */
public class Administrativo extends Empleado implements ICalcularSalario, IGuardarDB {

    @Override
    public void mostrarDatos() {
        System.out.println("---- INFORMACION ADMINISTRATIVO ----");
        System.out.println("Nombres: " + nombre);
        System.out.println("Departamento: " + departamento);
        System.out.println("Horas Trabajadas: " + horasTrabajadas);
        System.out.println("Salario: " + calcularSalario());
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * 15;
    }

    @Override
    public void guardarDB() {
        System.out.println("Informacion Guardada en la Base de Datoas");
    }
    
}