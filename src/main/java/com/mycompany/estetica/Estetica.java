/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estetica;

/**
 *
 * @author joacokbrl
 */
public class Estetica {
    
    private int nroTurno;
    private String horario;
    private String dia;
    private String cliente;
    private String zonaTrabajar;
    private String estilista;
    private String estado;
    private float precio;
    private String formaPago;

    public Estetica() {
        this.nroTurno = 0;
        this.horario = "";
        this.dia = "";
        this.cliente = "";
        this.zonaTrabajar = "";
        this.estilista = "";
        this.estado = "";
        this.precio = 0;
        this.formaPago = "";
    }

    public Estetica(int nroTurno, String horario, String dia, String cliente, String zonaTrabajar, String estilista, String estado, float precio, String formaPago) {
        this.nroTurno = nroTurno;
        this.horario = horario;
        this.dia = dia;
        this.cliente = cliente;
        this.zonaTrabajar = zonaTrabajar;
        this.estilista = estilista;
        this.estado = estado;
        this.precio = precio; 
        this.formaPago = formaPago;
    }

    public int getNroTurno() {
        return nroTurno;
    }

    public void setNroTurno(int nroTurno) {
        this.nroTurno = nroTurno;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getZonaTrabajar() {
        return zonaTrabajar;
    }

    public void setZonaTrabajar(String zonaTrabajar) {
        this.zonaTrabajar = zonaTrabajar;
    }

    public String getEstilista() {
        return estilista;
    }

    public void setEstilista(String estilista) {
        this.estilista = estilista;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
    
    public String toString (){
        return "Numero de turno: " + this.nroTurno + "El horario es: " + this.horario + "El dia es:" + this.dia + 
                "El nombre del cliente es: " + this.cliente + "La zona a trabajar es: " + this.zonaTrabajar + 
                "Nombre del estilista: " + this.estilista + "Estado: " + this.estado + "precio: " + this.precio + 
                "Forma de pago: " + this.formaPago;
    }
    
    private String comprobarDia (String dia) {
        if (dia == "Sabado" || dia == "Domingo"){
            return "Dia no disponible";
        } else {
            return "Dia disponible";
        }
    }
    }
