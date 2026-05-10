/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import Clases.Prestamo;
import java.util.ArrayList;

public class Usuario extends Persona{
    
    private ArrayList<Prestamo> prestamos;
    
    public ArrayList<Prestamo> getPrestamos(){
        return prestamos;
    } 

    public void setPrestamo(Prestamo p){
        prestamos.add(p);
    }
    
    public Usuario() {
        prestamos = new ArrayList<Prestamo>();
    }

    public Usuario(String codigo, String nombre, String Direccion, String numeroTelefonico, String correoElectronico) {
        super(codigo, nombre, Direccion, numeroTelefonico, correoElectronico);
    }
    
    public void mostrarHistorialPrestamo(){
        for(Prestamo p: prestamos){
            System.out.println(p);
        }
    }
    
    public boolean tienePrestamoActivo(){
        for(Prestamo p: prestamos){
            if(p.getEstado()){
                return true;
            }
        }
        return false;
    }
    
    public boolean tieneSancionPendiente(){
        for(Prestamo p: prestamos){
            if(p.getSancion()!=null){
                return true;
            }
        }
        return false;
    }
    
    public void prestamoInactivo(int cod){
        for(Prestamo p: prestamos){
            if(p.getCodigo()==cod){
                p.estaInactivo();
            }
        }
    }
    
    
}
