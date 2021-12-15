/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín3_4;
import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Boletin3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
    long cantidad;
    System.out.println(" cantidad de dinero: ");
    Scanner sc=new Scanner(System.in);
    cantidad=sc.nextInt(0);
    System.out.println(" cantidad de dinero= "+cantidad);
    
    long cien= cantidad/100;
    long veinte=cien/20;
    long cinco=veinte/5;
    long uno=cinco/1;
    
    System.out.println(" la cantidad total ="+cien+" billetes de cien "+veinte+ " billetes de veinte "+cinco+ " billetes de cinco "+uno+ " monedas de uno ");
   
    
    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
