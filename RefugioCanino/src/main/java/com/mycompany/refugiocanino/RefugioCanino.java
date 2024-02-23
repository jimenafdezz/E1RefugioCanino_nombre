/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.refugiocanino;

/**
 *
 * @author DAW107
 */
public class RefugioCanino {
public static void main(String[] args) {
        	
        System.out.println("Bienvenido a la base de datos del refugio");
        
        // Crear una instancia del refugio
        RefugioCanino refugio = new RefugioCanino();

        // Agregar algunos perros al refugio
        refugio.agregarPerro("Max", "Labrador");
        refugio.agregarPerro("Bella", "Pastor Alemán");
        refugio.agregarPerro("Jade", "Pastor Belga");
        refugio.agregarPerro("Roma", "San Bernardo");

        // Mostrar la lista de perros en el refugio
        System.out.println("\nLista de perros en el refugio:");
        refugio.mostrarPerros();

        // Obtener y mostrar el número de perros en el refugio
        int numeroDePerros = refugio.obtenerNumeroDePerros();
        System.out.println("\nNúmero de perros en el refugio: " + numeroDePerros);

    }

    private void agregarPerro(String max, String labrador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void mostrarPerros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int obtenerNumeroDePerros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


