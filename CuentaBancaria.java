
package com.mycompany.pruebadosbanco;


import java.util.Scanner;


public class CuentaBancaria extends Cliente{
    
    //Atributos
    protected int saldo;
    protected String tipoCuenta;
    public int tipoNumCuenta;
    protected int opcion;
    
    //Contructor
    public CuentaBancaria() {
    }
    
    //
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public int getTipoNumCuenta() {
        return tipoNumCuenta;
    }

    public void setTipoNumCuenta(int tipoNumCuenta) {
        this.tipoNumCuenta = tipoNumCuenta;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public CuentaBancaria(int saldo, String tipoCuenta, String nombre, String apellido, int edad, String identificacion, int direccion, String ciudadDomicilio, String telefono) {
        super(nombre, apellido, edad, identificacion, direccion, ciudadDomicilio, telefono);
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
    
    //Getter and Setters
    Scanner teclado = new Scanner (System.in);
    
    //Metodos
    public void tipoCuentaBancaria(){
        
        
        System.out.println("                                                   " );
        System.out.println("  ------------------TIPO DE CUENTA-----------------");
        System.out.println(" |                                                 |");
        System.out.println(" | 1. Cuenta Corriente                             |");
        System.out.println(" | 2. Cuenta de Ahorros                            |");
        System.out.println("  -------------------------------------------------");
        
        System.out.println("\n  -------------------------------------------------");
        System.out.print(" | ESCOJA EL TIPO DE CUENTA BANCARIA: ");
        setTipoNumCuenta(teclado.nextInt()); 
        System.out.println("  -------------------------------------------------");
        
        if (tipoNumCuenta == 1){
            
            tipoCuenta = "Cuenta Corriente";
        }
        
        else {
            
            if(tipoNumCuenta == 2){
                
                tipoCuenta = "Cuenta de Ahorro";
            }
        } 
    }
    
    public int iterarTipoCuentaBancaria(){
        
        System.out.println(" | 1. Ingresar tipo de cuenta de nuevo             |");
        System.out.println(" | 2. Volver al inicio                             |");
        System.out.println("  -------------------------------------------------" );
        System.out.println("\n  -------------------------------------------------");
        System.out.print(" | DIGITE EL NUMERO DE LA OPCION: ");
        opcion = teclado.nextInt();
        System.out.println("  -------------------------------------------------");
        
        if (opcion == 1){
            
            tipoCuentaBancaria();
            System.out.println("                                                   " );
            System.out.println("  -------------------------------------------------" );
            System.out.println(" |                                                 |");
            System.out.println(" | Se guardo el tipo de cuenta: " + getTipoCuenta()  );
            return opcion;
        }
            
        else {
            
            setOpcion(4);
        }
        
        return opcion;
    }
}
