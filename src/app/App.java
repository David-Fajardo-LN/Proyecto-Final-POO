/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;

import Clases.Usuario;
import Clases.Libro;
import Clases.Bibliotecario;
import Clases.Prestamo;
import Clases.Sancion;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        ArrayList<Libro> libros = new ArrayList<Libro>();
        ArrayList<Bibliotecario> bibliotecarios = new ArrayList<Bibliotecario>();
        
        int op;
        
        do{
            System.out.println("=== SISTEMA BIBLIOTECARIO ===");
            System.out.println("1. Bibliotecarios");
            System.out.println("2. Usuarios");
            System.out.println("3. Libros");
            System.out.println("4. Prestamos");
            System.out.println("5. Salir");
            System.out.print("Escoja su opcion: ");
            
            op = sc.nextInt();
            
            switch(op){
                case 1:
                    menuBibliotecario(sc, bibliotecarios);break;
                case 2:
                    menuUsuarios(sc,usuarios);break;
                case 3:
                    menuLibro(sc,libros);break;
                case 4:
                    menuPrestamo(sc,usuarios,libros,bibliotecarios);break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    return;
            }
            
        }while(op!=5);
        
    }
    
    
    public static void menuBibliotecario(Scanner sc, ArrayList<Bibliotecario> bibliotecarios){
        int op;
        do{
            System.out.println("=== MENU DE BIBLIOTECARIOS ===");
            System.out.println("1. Mostrar informacion");
            System.out.println("2. Agregar bibliotecario");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            
            op = sc.nextInt();
            sc.nextLine();
            
            switch(op){
                case 1:
                    System.out.print("Ingrese el codigo de empleado: ");
                    String cod = sc.nextLine();
                    
                    for(Bibliotecario b: bibliotecarios){
                        if(b.getCodigo().equals(cod)){
                            System.out.println("Bibliotecario encontrado...");
                            System.out.println(b);
                            return;
                        }
                    }
                    System.out.println("Bibliotecario no encontrado...");
                    break;

                case 2:
                    System.out.println("=== DATOS BIBLIOTECARIO");
                    System.out.print("Codigo de empleado: ");
                    String codigo = sc.nextLine();
                    
                    for(Bibliotecario b : bibliotecarios){
                        if(b.getCodigo().equals(codigo)){
                            System.out.println("El codigo de empleado ya existe, intente nuevamente");
                            break;
                        }
                    }
                    
                    System.out.print("Nombres: ");
                    String nombre = sc.nextLine();
                    
                    System.out.print("Direccion: ");
                    String direccion = sc.nextLine();
                    
                    System.out.print("Numero telefonico: ");
                    String numT = sc.nextLine();
                    
                    System.out.print("Correo Electronico: ");
                    String corrE=sc.nextLine();
                    
                    Bibliotecario bibliotecario = new Bibliotecario(codigo, nombre, direccion, numT, corrE);
                    bibliotecarios.add(bibliotecario);
                    System.out.println("Bibliotecario agregado con exito...");
                    break;
                    
                case 3:
                    System.out.println("Saliendo del menu bibliotecarios...");
                    break;
                default:
                    System.out.println("Opcion invalida...");break;
            }
        }while(op!=3);
        
    }
    
    public static void menuUsuarios(Scanner sc, ArrayList<Usuario> usuarios){
        int op;
        do{
            System.out.println("== MENU DE USUARIOS ==");
            System.out.println("1. Mostrar informacion");
            System.out.println("2. Agregar usuario");
            System.out.println("3. Mostrar historial de prestamos de un usuario");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            
            op = sc.nextInt();
            sc.nextLine();
            
            switch(op){
                case 1:
                    System.out.print("Ingrese la cedula del usuario: ");
                    String cedula = sc.nextLine();
                    
                    for(Usuario u : usuarios){
                        if(u.getCodigo().equals(cedula)){
                            System.out.println("Usuario encontrado...");
                            System.out.println(u);
                            return;
                        }
                    }
                    System.out.println("Usuario no encontrado");break;
                    
                case 2:
                    
                    System.out.println("== INGRESAR INFORMACION DE USUARIO ==");
                    System.out.print("Cedula: ");
                    String ced= sc.nextLine();
                    
                    for(Usuario u: usuarios){
                        if(u.getCodigo().equals(ced)){
                            System.out.println("El usuario ya existe, intente nuevamente...");break;
                        }
                    }
                    
                    System.out.print("Nombres: ");
                    String nombre = sc.nextLine();
                    
                    System.out.print("Direccion: ");
                    String direccion = sc.nextLine();
                    
                    System.out.print("Numero Telefonico: ");
                    String numT= sc.nextLine();
                    
                    System.out.println("Correo Electronico: ");
                    String corrE= sc.nextLine();
                    
                    Usuario usuario = new Usuario(ced, nombre, direccion, numT, corrE);
                    usuarios.add(usuario);
                    System.out.println("Usuario agregado con exito...");break;
                    
                case 3:
                    System.out.print("Ingrese la cedula del usuario: ");
                    String cedu = sc.nextLine();
                    
                    for(Usuario u : usuarios){
                        if(u.getCodigo().equals(cedu)){
                            u.mostrarHistorialPrestamo();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del menu usuarios...");
                    break;
                default:
                    System.out.println("Opcion invalida...");break;
            }
        }while(op!=4);
    }
    
    public static void menuLibro(Scanner sc, ArrayList<Libro> libros){
        int op;
        do{
            System.out.println("=== MENU LIBROS ===");
            System.out.println("1. Mostrar informacion");
            System.out.println("2. Agregar libro");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            
            op = sc.nextInt();
            sc.nextLine();
            
            switch(op){
                case 1:
                    System.out.print("Ingrese el ISBN del libro: ");
                    String isbn = sc.nextLine();
                    
                    for(Libro l : libros){
                        if(l.getISBN().contains(isbn)){
                            System.out.println(l);break;
                        }
                    }
                    System.out.println("Libro no existente...");break;
                    
                case 2:
                    System.out.println("== INFORMACION DEL LIBRO ==");
                    System.out.print("ISBN del libro: ");
                    String ISBN = sc.nextLine();
                    
                    for(Libro l: libros){
                        if(l.getISBN().equals(ISBN)){
                            System.out.println("El ISBN ya existe...");
                            break;
                        }
                    }
                    
                    System.out.print("Titulo: ");
                    String titulo = sc.nextLine();
                    
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    
                    System.out.print("Genero: ");
                    String genero = sc.nextLine();
                    
                    System.out.print("Editorial: ");
                    String editorial = sc.nextLine();
                    
                    System.out.print("Anio de publicacion: ");
                    int anio = sc.nextInt();
                    
                    Libro libro = new Libro(true,ISBN,titulo,autor,genero,editorial,anio);
                    libros.add(libro);
                    System.out.println("Libro agregado con exito...");break;
                    
                    
                case 3:
                    System.out.println("Saliendo del menu de libro...");break;
                default:
                    System.out.println("Opcion invalida...");break;
            }
        }while(op!=3);
    }
    
    public static void menuPrestamo(Scanner sc, ArrayList<Usuario> usuarios, ArrayList<Libro> libros, ArrayList<Bibliotecario> bibliotecarios){
        int op;
        do{
            System.out.println("=== MENU DE PRESTAMOS ===");
            System.out.println("1. Generar Prestamo");
            System.out.println("2. Registrar devolucion");
            System.out.println("3. Pagar multa");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            
            op = sc.nextInt();
            sc.nextLine();
            
            switch(op){
                case 1:
                    System.out.println("=== INGRESE LOS DATOS PARA EL PRESTAMO ===");
                    System.out.print("Cedula del solicitante: ");
                    String cedula = sc.nextLine();
                    
                    Usuario usuario=null;
                    for(Usuario u: usuarios){
                        if(u.getCodigo().equals(cedula)){
                            usuario = u;break;
                        }
                    }if(usuario==null){
                        System.out.println("Usuario no existe...");break;
                    }if(usuario.tieneSancionPendiente()){
                        System.out.println("El usuario tiene una multa pendiente...");break;
                    }
                    if(usuario.tienePrestamoActivo()){
                        System.out.println("El usuario ya tiene un prestamo activo...");break;
                    }
                    
                    
                    System.out.print("ISBN del libro solicitado");
                    String ISBN = sc.nextLine();
                    
                    
                    Libro libro = null;
                    for(Libro l: libros){
                        if(l.getISBN().equals(ISBN)){
                            libro = l;break;
                        }
                    }if(libro==null){
                        System.out.println("Libro no existe...");break;
                    }
                    
                    System.out.print("Codigo del prestamo: ");
                    int codigo= sc.nextInt();
                    sc.nextLine();
                    
                    LocalDate fechaPrestamo = LocalDate.now();
                    LocalDate fechaLimite = fechaPrestamo.plusDays(3);
                    
                    Prestamo prestamo = new Prestamo(true,codigo, fechaPrestamo, fechaLimite, usuario,libro);
                    usuario.agregarPrestamo(prestamo);
                    System.out.println("Prestamo generado con exito...");
                    break;
                    
                case 2:
                    System.out.println("=== REGISTRAR DEVOLUCION ===");

                    System.out.print("Ingrese el codigo del bibliotecario: ");
                    String codBib = sc.nextLine();

                    Bibliotecario b = null;

                    for (Bibliotecario bi : bibliotecarios) {
                        if (bi.getCodigo().equals(codBib)) {
                            b = bi;
                            break;
                        }
                    }

                    if (b == null) {
                        System.out.println("Bibliotecario no encontrado...");
                        break;
                    }

                    System.out.print("Ingrese la cedula del usuario: ");
                    String ced = sc.nextLine();

                    Usuario usuario2 = null;

                    for (Usuario u : usuarios) {
                        if (u.getCodigo().equals(ced)) {
                            usuario2 = u;
                            break;
                        }
                    }

                    if (usuario2 == null) {
                        System.out.println("Usuario no encontrado...");
                        break;
                    }

                    System.out.print("Ingrese el codigo del prestamo: ");
                    int cod = sc.nextInt();
                    sc.nextLine();

                    Prestamo encontrado = null;

                    for (Prestamo p : usuario2.getPrestamos()) {
                        if (p.getCodigo() == cod) {
                            encontrado = p;
                            break;
                        }
                    }

                    if (encontrado == null) {
                        System.out.println("Prestamo no encontrado...");
                        break;
                    }
                    if (LocalDate.now().isAfter(encontrado.getFechaLimite())) {
                        System.out.println("Devolución tardía, se generará sanción de $30");

                        int monto = 30;
                        String motivo = "Retraso en la devolucion";

                        System.out.print("Ingrese codigo de sancion: ");
                        int codig = sc.nextInt();
                        sc.nextLine();

                        encontrado.crearSancion(true, codig, motivo, monto);

                        System.out.println("Sancion creada. No se puede registrar devolución aún...");
                        break;
                    }
                    b.registrarDevolucion(encontrado);

                    System.out.println("La devolucion fue registrada correctamente...");
                    break;
                    
                case 3:
                    System.out.println("== INGRESE LOS DATOS PARA PAGAR MULTA ==");
                    System.out.print("Cedula del usuario: ");
                    String cedu = sc.nextLine();

                    Usuario usuario3 = null;

                    for (Usuario u : usuarios) {
                        if (u.getCodigo().equals(cedu)) {
                            usuario3 = u;
                            break;
                        }
                    }

                    if (usuario3 == null) {
                        System.out.println("El usuario no existe...");
                        break;
                    }

                    if (!usuario3.tieneSancionPendiente()) {
                        System.out.println("El usuario no tiene sanciones pendientes");
                        break;
                    }

                    System.out.print("Ingrese el codigo de prestamo: ");
                    int cd = sc.nextInt();
                    sc.nextLine();

                    Prestamo p = usuario3.buscarPrestamo(cd);

                    if (p == null) {
                        System.out.println("Prestamo no encontrado...");
                        break;
                    }

                    Sancion s = p.getSancion();

                    if (s == null || !s.getEstado()) {
                        System.out.println("Este prestamo no tiene sancion activa");
                        break;
                    }

                    System.out.println("La multa en dolares: " + s.getMonto());

                    System.out.print("Ingrese la cantidad pagada: ");
                    int pago = sc.nextInt();
                    sc.nextLine();

                    if (pago == s.getMonto()) {
                        s.sancionInactiva();
                        System.out.println("Multa cancelada con exito...");
                    } else {
                        System.out.println("Cantidad incorrecta, no se proceso, intente otra vez...");
                    }
                    
                case 4:
                    System.out.println("Saliendo del menu de prestamos...");break;
                default:
                    System.out.println("Saliendo del menu de prestamos....");break;
            }
            
        }while(op!=5);
    }
    
}
