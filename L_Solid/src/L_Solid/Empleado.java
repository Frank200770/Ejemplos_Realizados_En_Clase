/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L_Solid;

/**
 *
 * @author frank
 */
public abstract class Empleado {
    protected String nombre, departamento;
    protected int tipoEmpleado;
    protected double horasTrabajadas, pagoXHoras;

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

    public double getPagoXHoras() {
        return pagoXHoras;
    }

    public void setPagoXHoras(double pagoXHoras) {
        this.pagoXHoras = pagoXHoras;
    }
    
    public abstract void mostrarDatos();
}
