/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

/**
 *
 * @author labesp
 */
public class GuardarMongoDB implements IGuardarBD{
    @Override
    public void guardar(Libro libro) {
        System.out.println("Libro guardado correctamente en MongoDB");
    }
}
