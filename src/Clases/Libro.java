/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Date;

/**
 *
 * @author User
 */
public class Libro {
    private boolean disponibilidad;
    private String ISBN;
    private String titulo;
    private String autor;
    private String genero;
    private String editorial;
    private int fechaPublicacion;

    public Libro(){}

    public Libro(boolean disponibilidad, String ISBN, String titulo, String autor, String genero, String editorial, int fechaPublicacion) {
        this.disponibilidad = disponibilidad;
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
    }
    

    public String getISBN() {
        return ISBN;}
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;}

    public String getTitulo() {
        return titulo;}
    public void setTitulo(String titulo) {
        this.titulo = titulo;}

    public String getAutor() {
        return autor;}
    public void setAutor(String autor) {
        this.autor = autor;}

    public String getGenero() {
        return genero;}
    public void setGenero(String genero) {
        this.genero = genero;}

    public int getFechaPublicacion() {
        return fechaPublicacion;}
    
    public String toString(){
        String m="===INFORMACION DE LIBRO===";
        m+= "\nISBN: "+ISBN;
        m+= "\nTitulo: "+titulo;
        m+= "\nAutor: "+ autor;
        m+= "\nGenero: "+ genero;
        m+= "\nAnio de publicacion: "+ fechaPublicacion;
        return m;
    }
    
    public boolean estaDisponible(){
        if(disponibilidad){
            return true;
        }
        return false;
    }
}
