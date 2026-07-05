/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package o_solid;

/**
 *
 * @author frank
 */
public class Empleado {
    private String nombre, departamento;
    private int tipoEmpleado;
    private double horasTrabajadas;

    public Empleado(String nombre, String departamento, int tipoEmpleado, double horasTrabajadas) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.tipoEmpleado = tipoEmpleado;
        this.horasTrabajadas = horasTrabajadas;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(int tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    
}
