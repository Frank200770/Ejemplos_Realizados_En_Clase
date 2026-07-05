        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S_Solid;

/**
 *
 * @author frank
 */
public class CalcularSalario {
    public double calcular(Empleado empleado)
    {
        return empleado.getHorasTrabajadas() * empleado.getPagoHoras();
    }
}
