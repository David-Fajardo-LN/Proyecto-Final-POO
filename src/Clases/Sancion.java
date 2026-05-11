/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Sancion {
    private boolean estado;
    private int codigo;
    private String motivo;
    private int monto;
    
    public Sancion(){}
    public Sancion(boolean estado, int codigo, String motivo, int monto) {
        this.estado=estado;
        this.codigo = codigo;
        this.motivo = motivo;
        this.monto = monto;}

    public int getCodigo() {
        return codigo;}
    public void setCodigo(int codigo) {
        this.codigo = codigo;}

    public String getMotivo() {
        return motivo;}
    public void setMotivo(String motivo) {
        this.motivo = motivo;}

    public double getMonto() {
        return monto;}
    public void setMonto(int monto) {
        this.monto = monto;}
    
    public boolean getEstado(){
        return estado;
    }
    
    public void sancionInactiva(){
        this.estado=false;
    }
    
    public String toString(){
        String m= "===INFORMACION DE LA SANCION===";
        m+= "\nEstado: "+estado;
        m+= "\nCodigo: "+codigo;
        m+= "\nMotivo: "+motivo;
        m+= "\nMonto: "+monto; return m;}
}
