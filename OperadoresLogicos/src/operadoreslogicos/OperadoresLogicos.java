/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author Ohayou
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        
        System.out.println("Operador &&");//E
        r = (x<y && y<z)?true:false;
        System.out.println(r);
        r = (x<y && z<x)?true:false;
        System.out.println(r);
        
        System.out.println("\nOperador ||");//OU
        r = (x==z || z>y)?true:false;
        System.out.println(r);
        r = (y>z || x>y)?true:false;
        System.out.println(r);
        
        System.out.println("\nOperador ^");//XOU
        r = (x<z ^ z<y)?true:false;
        System.out.println(r);
        r = (y==z ^ x>y)?true:false;
        System.out.println(r);
    }
    
}
