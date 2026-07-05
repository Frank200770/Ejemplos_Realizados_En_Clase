/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package d_solid;

/**
 *
 * @author labesp
 */
public class GuardarMySQL implements IGuardarBD{

    @Override
    public void guardar(Empleado empleado) {
        System.out.println("Empleado guardado correctamente en MySQL");
    }

}
