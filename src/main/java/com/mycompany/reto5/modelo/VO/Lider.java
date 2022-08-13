/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto5.modelo.VO;

/**
 *
 * @author GMIPC
 */
public class Lider {
    private int id_lider;
    private String nombre;
    private String Primer_apellido;
    private String Ciudad_residencia; 
        

    public Lider() {
    }

    public Lider(int id_lider, String nombre, String Primer_apellido, String Ciudad_residencia) {
        this.id_lider = id_lider;
        this.nombre = nombre;
        this.Primer_apellido = Primer_apellido;
        this.Ciudad_residencia = Ciudad_residencia;
    }

    public int getId_lider() {
        return id_lider;
    }

    public void setId_lider(int id_lider) {
        this.id_lider = id_lider;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_apellido() {
        return Primer_apellido;
    }

    public void setPrimer_apellido(String Primer_apellido) {
        this.Primer_apellido = Primer_apellido;
    }

    public String getCiudad_residencia() {
        return Ciudad_residencia;
    }

    public void setCiudad_residencia(String Ciudad_residencia) {
        this.Ciudad_residencia = Ciudad_residencia;
    }

    @Override
    public String toString() {
        return "Lider{" + "id_lider=" + id_lider + ", nombre=" + nombre + ", Primer_apellido=" + Primer_apellido + ", Ciudad_residencia=" + Ciudad_residencia + '}';
    }
    


}