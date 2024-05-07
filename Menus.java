
package com.mycompany.pruebadosbanco;



public class Menus extends CuentaBancaria{
    
    private int opcion = 0;
    
    CuentaAhorro cuentaAhorro = new CuentaAhorro();
    CuentaCorriente cuentaCorriente = new CuentaCorriente();
    CuentaBancaria cuentaBancaria = new CuentaBancaria();
    
    public void menuInicio(){
        
        int tipoCuentaSaldo = 0;
        String mensaje = "";
        
        if (tipoNumCuenta == 1){
            
            tipoCuentaSaldo = cuentaCorriente.getSaldo();
        }
        
        else {
            
            if (tipoNumCuenta == 2){
                
                tipoCuentaSaldo = cuentaAhorro.getSaldo(); 
            }
            
            else {
                
                if (tipoNumCuenta == 0){
                    
                    mensaje = " Agregue tipo de cuenta!!";
                }
                
                else {
                    
                    mensaje = "";
                }
            }
        }
        do {
            //System.out.println("Opcion: " + getOpcion());
            System.out.println("\n");
            System.out.println("  ----------------------INICO----------------------");
            System.out.println(" |                                                 |");
            System.out.println(" | NOMBRE: " + getNombre()                           );
            System.out.println(" | CUENTA: " + getTipoCuenta()                       );
            System.out.println(" | SALDO: " + tipoCuentaSaldo + mensaje              );
            System.out.println(" |                                                 |");
            System.out.println(" | 1. Cuenta Bancaria                              |");
            System.out.println(" | 2. Transaccion                                  |");
            System.out.println(" | 3. Informacion Personal                         |");
            System.out.println(" | 4. Salir                                        |");
            System.out.println("  -------------------------------------------------");
            
            System.out.println("\n  -------------------------------------------------");
            System.out.print(" | DIGITE EL NUMERO DE LA OPCION: ");
            opcion = teclado.nextInt();
            System.out.println("  -------------------------------------------------");
            
            switch (opcion){
            
            case 1 :
                menuCuentaBancaria();
                break;
                
            case 2 :
                menuTransacciones();
                break; 
            
            case 3 :
                menuInformacionCuenta();
                break;
            }
        }
        
        while (opcion != 4);
        
        System.out.println("SESION CERRADA");
    }
    
    public void menuCuentaBancaria(){
        
        do {
            
            System.out.println("                                                   " );
            System.out.println("  -----------------CUENTA BANCARIA-----------------" );
            System.out.println(" |                                                 |");
            System.out.println(" | 1. Tipo de Cuenta                               |");
            System.out.println(" | 2. Ingresar Datos de la Cuenta                  |");
            System.out.println(" | 3. Actualizar Datos de la Cuenta                |");
            System.out.println(" | 4. Regresar al inicio                           |");
            System.out.println("  -------------------------------------------------");
            
            
            System.out.println("\n  -------------------------------------------------");
            System.out.print(" | DIGITE EL NUMERO DE LA OPCION: ");
            opcion = teclado.nextInt();
            System.out.println("  -------------------------------------------------");
            
            switch (opcion){
            
                case 1:
                    tipoCuentaBancaria();
                    System.out.println("                                                   " );
                    System.out.println("  -------------------------------------------------" );
                    System.out.println(" |                                                 |");
                    System.out.println(" | Se guardo el tipo de cuenta: " + getTipoCuenta()  );
                    break;
                
                case 2 :
                    ingresarDatos();
                    System.out.println("                                                   " );
                    System.out.println("  -------------------------------------------------" );
                    System.out.println(" |                                                 |");
                    System.out.println(" | Datos guardados exitosamente                    |" );
                    break;
                
                case 3:
                    ingresarDatos();
                    System.out.println("                                                   " );
                    System.out.println("  -------------------------------------------------" );
                    System.out.println(" |                                                 |");
                    System.out.println(" | Datos guardados exitosamente                    |" );
                    break;
            }
            
            while (opcion == 2 || opcion == 3){
                
                //System.out.println(" |                                                 |");
                System.out.println(" | 1. Ingresar datos de nuevo                      |");
                System.out.println(" | 2. Volver al inicio                             |");
                System.out.println("  -------------------------------------------------" );
                
                System.out.println("\n  -------------------------------------------------");
                System.out.print(" | DIGITE EL NUMERO DE LA OPCION: ");
                opcion = teclado.nextInt();
                System.out.println("  -------------------------------------------------");
                
                if (opcion == 1){
                    
                    ingresarDatos();
                }
            
                else {
                
                   opcion = 4;
                }
            }
            
            /*while(opcion == 1){
              
                opcion = cuentaBancaria.iterarTipoCuentaBancaria();
                setTipoNumCuenta(cuentaBancaria.iterarIngresarDatos());
            }*/
   
            while (opcion == 1){
                
                System.out.println(" | 1. Ingresar tipo de cuenta de nuevo             |");
                System.out.println(" | 2. Volver al inicio                             |");
                System.out.println("  -------------------------------------------------" );
                //System.out.print("\n DIGITE EL NUMERO DE LA OPCION: ");
                
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
                }
            
                else {
                
                   opcion = 4;
                }
            }
        }
        
        while (opcion != 4);
        
        System.out.println("ya sali del switch!!!!");
        
