
package com.mycompany.pruebadosbanco;


public class CuentaAhorro extends CuentaBancaria implements Transacciones{ 
    
    private int valor = 0;

    @Override
    public int getSaldo() {
        return saldo;
    }
    
    
    @Override
    public void Depositar() {
        
        System.out.println("\n  -------------------------------------------------");
        System.out.print(" | INGRESE EL VALOR DEL DEPOSITO: ");
        valor = teclado.nextInt();
        System.out.println("  -------------------------------------------------");
        
        if (valor >= 5000){
            
            setSaldo(saldo + valor);
            System.out.println("                                                   " );
            System.out.println("  -------------------------------------------------" );
            System.out.println(" |                                                 |");
            System.out.println(" | Se deposito: " + valor + " exitosamente en su cuenta" );
            System.out.println("  -------------------------------------------------" );
        }
        
        else {
            
            if (valor < 5000){
                
                System.out.println("                                                   " );
                System.out.println("  -------------------------------------------------" );
                System.out.println(" |                                                 |");
                System.out.println(" | No fue posible hacer el deposito                |");
                System.out.println(" | Ingrese un valor valido mayor a 5 mil pesos!!!  |");
                System.out.println("  -------------------------------------------------" );
            }
        }
    }

    @Override
    public void Retirar() {
        
        System.out.println("\n  -------------------------------------------------");
        System.out.print(" | INGRESE EL VALOR A RETIRAR: ");
        valor = teclado.nextInt();
        System.out.println("  -------------------------------------------------");
        
        if (valor < 50000){
            
            System.out.println("                                                   " );
            System.out.println("  -------------------------------------------------" );
            System.out.println(" |                                                 |");
            System.out.println(" | No fue posible hacer el retiro                  |" );
            System.out.println(" | Ingrese un valor que no exeda los 50 mil pesos  |" );
            System.out.println("  -------------------------------------------------" );
        }
        
        else {
            
            if (valor > saldo){
                
                System.out.println("                                                   " );
                System.out.println("  -------------------------------------------------" );
                System.out.println(" |                                                 |");
                System.out.println(" | No fue posible hacer el retiro                  |" );
                System.out.println(" | El valor solicitado es mayor al saldo actual!!! |" );
                System.out.println("  -------------------------------------------------" );
            }
            
            else {
                
                if (valor >= 50000){
                    
                    setSaldo(saldo - valor);
                    System.out.println("                                                   " );
                    System.out.println("  -------------------------------------------------" );
                    System.out.println(" |                                                 |");
                    System.out.println(" | Se retiro: " + valor + " exitosamente de su cuenta" );
                    System.out.println("  -------------------------------------------------" );
                }
            }
        }
    }
}
