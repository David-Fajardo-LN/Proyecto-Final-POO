/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.ArrayList;
import Clases.Prestamo;

public class Bibliotecario extends Persona{
    
    private ArrayList<Prestamo> prestamos;
    
    
    public Bibliotecario(){
        prestamos = new ArrayList<Prestamo>();
    }
    public Bibliotecario(String codigo, String nombre, String Direccion, String numeroTelefonico, String correoElectronico) {
        super(codigo, nombre, Direccion, numeroTelefonico, correoElectronico);
        prestamos = new ArrayList<Prestamo>();
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
