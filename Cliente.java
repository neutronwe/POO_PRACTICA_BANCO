
package com.mycompany.pruebadosbanco;
import java.util.Scanner;


public class Cliente {
    
    //Atributos
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String identificacion;
    protected String ciudadDomicilio;
    protected String telefono;
    
    //Constructor
    public Cliente() {
    }

    public Cliente(String nombre, String apellido, int edad, String identificacion, int direccion, String ciudadDomicilio, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.identificacion = identificacion;
        this.ciudadDomicilio = ciudadDomicilio;
        this.telefono = telefono;
    }
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCiudadDomicilio() {
        return ciudadDomicilio;
    }

    public void setCiudadDomicilio(String ciudadDomicilio) {
        this.ciudadDomicilio = ciudadDomicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    Scanner teclado = new Scanner (System.in);
    
    //Metodos
    public void ingresarDatos(){
        
        System.out.println("                                                   " );
        System.out.println("  -----------INGRESE SUS DATOS PERSONALES----------" );
        System.out.println(" |                                                 |");
        System.out.print(" | NOMBRE: "                                           );
        nombre = teclado.next();
        
        System.out.print(" | APELLIDO: "                                         );
        apellido = teclado.next();
        
        System.out.print(" | ANIO DE NACIMIENTO: "                               );
        int añoNacimiento = teclado.nextInt();
        int añoActual = 2024;
        edad = añoActual - añoNacimiento;
        
        System.out.print(" | CEDULA: "                                           );
        identificacion = teclado.next();
        
        System.out.print(" | CIUDAD DE DOMICILIO: "                              );
        ciudadDomicilio = teclado.next();
        
        System.out.print(" | TELEFONO: "                                         );
        telefono = teclado.next();
        System.out.println(" |                                                 |");
        System.out.println("  -------------------------------------------------" );
    }
    
    public int iterarIngresarDatos(){
        return 0;
    }
}