/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S_No;

/**
 *
 * @author frank
 */
public class Empleado {
    private String nombres, departamento;
    private double horasTrabajadas, pagoHoras;

    public Empleado() {
    }

    public Empleado(String nombres, String departamento, double horasTrabajadas, double pagoHoras) {
        this.nombres = nombres;
        this.departamento = departamento;
        this.horasTrabajadas = horasTrabajadas;
        this.pagoHoras = pagoHoras;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPagoHoras() {
        return pagoHoras;
    }

    public void setPagoHoras(double pagoHoras) {
        this.pagoHoras = pagoHoras;
    }
    
    public void calcularSalario()
    {
        double total = horasTrabajadas * pagoHoras;
        
        System.out.println("Sueldo: " + total);
    }
    
    public void guardarEmpleado()
    {
        System.out.println("Guardando Empleado en la base de datos ...");
    }
    
    public void generarReporte()
    {
        System.out.println("Reporte Generado");
    }
    
    public void imprimirReportes()
    {
        System.out.println("Imprimiendo Reporte");
    }
}
