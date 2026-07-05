/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

/**
 *
 * @author labesp
 */
public class LibroFisico extends Libro{
    @Override
    public void mostrarDatos() {
        System.out.println("--- Informacion del Libro Fisico ---");
        System.out.println("Titulo: " + titulo +
                "\nAutor: " + autor);
    }
}
