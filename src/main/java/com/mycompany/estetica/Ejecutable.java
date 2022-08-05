/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estetica;

/**
 *
 * @author joacokbrl
 */
public class Ejecutable {
        public static void main (String[] args){
            Estetica e1 = new Estetica();
            e1.setNroTurno(20);
            e1.setHorario("9:00");
            e1.setDia("martes");
            e1.setCliente("Armando Paredes");
            e1.setZonaTrabajar("Cabello");
            e1.setEstilista("Donato baez");
            e1.setEstado("Libre");
            e1.setPrecio(5000);
            e1.setFormaPago("tarjeta");
            
            System.out.println (e1.toString());
        }
}
