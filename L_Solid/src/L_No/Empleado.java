/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L_No;

/**
 *
 * @author frank
 */
public abstract class Empleado {
    protected String nombre, departamento;
    protected int tipoEmpleado;
    protected double horasTrabajadas, pagoXHoras;
    
    public abstract double calcularSalario();
    public abstract void guardarDB();
    public abstract void mostrarDatos();
}
