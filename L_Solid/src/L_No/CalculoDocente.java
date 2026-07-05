/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L_No;

/**
 *
 * @author frank
 */
public class CalculoDocente extends Empleado {

    @Override
    public double calcularSalario() {
        return horasTrabajadas * pagoXHoras;
    }

    @Override
    public void guardarDB() {
        System.out.println("Guardando en la Base de Datos");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("---- REPORTE ----");
        System.out.println("Nombres: " + nombre);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario: " + calcularSalario());
    }
    
}
