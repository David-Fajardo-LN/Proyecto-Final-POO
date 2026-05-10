/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.time.LocalDate;
import Clases.Sancion;

public class Prestamo {

    private boolean estado;
    private int codigo;
    private LocalDate fechaPrestamo;
    private LocalDate fechaLimite;
    private LocalDate fechaDevolucion;
    private Usuario usuario;
    private Libro libro;
    private Sancion sancion;

    public Prestamo() {
    }

    public Prestamo(boolean estado, int codigo, LocalDate fechaPrestamo, LocalDate fechaLimite, Usuario usuario, Libro libro) {
        this.estado = estado;
        this.codigo = codigo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaLimite = fechaLimite;
        this.usuario = usuario;
        this.libro = libro;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public boolean getEstado() {
        return estado;
    }

    public Sancion getSancion() {
        return sancion;
    }

    public void estaInactivo() {
        this.estado = false;
    }
    
    public void crearSancion(boolean estado, int codigo, String motivo, int monto) {
        this.sancion = new Sancion(estado,codigo,motivo, monto);
    }
}
