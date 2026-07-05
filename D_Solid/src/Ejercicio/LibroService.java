/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

/**
 *
 * @author labesp
 */
public class LibroService {
    private IGuardarBD guardar;

    public LibroService(IGuardarBD guardar) {
        this.guardar = guardar;
    }

    public void procesarLibro(Libro libro) {
        guardar.guardar(libro);
    }
}
