/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
public class Persona {
    
    protected String codigo;
    protected String nombre;
    protected String direccion;
    protected String numeroTelefonico;
    protected String correoElectronico;

    public Persona(){}
    public Persona(String codigo, String nombre, String Direccion, String numeroTelefonico, String correoElectronico) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = Direccion;
        this.numeroTelefonico = numeroTelefonico;
        this.correoElectronico = correoElectronico;}

    public String getCodigo() {
        return codigo;}
    public void setCodigo(String codigo) {
        this.codigo = codigo;}
    
    public String getNombre() {
        return nombre;}
    public void setNombre(String nombre) {
        this.nombre = nombre;}

    public String getDireccion() {
        return direccion;}
    public void setDireccion(String direccion) {
        this.direccion = direccion;}

    public String getNumeroTelefonico() {
        return numeroTelefonico;}
    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;}

    public String getCorreoElectronico() {
        return correoElectronico;}
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;}
}
