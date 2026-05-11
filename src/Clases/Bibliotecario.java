/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.ArrayList;
import Clases.Prestamo;
import java.time.LocalDate;

public class Bibliotecario extends Persona{
    
    private ArrayList<Prestamo> prestamos;
    
    
    public Bibliotecario(){
        prestamos = new ArrayList<Prestamo>();
    }
    public Bibliotecario(String codigo, String nombre, String Direccion, String numeroTelefonico, String correoElectronico) {
        super(codigo, nombre, Direccion, numeroTelefonico, correoElectronico);
        prestamos = new ArrayList<Prestamo>();
    }
    
    public void registrarDevolucion(Prestamo prestamo) {
        if (prestamo != null) {
            prestamo.setFechaDevolucion(LocalDate.now());
            prestamo.estaInactivo();
            System.out.println("Devolucion registrada por: " + codigo);
        } else {
            System.out.println("Prestamo no valido");
        }
    }
    @Override
    public String toString() {
        String m = "===INFORMACION DEL BIBLIOTECARIO===";
        m += "\nCodigo: " + codigo;
        m += "\nNombre: " + nombre;
        m += "\nDireccion: " + direccion;
        m += "\nNumero Telefonico: " + numeroTelefonico;
        m += "\nCorreo Electronico: " + correoElectronico;
        return m;
    }
    
}