        menuInicio();
    }
    
    public void menuTransacciones(){
        
        do {
            
            System.out.println("                                                   " );
            System.out.println("  ------------------TRANSACCIONES------------------" );
            System.out.println(" |                                                 |");
            System.out.println(" | 1. Depositar                                    |");
            System.out.println(" | 2. Retirar                                      |");
            System.out.println(" | 3. Regresar al inicio                           |");
            System.out.println("  -------------------------------------------------");
            
            
            System.out.println("\n  -------------------------------------------------");
            System.out.print(" | DIGITE EL NUMERO DE LA OPCION: ");
            opcion = teclado.nextInt();
            System.out.println("  -------------------------------------------------");
            
            switch (opcion){
                
                case 1 :
                    
                    if (tipoNumCuenta == 1){
                        
                        cuentaCorriente.Depositar();
                    }
                
                    else {
                        
                        if (tipoNumCuenta == 2){
                            
                            cuentaAhorro.Depositar();
                        }
                        
                        else {
                            
                            
                            System.out.println("                                                   " );
                            System.out.println("  -------------------------------------------------" );
                            System.out.println(" |                                                 |");
                            System.out.println(" | No es posible hacer una transaccion             |");
                            System.out.println(" | Debe agregar el tipo de cuenta primero!!!       |");
                            System.out.println("  -------------------------------------------------" );
                            System.out.println("                                                   " );
                            System.out.println("  ----------------INGRESE UNA OPCION---------------");
                            System.out.println(" |                                                 |");
                            System.out.println(" | 1. Ir a Tipo de Cuenta                          |");
                            System.out.println(" | 2. Ir a Inicio                                  |");
                            System.out.println("  -------------------------------------------------" );
                            System.out.println("\n  -------------------------------------------------");
                            System.out.print(" | DIGITE EL NUMERO DE LA OPCION: ");
                            opcion = teclado.nextInt();
                            System.out.println("  -------------------------------------------------");
                            
                            if (opcion == 2){
                                
                                opcion = 3;
                            }
                            
                            /*if (opcion == 1){   
                                
                                tipoCuentaBancaria();
                                System.out.println("                                                   " );
                                System.out.println("  -------------------------------------------------" );
                                System.out.println(" |                                                 |");
                                System.out.println(" | Se guardo el tipo de cuenta: " + getTipoCuenta()  );
                                tipoNumCuenta = cuentaBancaria.getOpcion();
                                break;
                            }*/
                            
                            if (opcion == 1){
                                
                                tipoCuentaBancaria();
                                System.out.println("                                                   " );
                                System.out.println("  -------------------------------------------------" );
                                System.out.println(" |                                                 |");
                                System.out.println(" | Se guardo el tipo de cuenta: " + getTipoCuenta()  );
                                
                                while (opcion == 1){
                                    
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
                                    }
            
                                    else {
                                        
                                        opcion = 3;
                                    }
                                }
                            }
                        }
                    }
                    
                    break;
                
                case 2 :
                    
                    if (tipoNumCuenta == 1){
                        
                        cuentaCorriente.Retirar();
                    }
                    
                    else {
                        
                        if(tipoNumCuenta == 2){
                            
                            cuentaAhorro.Retirar();
                        }
                        
                        else {
                            
                            System.out.println("                                                   " );
                            System.out.println("  -------------------------------------------------" );
                            System.out.println(" |                                                 |");
                            System.out.println(" | No es posible hacer una transaccion             |");
                            System.out.println(" | Debe agregar el tipo de cuenta primero!!!       |");
                            System.out.println("  -------------------------------------------------" );
                            System.out.println("                                                   " );
                            System.out.println("  ----------------INGRESE UNA OPCION---------------");
                            System.out.println(" |                                                 |");
                            
                            /*while(opcion == 1){
                                
                                opcion = cuentaBancaria.getOpcion();
                            }*/
                            
                            System.out.println(" | 1. Ir a Tipo de Cuenta                          |");
                            System.out.println(" | 2. Ir a Inicio                                  |");
                            System.out.println("  -------------------------------------------------" );
                            System.out.println("\n  -------------------------------------------------");
                            System.out.print(" | DIGITE EL NUMERO DE LA OPCION: ");
                            opcion = teclado.nextInt();
                            System.out.println("  -------------------------------------------------");
                            
                            if (opcion == 2){
                                
                                opcion = 3;
                            }
                            
                            if (opcion == 1){
                                
                                tipoCuentaBancaria();
                                System.out.println("                                                   " );
                                System.out.println("  -------------------------------------------------" );
                                System.out.println(" |                                                 |");
                                System.out.println(" | Se guardo el tipo de cuenta: " + getTipoCuenta()  );
                                
                                while (opcion == 1){
                                    
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
                                    }
            
                                    else {
                                        
                                        opcion = 3;
                                    }
                                }
                            }
                        }
                    }
                    
                    break;
            }
        }
        
        while (opcion != 3);
         
        menuInicio();
    }
    
    public void menuInformacionCuenta(){
        
         do {
            
            System.out.println("                                                   " );
            System.out.println("  ------------INFORMACION DE LA CUENTA-------------" );
            System.out.println(" |                                                 |");
            System.out.println(" | - Nombre: "+ getNombre() + "                    ");
            System.out.println(" | - Apellido: "+ getApellido()                     );
            System.out.println(" | - Edad: "+ getEdad()                             );
            System.out.println(" | - Cedula: "+ getIdentificacion()                 );
            System.out.println(" | - Ciudad de Domicilio: "+ getCiudadDomicilio()   );
            System.out.println(" | - Telefono: "+ getTelefono()                     );
            System.out.println(" |                                                 |");
            System.out.println(" | 1. Regresar al incio                            |");
            System.out.println("  -------------------------------------------------");
            
            
            System.out.println("\n  -------------------------------------------------");
            System.out.print(" | DIGITE EL NUMERO DE LA OPCION: ");
            opcion = teclado.nextInt();
            System.out.println("  -------------------------------------------------");
         }
        
         while (opcion != 1);
         
         menuInicio();
    }
}